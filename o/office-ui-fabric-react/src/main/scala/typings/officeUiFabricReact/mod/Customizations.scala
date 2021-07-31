package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.customizationsMod.ICustomizations
import typings.uifabricUtilities.customizationsMod.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Customizations")
@js.native
class Customizations ()
  extends typings.officeUiFabricReact.utilitiesMod.Customizations
/* static members */
object Customizations {
  
  @JSImport("office-ui-fabric-react", "Customizations")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Customizations._raiseChange")
  @js.native
  def _raiseChange: js.Any = js.native
  @scala.inline
  def _raiseChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_raiseChange")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Customizations._suppressUpdates")
  @js.native
  def _suppressUpdates: js.Any = js.native
  @scala.inline
  def _suppressUpdates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_suppressUpdates")(x.asInstanceOf[js.Any])
  
  /** Used to run some code that sets Customizations without triggering an update until the end.
    * Useful for applying Customizations that don't affect anything currently rendered, or for
    * applying many customizations at once.
    * @param suppressUpdate - Do not raise the change event at the end, preventing all updates
    */
  @scala.inline
  def applyBatchedUpdates(code: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyBatchedUpdates")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def applyBatchedUpdates(code: js.Function0[Unit], suppressUpdate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBatchedUpdates")(code.asInstanceOf[js.Any], suppressUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Apply Customizations to a particular named scope, like a component.
    * @example Customizations.applyScopedSettings('Nav', \{ styles: () =\> \{\} \});
    */
  @scala.inline
  def applyScopedSettings(scopeName: String, settings: ISettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyScopedSettings")(scopeName.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Apply global Customization settings.
    * @example Customizations.applySettings(\{ theme: \{...\} \});
    */
  @scala.inline
  def applySettings(settings: ISettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applySettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getSettings(properties: js.Array[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getSettings(properties: js.Array[String], scopeName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any], localSettings.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getSettings(properties: js.Array[String], scopeName: Unit, localSettings: ICustomizations): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any], localSettings.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def observe(onChange: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(onChange.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  @scala.inline
  def unobserve(onChange: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(onChange.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
