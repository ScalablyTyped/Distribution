package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityReferenceView extends js.Object {
  var Id: java.lang.String
  var Name: java.lang.String
  var Type: java.lang.String
}

object IEntityReferenceView {
  @scala.inline
  def apply(Id: java.lang.String, Name: java.lang.String, Type: java.lang.String): IEntityReferenceView = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityReferenceView]
  }
}

