package typings.pg.pgMod

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
    val __obj = js.Dynamic.literal(name = name, text = text, types = types)
  
    __obj.asInstanceOf[QueryParse]
  }
}

