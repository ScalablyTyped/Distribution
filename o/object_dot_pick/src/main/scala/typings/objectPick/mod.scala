package typings.objectPick

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: /* keyof T */ String */](`object`: T, keys: js.Array[U]): Pick[T, U] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Pick[T, U]]
  
  @JSImport("object.pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
