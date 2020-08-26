package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFSpecialObjectFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILookup extends js.Object {
  var Deleted: Boolean = js.native
  val DisplayID: String = js.native
  val DisplayIDAvailable: Boolean = js.native
  var DisplayValue: String = js.native
  val Hidden: Boolean = js.native
  var Item: Double = js.native
  var ItemGUID: String = js.native
  val ObjectFlags: MFSpecialObjectFlag = js.native
  var ObjectType: MFBuiltInObjectType | Double = js.native
  var Version: Double = js.native
  def Clone(): ILookup = js.native
  def CloneFrom(Lookup: ILookup): Unit = js.native
  def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String = js.native
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetFormattedDisplayValue = js.Any.fromFunction3(GetFormattedDisplayValue), Hidden = Hidden.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookup]
  }
  @scala.inline
  implicit class ILookupOps[Self <: ILookup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => ILookup): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: ILookup => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayID(value: String): Self = this.set("DisplayID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayIDAvailable(value: Boolean): Self = this.set("DisplayIDAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("DisplayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFormattedDisplayValue(value: (Boolean, Boolean, Boolean) => String): Self = this.set("GetFormattedDisplayValue", js.Any.fromFunction3(value))
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemGUID(value: String): Self = this.set("ItemGUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectFlags(value: MFSpecialObjectFlag): Self = this.set("ObjectFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectType(value: MFBuiltInObjectType | Double): Self = this.set("ObjectType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}

