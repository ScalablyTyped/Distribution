package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "CookieList")
@js.native
class CookieList protected () extends PropertyList[Cookie] {
  def this(parent: js.Any, cookies: js.Array[Cookie]) = this()
}
/* static members */
object CookieList {
  
  @JSImport("postman-collection", "CookieList")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isCookieList(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCookieList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
