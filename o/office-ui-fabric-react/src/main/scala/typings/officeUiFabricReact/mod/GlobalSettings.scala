package typings.officeUiFabricReact.mod

import typings.uifabricUtilities.globalSettingsMod.IChangeEventCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends typings.officeUiFabricReact.utilitiesMod.GlobalSettings
/* static members */
object GlobalSettings {
  
  @JSImport("office-ui-fabric-react", "GlobalSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addChangeListener(cb: IChangeEventCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getValue[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def getValue[T](key: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getValue[T](key: String, defaultValue: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def removeChangeListener(cb: IChangeEventCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChangeListener")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setValue[T](key: String, value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
}
