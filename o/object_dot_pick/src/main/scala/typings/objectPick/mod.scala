package typings.objectPick

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("object.pick", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T /* <: js.Object */, U /* <: /* keyof T */ String */](`object`: T, keys: js.Array[U]): Pick[T, U] = js.native
}
