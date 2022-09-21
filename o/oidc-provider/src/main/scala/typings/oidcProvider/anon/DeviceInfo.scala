package typings.oidcProvider.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.mod.UnknownObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInfo
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var client: typings.oidcProvider.mod.Client
  
  var deviceInfo: UnknownObject
  
  var grantId: String
  
  var params: UnknownObject
  
  var userCode: String
}
object DeviceInfo {
  
  inline def apply(
    client: typings.oidcProvider.mod.Client,
    deviceInfo: UnknownObject,
    grantId: String,
    params: UnknownObject,
    userCode: String
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], deviceInfo = deviceInfo.asInstanceOf[js.Any], grantId = grantId.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
  
  extension [Self <: DeviceInfo](x: Self) {
    
    inline def setClient(value: typings.oidcProvider.mod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDeviceInfo(value: UnknownObject): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    inline def setGrantId(value: String): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
    
    inline def setParams(value: UnknownObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
  }
}
