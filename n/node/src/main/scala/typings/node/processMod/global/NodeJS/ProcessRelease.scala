package typings.node.processMod.global.NodeJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessRelease extends StObject {
  
  var headersUrl: js.UndefOr[String] = js.undefined
  
  var libUrl: js.UndefOr[String] = js.undefined
  
  var lts: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var sourceUrl: js.UndefOr[String] = js.undefined
}
object ProcessRelease {
  
  inline def apply(name: String): ProcessRelease = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRelease]
  }
  
  extension [Self <: ProcessRelease](x: Self) {
    
    inline def setHeadersUrl(value: String): Self = StObject.set(x, "headersUrl", value.asInstanceOf[js.Any])
    
    inline def setHeadersUrlUndefined: Self = StObject.set(x, "headersUrl", js.undefined)
    
    inline def setLibUrl(value: String): Self = StObject.set(x, "libUrl", value.asInstanceOf[js.Any])
    
    inline def setLibUrlUndefined: Self = StObject.set(x, "libUrl", js.undefined)
    
    inline def setLts(value: String): Self = StObject.set(x, "lts", value.asInstanceOf[js.Any])
    
    inline def setLtsUndefined: Self = StObject.set(x, "lts", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    
    inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
  }
}
