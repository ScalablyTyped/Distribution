package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerNotificationMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", "getDefaultTarget")
  @js.native
  def getDefaultTarget(): js.UndefOr[String] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", "notifyHostChanged")
  @js.native
  def notifyHostChanged(id: String): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", "registerLayer")
  @js.native
  def registerLayer(hostId: String, callback: js.Function0[Unit]): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", "setDefaultTarget")
  @js.native
  def setDefaultTarget(): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", "setDefaultTarget")
  @js.native
  def setDefaultTarget(selector: String): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", "unregisterLayer")
  @js.native
  def unregisterLayer(hostId: String, callback: js.Function0[Unit]): Unit = js.native
}
