package typings.officeUiFabricReact.indexBundleMod

import typings.uifabricUtilities.customizationsMod.ICustomizations
import typings.uifabricUtilities.customizationsMod.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations")
@js.native
class Customizations ()
  extends typings.officeUiFabricReact.mod.Customizations
/* static members */
object Customizations {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations._raiseChange")
  @js.native
  def _raiseChange: js.Any = js.native
  @scala.inline
  def _raiseChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_raiseChange")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations._suppressUpdates")
  @js.native
  def _suppressUpdates: js.Any = js.native
  @scala.inline
  def _suppressUpdates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_suppressUpdates")(x.asInstanceOf[js.Any])
  
  /** Used to run some code that sets Customizations without triggering an update until the end.
    * Useful for applying Customizations that don't affect anything currently rendered, or for
    * applying many customizations at once.
    * @param suppressUpdate - Do not raise the change event at the end, preventing all updates
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.applyBatchedUpdates")
  @js.native
  def applyBatchedUpdates(code: js.Function0[Unit]): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.applyBatchedUpdates")
  @js.native
  def applyBatchedUpdates(code: js.Function0[Unit], suppressUpdate: Boolean): Unit = js.native
  
  /** Apply Customizations to a particular named scope, like a component.
    * @example Customizations.applyScopedSettings('Nav', \{ styles: () =\> \{\} \});
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.applyScopedSettings")
  @js.native
  def applyScopedSettings(scopeName: String, settings: ISettings): Unit = js.native
  
  /** Apply global Customization settings.
    * @example Customizations.applySettings(\{ theme: \{...\} \});
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.applySettings")
  @js.native
  def applySettings(settings: ISettings): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.getSettings")
  @js.native
  def getSettings(properties: js.Array[String]): js.Any = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.getSettings")
  @js.native
  def getSettings(properties: js.Array[String], scopeName: js.UndefOr[scala.Nothing], localSettings: ICustomizations): js.Any = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.getSettings")
  @js.native
  def getSettings(properties: js.Array[String], scopeName: String): js.Any = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.getSettings")
  @js.native
  def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.observe")
  @js.native
  def observe(onChange: js.Function0[Unit]): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.reset")
  @js.native
  def reset(): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Customizations.unobserve")
  @js.native
  def unobserve(onChange: js.Function0[Unit]): Unit = js.native
}
