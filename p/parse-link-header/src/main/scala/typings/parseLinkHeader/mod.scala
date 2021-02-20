package typings.parseLinkHeader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-link-header", JSImport.Namespace)
  @js.native
  def apply(linkHeader: String): Links | Null = js.native
  
  @js.native
  trait Link extends /* queryParam */ StringDictionary[String] {
    
    var rel: String = js.native
    
    var url: String = js.native
  }
  object Link {
    
    @scala.inline
    def apply(rel: String, url: String): Link = {
      val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Links = StringDictionary[Link]
}
