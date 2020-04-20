package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShortcutMappingInfo extends js.Object {
  var ObjectTypeGUID: String
  var ObjectTypeID: Double
  var ObjectTypeName: String
  var ObjectTypeSemanticAliases: ISemanticAliases
}

object IShortcutMappingInfo {
  @scala.inline
  def apply(
    ObjectTypeGUID: String,
    ObjectTypeID: Double,
    ObjectTypeName: String,
    ObjectTypeSemanticAliases: ISemanticAliases
  ): IShortcutMappingInfo = {
    val __obj = js.Dynamic.literal(ObjectTypeGUID = ObjectTypeGUID.asInstanceOf[js.Any], ObjectTypeID = ObjectTypeID.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any], ObjectTypeSemanticAliases = ObjectTypeSemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShortcutMappingInfo]
  }
}

