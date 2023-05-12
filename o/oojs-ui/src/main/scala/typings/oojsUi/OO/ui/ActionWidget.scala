package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.ActionWidget.Props
import typings.oojsUi.OO.ui.ActionWidget.Prototype
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ActionWidget is a {@link OO.ui.ButtonWidget button widget} that executes an action.
  * Action widgets are used with OO.ui.ActionSet, which manages the behavior and availability
  * of the actions.
  *
  * Both actions and action sets are primarily used with {@link OO.ui.Dialog Dialogs}.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Windows/Process_Dialogs#Action_sets)
  * for more information and examples.
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ActionWidget
  */
@js.native
trait ActionWidget
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object ActionWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.PendingElement.ConfigOptions {
    
    /** Symbolic name of the action (e.g., ‘continue’ or ‘cancel’). */
    var action: js.UndefOr[String] = js.undefined
    
    /**
      * Symbolic names of the modes (e.g., ‘edit’ or ‘read’) in which the action should be
      * made available. See the action set's {@link OO.ui.ActionSet.setMode setMode}
      * method for more information about setting modes.
      */
    var modes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setModes(value: js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
      
      inline def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[ActionWidget]
       with Instantiable1[/* config */ ConfigOptions, ActionWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.ButtonWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.ButtonWidget.Constructor = js.native
  }
  
  /**
    * @see https://www.mediawiki.org/wiki/OOUI/Elements/Flagged#ProcessDialog
    */
  /* Rewritten from type alias, can be one of: 
    - typings.oojsUi.oojsUiStrings.safe
    - typings.oojsUi.oojsUiStrings.back
    - typings.oojsUi.oojsUiStrings.close
    - typings.oojsUi.oojsUiStrings.progressive
    - typings.oojsUi.oojsUiStrings.destructive
    - typings.oojsUi.oojsUiStrings.primary
  */
  trait Flag extends StObject
  object Flag {
    
    inline def back: typings.oojsUi.oojsUiStrings.back = "back".asInstanceOf[typings.oojsUi.oojsUiStrings.back]
    
    inline def close: typings.oojsUi.oojsUiStrings.close = "close".asInstanceOf[typings.oojsUi.oojsUiStrings.close]
    
    inline def destructive: typings.oojsUi.oojsUiStrings.destructive = "destructive".asInstanceOf[typings.oojsUi.oojsUiStrings.destructive]
    
    inline def primary: typings.oojsUi.oojsUiStrings.primary = "primary".asInstanceOf[typings.oojsUi.oojsUiStrings.primary]
    
    inline def progressive: typings.oojsUi.oojsUiStrings.progressive = "progressive".asInstanceOf[typings.oojsUi.oojsUiStrings.progressive]
    
    inline def safe: typings.oojsUi.oojsUiStrings.safe = "safe".asInstanceOf[typings.oojsUi.oojsUiStrings.safe]
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget.Props
       with typings.oojsUi.OO.ui.mixin.PendingElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $button: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $pending: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $button = $button.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.ButtonWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.PendingElement.Prototype {
    
    /**
      * Get the symbolic name of the action (e.g., ‘continue’ or ‘cancel’).
      *
      * @return
      */
    def getAction(): String = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Get the symbolic name of the mode or modes for which the action is configured to be
      * available.
      *
      * The current mode is set with the action set's {@link OO.ui.ActionSet.setMode setMode}
      * method.
      * Only actions that are configured to be available in the current mode will be visible.
      * All other actions are hidden.
      *
      * @return
      */
    def getModes(): js.Array[String] = js.native
    
    /**
      * Check if the action is configured to be available in the specified `mode`.
      *
      * @param mode Name of mode
      * @return The action is configured with the mode
      */
    def hasMode(mode: String): Boolean = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.ButtonWidget.Static
}
