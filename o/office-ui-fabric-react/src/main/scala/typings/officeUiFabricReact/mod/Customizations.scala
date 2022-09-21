package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.customizationsMod.ICustomizations
import typings.uifabricUtilities.customizationsMod.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Customizations")
@js.native
open class Customizations ()
  extends typings.officeUiFabricReact.utilitiesMod.Customizations
/* static members */
object Customizations {
  
  @JSImport("office-ui-fabric-react", "Customizations")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Customizations._raiseChange")
  @js.native
  def _raiseChange: Any = js.native
  inline def _raiseChange_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_raiseChange")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "Customizations._suppressUpdates")
  @js.native
  def _suppressUpdates: Any = js.native
  inline def _suppressUpdates_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_suppressUpdates")(x.asInstanceOf[js.Any])
  
  /** Used to run some code that sets Customizations without triggering an update until the end.
    * Useful for applying Customizations that don't affect anything currently rendered, or for
    * applying many customizations at once.
    * @param suppressUpdate - Do not raise the change event at the end, preventing all updates
    */
  inline def applyBatchedUpdates(code: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyBatchedUpdates")(code.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyBatchedUpdates(code: js.Function0[Unit], suppressUpdate: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyBatchedUpdates")(code.asInstanceOf[js.Any], suppressUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Apply Customizations to a particular named scope, like a component.
    * @example Customizations.applyScopedSettings('Nav', \{ styles: () =\> \{\} \});
    */
  inline def applyScopedSettings(scopeName: String, settings: ISettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyScopedSettings")(scopeName.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Apply global Customization settings.
    * @example Customizations.applySettings(\{ theme: \{...\} \});
    */
  inline def applySettings(settings: ISettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applySettings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getSettings(properties: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getSettings(properties: js.Array[String], scopeName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any], localSettings.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getSettings(properties: js.Array[String], scopeName: Unit, localSettings: ICustomizations): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")(properties.asInstanceOf[js.Any], scopeName.asInstanceOf[js.Any], localSettings.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def observe(onChange: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(onChange.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  inline def unobserve(onChange: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(onChange.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
