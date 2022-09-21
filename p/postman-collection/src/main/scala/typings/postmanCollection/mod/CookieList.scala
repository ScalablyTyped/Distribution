package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "CookieList")
@js.native
open class CookieList protected () extends PropertyList[Cookie] {
  def this(parent: Any, cookies: js.Array[Cookie]) = this()
}
/* static members */
object CookieList {
  
  @JSImport("postman-collection", "CookieList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCookieList(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCookieList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
