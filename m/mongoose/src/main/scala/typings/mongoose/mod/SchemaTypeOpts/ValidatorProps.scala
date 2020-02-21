package typings.mongoose.mod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorProps extends js.Object {
  var path: String
  var value: js.Any
}

object ValidatorProps {
  @scala.inline
  def apply(path: String, value: js.Any): ValidatorProps = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidatorProps]
  }
}

