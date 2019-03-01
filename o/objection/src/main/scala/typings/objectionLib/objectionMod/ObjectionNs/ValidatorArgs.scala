package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorArgs extends js.Object {
  var ctx: ValidatorContext
  var json: Pojo
  var model: Model
  var options: ModelOptions
}

object ValidatorArgs {
  @scala.inline
  def apply(ctx: ValidatorContext, json: Pojo, model: Model, options: ModelOptions): ValidatorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctx")(ctx)
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ValidatorArgs]
  }
}

