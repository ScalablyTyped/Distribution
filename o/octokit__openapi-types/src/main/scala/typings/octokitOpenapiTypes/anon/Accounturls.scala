package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accounturls extends StObject {
  
  /**
    * @description Full URLs for the social media profiles to delete.
    * @example []
    */
  var account_urls: js.Array[String]
}
object Accounturls {
  
  inline def apply(account_urls: js.Array[String]): Accounturls = {
    val __obj = js.Dynamic.literal(account_urls = account_urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounturls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accounturls] (val x: Self) extends AnyVal {
    
    inline def setAccount_urls(value: js.Array[String]): Self = StObject.set(x, "account_urls", value.asInstanceOf[js.Any])
    
    inline def setAccount_urlsVarargs(value: String*): Self = StObject.set(x, "account_urls", js.Array(value*))
  }
}
