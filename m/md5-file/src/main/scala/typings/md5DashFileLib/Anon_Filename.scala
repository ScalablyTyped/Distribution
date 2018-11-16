package typings
package md5DashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Filename extends js.Object {
  var sync: js.Function1[/* filename */ java.lang.String, java.lang.String] = js.native
  def apply(
    filename: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* hash */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

