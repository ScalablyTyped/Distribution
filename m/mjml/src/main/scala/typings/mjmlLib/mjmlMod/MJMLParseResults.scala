package typings
package mjmlLib.mjmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParseResults extends js.Object {
  var errors: js.Array[MJMLParseError]
  var html: java.lang.String
}

object MJMLParseResults {
  @scala.inline
  def apply(errors: js.Array[MJMLParseError], html: java.lang.String): MJMLParseResults = {
    val __obj = js.Dynamic.literal(errors = errors, html = html)
  
    __obj.asInstanceOf[MJMLParseResults]
  }
}

