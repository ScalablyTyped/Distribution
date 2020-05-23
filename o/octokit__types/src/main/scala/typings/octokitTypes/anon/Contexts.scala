package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contexts extends js.Object {
  var contexts: js.Array[String]
  var enforcement_level: String
}

object Contexts {
  @scala.inline
  def apply(contexts: js.Array[String], enforcement_level: String): Contexts = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], enforcement_level = enforcement_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contexts]
  }
}

