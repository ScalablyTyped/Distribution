package typings.nookies

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieSerializeOptions
import typings.setCookieParser.mod.Cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("nookies/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areCookiesEqual(a: Cookie, b: Cookie): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areCookiesEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createCookie(name: String, value: String, options: CookieSerializeOptions): Cookie = (^.asInstanceOf[js.Dynamic].applyDynamic("createCookie")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Cookie]
  
  inline def hasSameProperties(a: Dict[Any], b: Dict[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasSameProperties")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  type Dict[T] = StringDictionary[T]
}
