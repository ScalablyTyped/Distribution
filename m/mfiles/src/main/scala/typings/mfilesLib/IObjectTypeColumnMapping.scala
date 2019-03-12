package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMapping extends js.Object {
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var Ordinal: scala.Double
  var PartOfInsert: scala.Boolean
  var PartOfUpdate: scala.Boolean
  var SourceField: java.lang.String
  var TargetPropertyDef: scala.Double
  var Type: scala.Double
  def Clone(): IObjectTypeColumnMapping
}

object IObjectTypeColumnMapping {
  @scala.inline
  def apply(
    Clone: () => IObjectTypeColumnMapping,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double,
    Ordinal: scala.Double,
    PartOfInsert: scala.Boolean,
    PartOfUpdate: scala.Boolean,
    SourceField: java.lang.String,
    TargetPropertyDef: scala.Double,
    Type: scala.Double
  ): IObjectTypeColumnMapping = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjectType = ObjectType.asInstanceOf[js.Any], Ordinal = Ordinal, PartOfInsert = PartOfInsert, PartOfUpdate = PartOfUpdate, SourceField = SourceField, TargetPropertyDef = TargetPropertyDef, Type = Type)
  
    __obj.asInstanceOf[IObjectTypeColumnMapping]
  }
}

