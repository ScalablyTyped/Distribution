package typings.parseLinkHeader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(linkHeader: String): Links | Null = ^.asInstanceOf[js.Dynamic].apply(linkHeader.asInstanceOf[js.Any]).asInstanceOf[Links | Null]
  
  @JSImport("parse-link-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Link
    extends StObject
       with /* queryParam */ StringDictionary[String] {
    
    var rel: String
    
    var url: String
  }
  object Link {
    
    inline def apply(rel: String, url: String): Link = {
      val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Links = StringDictionary[Link]
}
