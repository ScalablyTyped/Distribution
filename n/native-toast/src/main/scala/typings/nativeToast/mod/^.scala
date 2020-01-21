package typings.nativeToast.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("native-toast", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: ToastOptions): Toast = js.native
  def error(options: ToastOptions): Toast = js.native
  def info(options: ToastOptions): Toast = js.native
  def success(options: ToastOptions): Toast = js.native
  def warning(options: ToastOptions): Toast = js.native
}

