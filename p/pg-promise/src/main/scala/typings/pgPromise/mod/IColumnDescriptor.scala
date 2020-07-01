package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDescriptor[S] extends js.Object {
  var exists: Boolean
  var name: String
  var source: S
  var value: js.Any
}

object IColumnDescriptor {
  @scala.inline
  def apply[S](exists: Boolean, name: String, source: S, value: js.Any): IColumnDescriptor[S] = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDescriptor[S]]
  }
}

