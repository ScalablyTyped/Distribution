package typings.plottable

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/objectUtils", JSImport.Namespace)
@js.native
object objectUtilsMod extends js.Object {
  def assign[T /* <: Record[_, _] */](objs: Partial[T]*): T = js.native
}

