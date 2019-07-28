package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInValueList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItem extends js.Object {
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  val Deleted: Boolean
  val DisplayID: String
  val DisplayIDAvailable: Boolean
  var HasOwner: Boolean
  var HasParent: Boolean
  var ID: Double
  var Icon: js.Array[Double]
  val ItemGUID: String
  var Name: String
  var OwnerID: Double
  var ParentID: Double
  var ValueListID: MFBuiltInValueList | Double
  def Clone(): IValueListItem
  def CloneFrom(ValueListItem: IValueListItem): Unit
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double]
}

object IValueListItem {
  @scala.inline
  def apply(
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IValueListItem,
    CloneFrom: IValueListItem => Unit,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    GetIconAsPNG: (Double, Double) => js.Array[Double],
    HasOwner: Boolean,
    HasParent: Boolean,
    ID: Double,
    Icon: js.Array[Double],
    ItemGUID: String,
    Name: String,
    OwnerID: Double,
    ParentID: Double,
    ValueListID: MFBuiltInValueList | Double
  ): IValueListItem = {
    val __obj = js.Dynamic.literal(AutomaticPermissionsForObjects = AutomaticPermissionsForObjects, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted, DisplayID = DisplayID, DisplayIDAvailable = DisplayIDAvailable, GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwner = HasOwner, HasParent = HasParent, ID = ID, Icon = Icon, ItemGUID = ItemGUID, Name = Name, OwnerID = OwnerID, ParentID = ParentID, ValueListID = ValueListID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IValueListItem]
  }
}

