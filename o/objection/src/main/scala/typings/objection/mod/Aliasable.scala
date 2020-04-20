package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aliasable extends js.Object {
  def as(alias: String): this.type
}

object Aliasable {
  @scala.inline
  def apply(as: String => Aliasable): Aliasable = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as))
    __obj.asInstanceOf[Aliasable]
  }
}

