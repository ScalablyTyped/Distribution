package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.globalSettingsMod.IChangeEventCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends typings.officeUiFabricReact.utilitiesMod.GlobalSettings
/* static members */
object GlobalSettings {
  
  @JSImport("office-ui-fabric-react", "GlobalSettings.addChangeListener")
  @js.native
  def addChangeListener(cb: IChangeEventCallback): Unit = js.native
  
  @JSImport("office-ui-fabric-react", "GlobalSettings.getValue")
  @js.native
  def getValue[T](key: String): T = js.native
  @JSImport("office-ui-fabric-react", "GlobalSettings.getValue")
  @js.native
  def getValue[T](key: String, defaultValue: T): T = js.native
  @JSImport("office-ui-fabric-react", "GlobalSettings.getValue")
  @js.native
  def getValue[T](key: String, defaultValue: js.Function0[T]): T = js.native
  
  @JSImport("office-ui-fabric-react", "GlobalSettings.removeChangeListener")
  @js.native
  def removeChangeListener(cb: IChangeEventCallback): Unit = js.native
  
  @JSImport("office-ui-fabric-react", "GlobalSettings.setValue")
  @js.native
  def setValue[T](key: String, value: T): T = js.native
}
