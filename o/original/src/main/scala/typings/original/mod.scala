package typings.original

import typings.original.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(url: js.Object): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(url: Host): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("original", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the origins are the same.
    *
    * @param a URL or origin of a.
    * @param b URL or origin of b.
    * @returns true if origins are the same, false otherwise
    * @api public
    */
  inline def same(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("same")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
