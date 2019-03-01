package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookup extends js.Object {
  var Deleted: scala.Boolean
  val DisplayID: java.lang.String
  val DisplayIDAvailable: scala.Boolean
  var DisplayValue: java.lang.String
  val Hidden: scala.Boolean
  var Item: scala.Double
  var ItemGUID: java.lang.String
  val ObjectFlags: mfilesLib.MFilesNs.MFSpecialObjectFlag
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var Version: scala.Double
  def Clone(): ILookup
  def CloneFrom(Lookup: ILookup): scala.Unit
  def GetFormattedDisplayValue(
    Localized: scala.Boolean,
    EmptyLookupDispValuesAsHidden: scala.Boolean,
    AddDeletedSuffixIfDeleted: scala.Boolean
  ): java.lang.String
}

object ILookup {
  @scala.inline
  def apply(
    Clone: js.Function0[ILookup],
    CloneFrom: js.Function1[ILookup, scala.Unit],
    Deleted: scala.Boolean,
    DisplayID: java.lang.String,
    DisplayIDAvailable: scala.Boolean,
    DisplayValue: java.lang.String,
    GetFormattedDisplayValue: js.Function3[scala.Boolean, scala.Boolean, scala.Boolean, java.lang.String],
    Hidden: scala.Boolean,
    Item: scala.Double,
    ItemGUID: java.lang.String,
    ObjectFlags: mfilesLib.MFilesNs.MFSpecialObjectFlag,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double,
    Version: scala.Double
  ): ILookup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("Deleted")(Deleted)
    __obj.updateDynamic("DisplayID")(DisplayID)
    __obj.updateDynamic("DisplayIDAvailable")(DisplayIDAvailable)
    __obj.updateDynamic("DisplayValue")(DisplayValue)
    __obj.updateDynamic("GetFormattedDisplayValue")(GetFormattedDisplayValue)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("ItemGUID")(ItemGUID)
    __obj.updateDynamic("ObjectFlags")(ObjectFlags)
    __obj.updateDynamic("ObjectType")(ObjectType.asInstanceOf[js.Any])
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[ILookup]
  }
}

