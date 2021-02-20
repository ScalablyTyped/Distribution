package typings.officeUiFabricReact.indexBundleMod

import typings.uifabricUtilities.globalSettingsMod.IChangeEventCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends typings.officeUiFabricReact.mod.GlobalSettings
/* static members */
object GlobalSettings {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings.addChangeListener")
  @js.native
  def addChangeListener(cb: IChangeEventCallback): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings.getValue")
  @js.native
  def getValue[T](key: String): T = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings.getValue")
  @js.native
  def getValue[T](key: String, defaultValue: T): T = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings.getValue")
  @js.native
  def getValue[T](key: String, defaultValue: js.Function0[T]): T = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings.removeChangeListener")
  @js.native
  def removeChangeListener(cb: IChangeEventCallback): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings.setValue")
  @js.native
  def setValue[T](key: String, value: T): T = js.native
}
