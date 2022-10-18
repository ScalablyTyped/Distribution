package typings.omitJs

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object omitMod {
  
  @JSImport("omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, K /* <: /* keyof T */ String */](obj: T, keys: js.Array[K]): Pick[T, Exclude[/* keyof T */ String, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Pick[T, Exclude[/* keyof T */ String, K]]]
}
