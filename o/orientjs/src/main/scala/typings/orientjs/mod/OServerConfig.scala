package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OServerConfig extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object OServerConfig {
  
  @scala.inline
  def apply(): OServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OServerConfig]
  }
  
  @scala.inline
  implicit class OServerConfigMutableBuilder[Self <: OServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
