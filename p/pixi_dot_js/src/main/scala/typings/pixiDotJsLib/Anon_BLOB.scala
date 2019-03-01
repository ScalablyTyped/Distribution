package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BLOB extends js.Object {
  var BLOB: java.lang.String
  var BUFFER: java.lang.String
  var DEFAULT: java.lang.String
  var DOCUMENT: java.lang.String
  var JSON: java.lang.String
  var TEXT: java.lang.String
}

object Anon_BLOB {
  @scala.inline
  def apply(
    BLOB: java.lang.String,
    BUFFER: java.lang.String,
    DEFAULT: java.lang.String,
    DOCUMENT: java.lang.String,
    JSON: java.lang.String,
    TEXT: java.lang.String
  ): Anon_BLOB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BLOB")(BLOB)
    __obj.updateDynamic("BUFFER")(BUFFER)
    __obj.updateDynamic("DEFAULT")(DEFAULT)
    __obj.updateDynamic("DOCUMENT")(DOCUMENT)
    __obj.updateDynamic("JSON")(JSON)
    __obj.updateDynamic("TEXT")(TEXT)
    __obj.asInstanceOf[Anon_BLOB]
  }
}

