package typings.omitJs

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("omit.js", JSImport.Default)
  @js.native
  def default[T, K /* <: /* keyof T */ String */](obj: T, keys: js.Array[K]): Pick[T, Exclude[/* keyof T */ String, K]] = js.native
}
