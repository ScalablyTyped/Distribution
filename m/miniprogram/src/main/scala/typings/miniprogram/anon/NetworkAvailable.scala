package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAvailable extends StObject {
  
  var networkAvailable: Boolean = js.native
  
  /**
    * Network type, UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN.
    */
  var networkType: String = js.native
}
object NetworkAvailable {
  
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: String): NetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAvailable]
  }
  
  @scala.inline
  implicit class NetworkAvailableMutableBuilder[Self <: NetworkAvailable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAvailable(value: Boolean): Self = StObject.set(x, "networkAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
