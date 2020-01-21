package typings.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParse extends js.Object {
  var name: String
  var text: String
  var types: js.Array[String]
}

object QueryParse {
  @scala.inline
  def apply(name: String, text: String, types: js.Array[String]): QueryParse = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryParse]
  }
}

