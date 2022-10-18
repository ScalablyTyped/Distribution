package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDFaMetaTag
  extends StObject
     with BaseMetaTag
     with MetaTag {
  
  var httpEquiv: Unit
  
  var name: Unit
  
  var property: String
}
object RDFaMetaTag {
  
  inline def apply(content: String, httpEquiv: Unit, name: Unit, property: String): RDFaMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDFaMetaTag]
  }
  
  extension [Self <: RDFaMetaTag](x: Self) {
    
    inline def setHttpEquiv(value: Unit): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
