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
  
  inline def apply(): ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientConfig]
  }
  
  extension [Self <: ClientConfig](x: Self) {
    
    inline def setSsl(value: Boolean | TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
