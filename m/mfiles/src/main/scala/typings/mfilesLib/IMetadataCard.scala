package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCard extends js.Object {
  val ActiveView: java.lang.String = js.native
  val DataModel: IMetadataCardModel = js.native
  val Events: IEvents = js.native
  val HitHighlightingActive: scala.Boolean = js.native
  val Location: java.lang.String = js.native
  val Minimized: scala.Boolean = js.native
  val Parent: js.Any = js.native
  val PreviewerVisible: scala.Boolean = js.native
  val PreviewerWidth: scala.Double = js.native
  val SearchHits: java.lang.String = js.native
  val Vault: IVault = js.native
  val Views: ICollection = js.native
  def GetApplyAction(): IMetadataCardAction = js.native
  def GetApplyAllAction(): IMetadataCardAction = js.native
  def GetCheckInImmediatelyOption(): IMetadataCardOption = js.native
  def GetDiscardAction(): IMetadataCardAction = js.native
  def GetFavoriteObjectOption(): IMetadataCardOption = js.native
  def GetFollowThisObjectOption(): IMetadataCardOption = js.native
  def GetHeight(): scala.Double = js.native
  def GetOpenForEditOption(): IMetadataCardOption = js.native
  def GetPopOutAction(): IMetadataCardAction = js.native
  def GetSkipAction(): IMetadataCardAction = js.native
  def GetUIData(key: java.lang.String, defaultData: js.Any): js.Any = js.native
  def GetUseAsDefaultsOption(): IMetadataCardOption = js.native
  def GetWidth(): scala.Double = js.native
  def IsModified(): scala.Boolean = js.native
  def IsOnMultiItemSequence(): scala.Boolean = js.native
  def IsPoppedOut(): scala.Boolean = js.native
  def PromptForValue(dialog: js.Any): scala.Boolean = js.native
  def ResumeAsyncOp(): scala.Unit = js.native
  def SetEditStateDirty(dirty: scala.Boolean): scala.Unit = js.native
  def SetHeight(Height: scala.Double): scala.Unit = js.native
  def SetLocation(location: java.lang.String): scala.Unit = js.native
  def SetMinimized(Minimized: scala.Boolean): scala.Unit = js.native
  def SetWidth(Width: scala.Double): scala.Unit = js.native
  def ShowMessage(message: java.lang.String): scala.Double = js.native
  def ShowMessage(message: IMessage): scala.Double = js.native
  def ShowNewObjectDialog(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType, defaultName: java.lang.String): js.Any = js.native
  def ShowNewObjectDialog(ObjectType: scala.Double, defaultName: java.lang.String): js.Any = js.native
  def ShowPermissionsDialog(): scala.Unit = js.native
  def StorePreviewerState(previewerVisible: scala.Boolean, previewerWidth: scala.Double): scala.Unit = js.native
  def StoreUIData(
    key: java.lang.String,
    data: js.Any,
    dataIsModeSpecific: scala.Boolean,
    dataIsLayoutSpecific: scala.Boolean,
    dataIsPermanent: scala.Boolean
  ): scala.Unit = js.native
  def SuspendAsyncOp(): scala.Unit = js.native
}

