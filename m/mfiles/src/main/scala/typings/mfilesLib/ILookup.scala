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
    val __obj = js.Dynamic.literal(Clone = Clone, CloneFrom = CloneFrom, Deleted = Deleted, DisplayID = DisplayID, DisplayIDAvailable = DisplayIDAvailable, DisplayValue = DisplayValue, GetFormattedDisplayValue = GetFormattedDisplayValue, Hidden = Hidden, Item = Item, ItemGUID = ItemGUID, ObjectFlags = ObjectFlags, ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version)
  
    __obj.asInstanceOf[ILookup]
  }
}

