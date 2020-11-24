package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", JSImport.Namespace)
@js.native
object layerNotificationMod extends js.Object {
  
  def getDefaultTarget(): js.UndefOr[String] = js.native
  
  def notifyHostChanged(id: String): Unit = js.native
  
  def registerLayer(hostId: String, callback: js.Function0[Unit]): Unit = js.native
  
  def setDefaultTarget(): Unit = js.native
  def setDefaultTarget(selector: String): Unit = js.native
  
  def unregisterLayer(hostId: String, callback: js.Function0[Unit]): Unit = js.native
}
