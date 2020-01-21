package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NounInflector extends js.Object {
  def pluralize(token: String): String
  def singularize(token: String): String
}

object NounInflector {
  @scala.inline
  def apply(pluralize: String => String, singularize: String => String): NounInflector = {
    val __obj = js.Dynamic.literal(pluralize = js.Any.fromFunction1(pluralize), singularize = js.Any.fromFunction1(singularize))
  
    __obj.asInstanceOf[NounInflector]
  }
}

