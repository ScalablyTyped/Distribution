package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ValueListItem")
@js.native
class ValueListItem ()
  extends mfilesLib.IValueListItem {
  /* CompleteClass */
  override var AutomaticPermissionsForObjects: mfilesLib.IAutomaticPermissions = js.native
  /* CompleteClass */
  override val Deleted: scala.Boolean = js.native
  /* CompleteClass */
  override val DisplayID: java.lang.String = js.native
  /* CompleteClass */
  override val DisplayIDAvailable: scala.Boolean = js.native
  /* CompleteClass */
  override var HasOwner: scala.Boolean = js.native
  /* CompleteClass */
  override var HasParent: scala.Boolean = js.native
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Icon: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override val ItemGUID: java.lang.String = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override var OwnerID: scala.Double = js.native
  /* CompleteClass */
  override var ParentID: scala.Double = js.native
  /* CompleteClass */
  override var ValueListID: MFBuiltInValueList | scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IValueListItem = js.native
  /* CompleteClass */
  override def CloneFrom(ValueListItem: mfilesLib.IValueListItem): scala.Unit = js.native
  /* CompleteClass */
  override def GetIconAsPNG(Width: scala.Double, Height: scala.Double): js.Array[scala.Double] = js.native
}

@JSGlobal("MFiles.ValueListItem")
@js.native
object ValueListItem
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IValueListItem]

