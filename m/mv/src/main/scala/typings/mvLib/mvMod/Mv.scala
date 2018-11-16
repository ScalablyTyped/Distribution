package typings
package mvLib.mvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mv extends js.Object {
  def apply(
    src: java.lang.String,
    dest: java.lang.String,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    src: java.lang.String,
    dest: java.lang.String,
    options: Options,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

