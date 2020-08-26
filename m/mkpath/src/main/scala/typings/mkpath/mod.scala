package typings.mkpath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkpath", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(path: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def apply(
    path: String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def apply(path: String, mode: Double): Unit = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def sync(path: String): Unit = js.native
  def sync(path: String, mode: Double): Unit = js.native
}

