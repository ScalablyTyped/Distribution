package typings.parseAuthor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-author", JSImport.Namespace)
  @js.native
  def apply(author: String): Author = js.native
  
  @js.native
  trait Author extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Author {
    
    @scala.inline
    def apply(): Author = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Author]
    }
    
    @scala.inline
    implicit class AuthorMutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
