package typings.mongoose.mongooseMod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumOpts[T] extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Array[T]] = js.undefined
}

object EnumOpts {
  @scala.inline
  def apply[T](message: String = null, values: js.Array[T] = null): EnumOpts[T] = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumOpts[T]]
  }
}

