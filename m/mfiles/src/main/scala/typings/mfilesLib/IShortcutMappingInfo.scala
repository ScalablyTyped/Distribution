package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShortcutMappingInfo extends js.Object {
  var ObjectTypeGUID: java.lang.String
  var ObjectTypeID: scala.Double
  var ObjectTypeName: java.lang.String
  var ObjectTypeSemanticAliases: ISemanticAliases
}

object IShortcutMappingInfo {
  @scala.inline
  def apply(
    ObjectTypeGUID: java.lang.String,
    ObjectTypeID: scala.Double,
    ObjectTypeName: java.lang.String,
    ObjectTypeSemanticAliases: ISemanticAliases
  ): IShortcutMappingInfo = {
    val __obj = js.Dynamic.literal(ObjectTypeGUID = ObjectTypeGUID, ObjectTypeID = ObjectTypeID, ObjectTypeName = ObjectTypeName, ObjectTypeSemanticAliases = ObjectTypeSemanticAliases)
  
    __obj.asInstanceOf[IShortcutMappingInfo]
  }
}

