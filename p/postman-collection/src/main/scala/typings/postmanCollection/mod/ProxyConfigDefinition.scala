package typings.postmanCollection.mod

import typings.postmanCollection.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyConfigDefinition extends PropertyDefinition {
  
  var host: js.UndefOr[String] = js.native
  
  var `match`: js.UndefOr[String | Pattern | UrlMatchPattern] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var tunnel: js.UndefOr[Boolean] = js.native
}
object ProxyConfigDefinition {
  
  @scala.inline
  def apply(): ProxyConfigDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyConfigDefinition]
  }
  
  @scala.inline
  implicit class ProxyConfigDefinitionMutableBuilder[Self <: ProxyConfigDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setMatch(value: String | Pattern | UrlMatchPattern): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
  }
}
