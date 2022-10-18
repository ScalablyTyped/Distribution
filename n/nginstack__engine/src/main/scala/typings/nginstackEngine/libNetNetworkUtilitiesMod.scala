package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNetNetworkUtilitiesMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/net/NetworkUtilities", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NetworkUtilities
  @JSImport("@nginstack/engine/lib/net/NetworkUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addressInNetworkRange(address: String, network: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addressInNetworkRange")(address.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def addressToNumber(address: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("addressToNumber")(address.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def findHosts(ids: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findHosts")(ids.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def findNetworks(address: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNetworks")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def findServices(host: Any, serviceClass: Any, port: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("findServices")(host.asInstanceOf[js.Any], serviceClass.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getNetworkRange(address: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkRange")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getNumberNetworkRange(address: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberNetworkRange")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def isIPv4Address(address: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4Address")(address.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def maskToNumber(mask: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maskToNumber")(mask.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def numberToAddress(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToAddress")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def numberToMask(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberToMask")(num.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait NetworkUtilities extends StObject {
    
    def findHosts(ids: String): js.Array[Double] = js.native
    def findHosts(ids: js.Array[String]): js.Array[Double] = js.native
    
    var findHostsCacheVersion: Any = js.native
    
    def findNetworks(ids: String): js.Array[Any] = js.native
    def findNetworks(ids: js.Array[Any]): js.Array[Any] = js.native
    
    var findNetworksCacheVersion: Any = js.native
    
    def findServices(ids: String, serviceClass: Double, port: Double): js.Array[Any] = js.native
    def findServices(ids: js.Array[Any], serviceClass: Double, port: Double): js.Array[Any] = js.native
    
    var hosts: Any = js.native
    
    var networks: Any = js.native
    
    var services: Any = js.native
  }
}
