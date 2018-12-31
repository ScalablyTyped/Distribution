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

