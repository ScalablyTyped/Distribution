package typings.objection.objectionMod

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
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidatorArgs]
  }
}

