package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDescriptor extends js.Object {
  var exists: Boolean
  var name: String
  var source: js.Any
  var value: js.Any
}

object IColumnDescriptor {
  @scala.inline
  def apply(exists: Boolean, name: String, source: js.Any, value: js.Any): IColumnDescriptor = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColumnDescriptor]
  }
}

