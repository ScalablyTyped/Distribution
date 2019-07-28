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
    val __obj = js.Dynamic.literal(ObjectTypeGUID = ObjectTypeGUID, ObjectTypeID = ObjectTypeID, ObjectTypeName = ObjectTypeName, ObjectTypeSemanticAliases = ObjectTypeSemanticAliases)
  
    __obj.asInstanceOf[IShortcutMappingInfo]
  }
}

