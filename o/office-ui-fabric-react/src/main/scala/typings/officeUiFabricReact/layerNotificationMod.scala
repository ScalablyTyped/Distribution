package typings.officeUiFabricReact

import typings.officeUiFabricReact.layerHostTypesMod.ILayerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerNotificationMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Layer/Layer.notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultTarget(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTarget")().asInstanceOf[js.UndefOr[String]]
  
  inline def getLayerCount(hostId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerCount")(hostId.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getLayerHost(hostId: String): js.UndefOr[ILayerHost] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerHost")(hostId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ILayerHost]]
  
  inline def notifyHostChanged(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyHostChanged")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerLayer(hostId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLayer")(hostId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerLayerHost(hostId: String, layerHost: ILayerHost): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLayerHost")(hostId.asInstanceOf[js.Any], layerHost.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultTarget(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTarget")().asInstanceOf[Unit]
  inline def setDefaultTarget(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTarget")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterLayer(hostId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterLayer")(hostId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterLayerHost(hostId: String, layerHost: ILayerHost): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterLayerHost")(hostId.asInstanceOf[js.Any], layerHost.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
