package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFSpecialObjectFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookup extends js.Object {
  var Deleted: Boolean
  val DisplayID: String
  val DisplayIDAvailable: Boolean
  var DisplayValue: String
  val Hidden: Boolean
  var Item: Double
  var ItemGUID: String
  val ObjectFlags: MFSpecialObjectFlag
  var ObjectType: MFBuiltInObjectType | Double
  var Version: Double
  def Clone(): ILookup
  def CloneFrom(Lookup: ILookup): Unit
  def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String
}

object ILookup {
  @scala.inline
  def apply(
    Clone: () => ILookup,
    CloneFrom: ILookup => Unit,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    DisplayValue: String,
    GetFormattedDisplayValue: (Boolean, Boolean, Boolean) => String,
    Hidden: Boolean,
    Item: Double,
    ItemGUID: String,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectType: MFBuiltInObjectType | Double,
    Version: Double
  ): ILookup = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted, DisplayID = DisplayID, DisplayIDAvailable = DisplayIDAvailable, DisplayValue = DisplayValue, GetFormattedDisplayValue = js.Any.fromFunction3(GetFormattedDisplayValue), Hidden = Hidden, Item = Item, ItemGUID = ItemGUID, ObjectFlags = ObjectFlags, ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version)
  
    __obj.asInstanceOf[ILookup]
  }
}

