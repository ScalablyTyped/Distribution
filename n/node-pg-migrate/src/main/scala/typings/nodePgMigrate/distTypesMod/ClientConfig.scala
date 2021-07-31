package typings.nodePgMigrate.distTypesMod

import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfig
  extends StObject
     with ConnectionConfig {
  
  var ssl: js.UndefOr[Boolean | TlsOptions] = js.undefined
}
object ClientConfig {
  
  @scala.inline
  def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  
  @scala.inline
  implicit class ClientConfigMutableBuilder[Self <: ClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSsl(value: Boolean | TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
