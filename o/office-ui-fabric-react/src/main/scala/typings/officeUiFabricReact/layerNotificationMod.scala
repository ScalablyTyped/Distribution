package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerNotificationMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDefaultTarget(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTarget")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def notifyHostChanged(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyHostChanged")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerLayer(hostId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLayer")(hostId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultTarget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTarget")().asInstanceOf[Unit]
  @scala.inline
  def setDefaultTarget(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTarget")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unregisterLayer(hostId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterLayer")(hostId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
