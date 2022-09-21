package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StringDictionary
import typings.officeJsPreview.anon.InUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manages actions and keyboard shortcuts.
  */
trait Actions extends StObject {
  
  /**
    * Checks if a set of shortcut combinations are currently in use for the user, as defined by another add-in or by the host Office application.
    *
    * @remarks
    *
    * **Requirement sets**:
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/keyboard-shortcuts-requirement-sets | KeyboardShortcuts 1.1}
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    * 
    * @param shortcuts An array of shortcut combinations. For example, `["Ctrl+1", "Ctrl+2"]`. 
    * @returns A promise that resolves to an array of objects. Each object consists of a shortcut combination and Boolean value. The value is `true` if the shortcut combination conflicts with a shortcut of another add-in or with a shortcut of the Office application; otherwise, `false`. For example, `[{shortcut:"Ctrl+1", inUse:true},{shortcut:"Ctrl+2", inUse:false}]`.
    */
  def areShortcutsInUse(shortcuts: js.Array[String]): js.Promise[js.Array[InUse]]
  
  /**
    * Associates the ID or name of an action with a function. 
    * 
    * @param actionId The ID of an action that is defined in an extended manifest or the name of the function as specified in a **FunctionName** element in the manifest.
    * @param actionFunction The function that is run when the action is invoked. 
    */
  def associate(actionId: String, actionFunction: js.Function1[/* arg */ js.UndefOr[Any], Unit]): Unit
  
  /**
    * Gets the existing shortcuts for the add-in. The set always includes (1) the shortcuts defined in the add-in's extended manifest for keyboard shortcuts and (2) the current user's custom shortcuts if those exist.
    * The shortcut can be `null` if it conflicts with the shortcut of another add-in or with the Office application. Specifically, it would be `null` if, when prompted to choose which shortcut to use, the user didn't choose the action of the current add-in. For more information about conflicts with shortcuts, see  {@link https://learn.microsoft.com/office/dev/add-ins/design/keyboard-shortcuts#avoid-key-combinations-in-use-by-other-add-ins | Avoid key combinations in use by other add-ins}.
    *
    * @remarks
    *
    * **Requirement sets**:
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/keyboard-shortcuts-requirement-sets | KeyboardShortcuts 1.1}
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    * 
    * @returns A promise that resolves to an object of shortcuts, with keys being the IDs of the actions (as defined in an extended manifest) and values being the shortcut combinations. For example, `{"SetItalic": "Ctrl+1", "SetBold": "Ctrl+2", "SetUnderline": null}`.
    */
  def getShortcuts(): js.Promise[StringDictionary[String | Null]]
  
  /**
    * Replaces existing add-in shortcuts with custom shortcuts for the user.
    *
    * @remarks
    *
    * **Requirement sets**:
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/keyboard-shortcuts-requirement-sets | KeyboardShortcuts 1.1}
    * 
    * - {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    * 
    * @param shortcuts An object of custom shortcuts with keys being the IDs of the actions (as defined in an extended manifest) and values being the shortcut combinations. For example, `{"SetItalic": "Ctrl+1", "SetBold": "Ctrl+2"}`.
    * To learn how to specify a valid action ID and a key combination, see {@link https://learn.microsoft.com/office/dev/add-ins/design/keyboard-shortcuts | Add custom keyboard shortcuts to your Office Add-ins}. (Note that a key combination can be `null`, in which case, the action keeps the key combination specified in the JSON file.)
    * @returns A promise that resolves when every custom shortcut assignment in `shortcuts` has been registered. Even if there is a conflict with existing shortcuts, the customized shortcut will be registered.
    * Otherwise, the promise will be rejected with error code and error message. An "InvalidOperation" error code is returned if any action ID in `shortcuts` does not exist, or if shortcut combination is invalid.
    */
  def replaceShortcuts(shortcuts: StringDictionary[String]): js.Promise[Unit]
}
object Actions {
  
  inline def apply(
    areShortcutsInUse: js.Array[String] => js.Promise[js.Array[InUse]],
    associate: (String, js.Function1[/* arg */ js.UndefOr[Any], Unit]) => Unit,
    getShortcuts: () => js.Promise[StringDictionary[String | Null]],
    replaceShortcuts: StringDictionary[String] => js.Promise[Unit]
  ): Actions = {
    val __obj = js.Dynamic.literal(areShortcutsInUse = js.Any.fromFunction1(areShortcutsInUse), associate = js.Any.fromFunction2(associate), getShortcuts = js.Any.fromFunction0(getShortcuts), replaceShortcuts = js.Any.fromFunction1(replaceShortcuts))
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setAreShortcutsInUse(value: js.Array[String] => js.Promise[js.Array[InUse]]): Self = StObject.set(x, "areShortcutsInUse", js.Any.fromFunction1(value))
    
    inline def setAssociate(value: (String, js.Function1[/* arg */ js.UndefOr[Any], Unit]) => Unit): Self = StObject.set(x, "associate", js.Any.fromFunction2(value))
    
    inline def setGetShortcuts(value: () => js.Promise[StringDictionary[String | Null]]): Self = StObject.set(x, "getShortcuts", js.Any.fromFunction0(value))
    
    inline def setReplaceShortcuts(value: StringDictionary[String] => js.Promise[Unit]): Self = StObject.set(x, "replaceShortcuts", js.Any.fromFunction1(value))
  }
}
