package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValueListItem extends js.Object {
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  val Deleted: scala.Boolean
  val DisplayID: java.lang.String
  val DisplayIDAvailable: scala.Boolean
  var HasOwner: scala.Boolean
  var HasParent: scala.Boolean
  var ID: scala.Double
  var Icon: js.Array[scala.Double]
  val ItemGUID: java.lang.String
  var Name: java.lang.String
  var OwnerID: scala.Double
  var ParentID: scala.Double
  var ValueListID: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double
  def Clone(): IValueListItem
  def CloneFrom(ValueListItem: IValueListItem): scala.Unit
  def GetIconAsPNG(Width: scala.Double, Height: scala.Double): js.Array[scala.Double]
}

object IValueListItem {
  @scala.inline
  def apply(
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: () => IValueListItem,
    CloneFrom: IValueListItem => scala.Unit,
    Deleted: scala.Boolean,
    DisplayID: java.lang.String,
    DisplayIDAvailable: scala.Boolean,
    GetIconAsPNG: (scala.Double, scala.Double) => js.Array[scala.Double],
    HasOwner: scala.Boolean,
    HasParent: scala.Boolean,
    ID: scala.Double,
    Icon: js.Array[scala.Double],
    ItemGUID: java.lang.String,
    Name: java.lang.String,
    OwnerID: scala.Double,
    ParentID: scala.Double,
    ValueListID: mfilesLib.MFilesNs.MFBuiltInValueList | scala.Double
  ): IValueListItem = {
    val __obj = js.Dynamic.literal(AutomaticPermissionsForObjects = AutomaticPermissionsForObjects, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Deleted = Deleted, DisplayID = DisplayID, DisplayIDAvailable = DisplayIDAvailable, GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwner = HasOwner, HasParent = HasParent, ID = ID, Icon = Icon, ItemGUID = ItemGUID, Name = Name, OwnerID = OwnerID, ParentID = ParentID, ValueListID = ValueListID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IValueListItem]
  }
}

