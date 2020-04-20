package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInValueList
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
    val __obj = js.Dynamic.literal(AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwner = HasOwner.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OwnerID = OwnerID.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], ValueListID = ValueListID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItem]
  }
}

