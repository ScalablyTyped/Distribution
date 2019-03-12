package typings
package ncpLib.ncpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ncp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ncp(
    source: java.lang.String,
    destination: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def ncp(
    source: java.lang.String,
    destination: java.lang.String,
    options: Options,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

