package typings.moonjs.moonjsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoonConfig extends js.Object {
  var delimiters: js.Array[String]
  var prefix: String
  var silent: Boolean
  var version: String
  def keycodes(codemap: Record[String, Double]): Unit
}

object MoonConfig {
  @scala.inline
  def apply(
    delimiters: js.Array[String],
    keycodes: Record[String, Double] => Unit,
    prefix: String,
    silent: Boolean,
    version: String
  ): MoonConfig = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any], keycodes = js.Any.fromFunction1(keycodes), prefix = prefix.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MoonConfig]
  }
}

