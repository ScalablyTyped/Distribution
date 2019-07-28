package typings.mv.mvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mv extends js.Object {
  def apply(src: String, dest: String, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  def apply(src: String, dest: String, options: Options, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
}

