package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTML5MetaTag
  extends StObject
     with BaseMetaTag
     with MetaTag {
  
  var httpEquiv: Unit
  
  var name: String
  
  var property: Unit
}
object HTML5MetaTag {
  
  inline def apply(content: String, httpEquiv: Unit, name: String, property: Unit): HTML5MetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML5MetaTag]
  }
  
  extension [Self <: HTML5MetaTag](x: Self) {
    
    inline def setHttpEquiv(value: Unit): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Unit): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
