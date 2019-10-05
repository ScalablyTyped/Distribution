package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod.Global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedProperty[T] extends js.Object {
  var CanBeChanged: scala.Boolean
  var ManagedPropertyLogicalName: java.lang.String
  var Value: T
}

object ManagedProperty {
  @scala.inline
  def apply[T](CanBeChanged: scala.Boolean, ManagedPropertyLogicalName: java.lang.String, Value: T): ManagedProperty[T] = {
    val __obj = js.Dynamic.literal(CanBeChanged = CanBeChanged, ManagedPropertyLogicalName = ManagedPropertyLogicalName, Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManagedProperty[T]]
  }
}

