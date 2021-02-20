package typings.original

import typings.original.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("original", JSImport.Namespace)
  @js.native
  def apply(url: String): String = js.native
  @JSImport("original", JSImport.Namespace)
  @js.native
  def apply(url: js.Object): String = js.native
  @JSImport("original", JSImport.Namespace)
  @js.native
  def apply(url: Host): String = js.native
  
  /**
    * Check if the origins are the same.
    *
    * @param a URL or origin of a.
    * @param b URL or origin of b.
    * @returns true if origins are the same, false otherwise
    * @api public
    */
  @JSImport("original", "same")
  @js.native
  def same(a: String, b: String): Boolean = js.native
}
