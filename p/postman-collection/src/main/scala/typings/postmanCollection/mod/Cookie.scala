package typings.postmanCollection.mod

import typings.postmanCollection.anon.Key
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped postman-collection.postman-collection.CookieDefinition extends 'key' ? never : postman-collection.postman-collection.CookieDefinition */ @JSImport("postman-collection", "Cookie")
@js.native
class Cookie () extends PropertyBase[CookieDefinition] {
  def this(options: CookieDefinition) = this()
  
  var domain: String = js.native
  
  var expires: Date = js.native
  
  var extensions: js.UndefOr[js.Array[Key]] = js.native
  
  var hostOnly: js.UndefOr[Boolean] = js.native
  
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var session: js.UndefOr[Boolean] = js.native
  
  def update(options: CookieDefinition): Unit = js.native
  
  var value: js.UndefOr[String] = js.native
}
/* static members */
object Cookie {
  
  /** Check whether an object is an instance of PostmanCookie. */
  @JSImport("postman-collection", "Cookie.isCookie")
  @js.native
  def isCookie(obj: js.Any): Boolean = js.native
  
  /** Cookie header parser */
  @JSImport("postman-collection", "Cookie.parse")
  @js.native
  def parse(str: String): CookieDefinition = js.native
  
  /**
    * Converts the Cookie to a single Set-Cookie header string.
    */
  @JSImport("postman-collection", "Cookie.stringify")
  @js.native
  def stringify(cookie: CookieDefinition): String = js.native
  
  /** Stringifies an Array or {@link PropertyList} of Cookies into a single string. */
  @JSImport("postman-collection", "Cookie.unparse")
  @js.native
  def unparse(cookies: js.Array[CookieDefinition]): String = js.native
  
  /** Unparses a single Cookie. */
  @JSImport("postman-collection", "Cookie.unparseSingle")
  @js.native
  def unparseSingle(cookie: CookieDefinition): String = js.native
}
