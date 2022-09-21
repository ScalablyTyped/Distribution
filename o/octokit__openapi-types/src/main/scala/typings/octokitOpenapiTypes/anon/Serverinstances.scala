package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serverinstances extends StObject {
  
  var server_instances: js.UndefOr[js.Array[Hostname]] = js.undefined
}
object Serverinstances {
  
  inline def apply(): Serverinstances = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Serverinstances]
  }
  
  extension [Self <: Serverinstances](x: Self) {
    
    inline def setServer_instances(value: js.Array[Hostname]): Self = StObject.set(x, "server_instances", value.asInstanceOf[js.Any])
    
    inline def setServer_instancesUndefined: Self = StObject.set(x, "server_instances", js.undefined)
    
    inline def setServer_instancesVarargs(value: Hostname*): Self = StObject.set(x, "server_instances", js.Array(value*))
  }
}
