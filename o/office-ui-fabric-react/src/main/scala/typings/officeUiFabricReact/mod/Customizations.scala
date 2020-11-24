package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.customizationsMod.ICustomizations
import typings.uifabricUtilities.customizationsMod.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Customizations")
@js.native
class Customizations ()
  extends typings.officeUiFabricReact.utilitiesMod.Customizations
/* static members */
@JSImport("office-ui-fabric-react", "Customizations")
@js.native
object Customizations extends js.Object {
  
  var _raiseChange: js.Any = js.native
  
  var _suppressUpdates: js.Any = js.native
  
  /** Used to run some code that sets Customizations without triggering an update until the end.
    * Useful for applying Customizations that don't affect anything currently rendered, or for
    * applying many customizations at once.
    * @param suppressUpdate - Do not raise the change event at the end, preventing all updates
    */
  def applyBatchedUpdates(code: js.Function0[Unit]): Unit = js.native
  def applyBatchedUpdates(code: js.Function0[Unit], suppressUpdate: Boolean): Unit = js.native
  
  /** Apply Customizations to a particular named scope, like a component.
    * @example Customizations.applyScopedSettings('Nav', \{ styles: () =\> \{\} \});
    */
  def applyScopedSettings(scopeName: String, settings: ISettings): Unit = js.native
  
  /** Apply global Customization settings.
    * @example Customizations.applySettings(\{ theme: \{...\} \});
    */
  def applySettings(settings: ISettings): Unit = js.native
  
  def getSettings(properties: js.Array[String]): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: js.UndefOr[scala.Nothing], localSettings: ICustomizations): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: String): js.Any = js.native
  def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = js.native
  
  def observe(onChange: js.Function0[Unit]): Unit = js.native
  
  def reset(): Unit = js.native
  
  def unobserve(onChange: js.Function0[Unit]): Unit = js.native
}
