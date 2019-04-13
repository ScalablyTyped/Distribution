package typings
package md5DashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5-file", JSImport.Namespace)
@js.native
object md5DashFileMod extends js.Object {
  def apply(
    filename: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sync(filename: java.lang.String): java.lang.String = js.native
}

