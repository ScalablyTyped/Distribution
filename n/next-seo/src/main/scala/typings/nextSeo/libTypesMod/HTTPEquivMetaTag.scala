package typings.nextSeo.libTypesMod

import typings.nextSeo.nextSeoStrings.`content-security-policy`
import typings.nextSeo.nextSeoStrings.`content-type`
import typings.nextSeo.nextSeoStrings.`default-style`
import typings.nextSeo.nextSeoStrings.`x-ua-compatible`
import typings.nextSeo.nextSeoStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPEquivMetaTag
  extends StObject
     with BaseMetaTag
     with MetaTag {
  
  var httpEquiv: `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh
  
  var name: Unit
  
  var property: Unit
}
object HTTPEquivMetaTag {
  
  inline def apply(
    content: String,
    httpEquiv: `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh,
    name: Unit,
    property: Unit
  ): HTTPEquivMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPEquivMetaTag]
  }
  
  extension [Self <: HTTPEquivMetaTag](x: Self) {
    
    inline def setHttpEquiv(value: `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Unit): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
