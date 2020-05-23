package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAutomaticPermissions
import typings.mfiles.IValueListItem
import typings.mfiles.MFiles.MFBuiltInValueList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ValueListItem")
@js.native
class ValueListItem () extends IValueListItem {
  /* CompleteClass */
  override var AutomaticPermissionsForObjects: IAutomaticPermissions = js.native
  /* CompleteClass */
  override val Deleted: Boolean = js.native
  /* CompleteClass */
  override val DisplayID: String = js.native
  /* CompleteClass */
  override val DisplayIDAvailable: Boolean = js.native
  /* CompleteClass */
  override var HasOwner: Boolean = js.native
  /* CompleteClass */
  override var HasParent: Boolean = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Icon: js.Array[Double] = js.native
  /* CompleteClass */
  override val ItemGUID: String = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var OwnerID: Double = js.native
  /* CompleteClass */
  override var ParentID: Double = js.native
  /* CompleteClass */
  override var ValueListID: MFBuiltInValueList | Double = js.native
  /* CompleteClass */
  override def Clone(): IValueListItem = js.native
  /* CompleteClass */
  override def CloneFrom(ValueListItem: IValueListItem): Unit = js.native
  /* CompleteClass */
  override def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double] = js.native
}

@JSGlobal("MFiles.ValueListItem")
@js.native
object ValueListItem extends Instantiable0[IValueListItem]

