package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: js.Object
  var height: String
  var rendered: on | off
}

object Content {
  @scala.inline
  def apply(content: js.Object, height: String, rendered: on | off): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

