package typings.ow.predicateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends PredicateOptions {
  var validators: js.Array[Validator[T]]
}

object Context {
  @scala.inline
  def apply[T](validators: js.Array[Validator[T]], optional: js.UndefOr[Boolean] = js.undefined): Context[T] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T]]
  }
}

