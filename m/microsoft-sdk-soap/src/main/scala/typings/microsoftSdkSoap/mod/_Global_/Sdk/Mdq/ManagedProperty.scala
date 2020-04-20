package typings.microsoftSdkSoap.mod._Global_.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedProperty[T] extends js.Object {
  var CanBeChanged: Boolean
  var ManagedPropertyLogicalName: String
  var Value: T
}

object ManagedProperty {
  @scala.inline
  def apply[T](CanBeChanged: Boolean, ManagedPropertyLogicalName: String, Value: T): ManagedProperty[T] = {
    val __obj = js.Dynamic.literal(CanBeChanged = CanBeChanged.asInstanceOf[js.Any], ManagedPropertyLogicalName = ManagedPropertyLogicalName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedProperty[T]]
  }
}

