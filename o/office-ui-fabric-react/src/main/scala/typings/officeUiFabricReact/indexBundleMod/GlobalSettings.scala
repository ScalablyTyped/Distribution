package typings.officeUiFabricReact.indexBundleMod

import typings.uifabricUtilities.globalSettingsMod.IChangeEventCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends typings.officeUiFabricReact.mod.GlobalSettings
/* static members */
object GlobalSettings {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GlobalSettings")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChangeListener(cb: IChangeEventCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getValue[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def getValue[T](key: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getValue[T](key: String, defaultValue: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def removeChangeListener(cb: IChangeEventCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChangeListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setValue[T](key: String, value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
}
