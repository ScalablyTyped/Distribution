package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoonConfig extends js.Object {
  var delimiters: js.Array[java.lang.String]
  var prefix: java.lang.String
  var silent: scala.Boolean
  var version: java.lang.String
  def keycodes(codemap: stdLib.Record[java.lang.String, scala.Double]): scala.Unit
}

object MoonConfig {
  @scala.inline
  def apply(
    delimiters: js.Array[java.lang.String],
    keycodes: js.Function1[stdLib.Record[java.lang.String, scala.Double], scala.Unit],
    prefix: java.lang.String,
    silent: scala.Boolean,
    version: java.lang.String
  ): MoonConfig = {
    val __obj = js.Dynamic.literal(delimiters = delimiters, keycodes = keycodes, prefix = prefix, silent = silent, version = version)
  
    __obj.asInstanceOf[MoonConfig]
  }
}

