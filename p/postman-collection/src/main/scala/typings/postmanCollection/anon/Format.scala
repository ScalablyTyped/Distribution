package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: String
  var source: String
}

object Format {
  @scala.inline
  def apply(format: String, source: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

