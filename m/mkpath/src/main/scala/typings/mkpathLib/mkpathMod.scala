package typings
package mkpathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkpath", JSImport.Namespace)
@js.native
object mkpathMod extends js.Object {
  def apply(path: java.lang.String): scala.Unit = js.native
  def apply(path: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def apply(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def apply(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def sync(path: java.lang.String): scala.Unit = js.native
  def sync(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
}

