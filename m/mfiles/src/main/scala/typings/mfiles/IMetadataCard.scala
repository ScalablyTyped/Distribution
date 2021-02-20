package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCard extends StObject {
  
  val ActiveView: String = js.native
  
  val DataModel: IMetadataCardModel = js.native
  
  val Events: IEvents = js.native
  
  def GetApplyAction(): IMetadataCardAction = js.native
  
  def GetApplyAllAction(): IMetadataCardAction = js.native
  
  def GetCheckInImmediatelyOption(): IMetadataCardOption = js.native
  
  def GetDiscardAction(): IMetadataCardAction = js.native
  
  def GetFavoriteObjectOption(): IMetadataCardOption = js.native
  
  def GetFollowThisObjectOption(): IMetadataCardOption = js.native
  
  def GetHeight(): Double = js.native
  
  def GetOpenForEditOption(): IMetadataCardOption = js.native
  
  def GetPopOutAction(): IMetadataCardAction = js.native
  
  def GetSkipAction(): IMetadataCardAction = js.native
  
  def GetUIData(key: String, defaultData: js.Any): js.Any = js.native
  
  def GetUseAsDefaultsOption(): IMetadataCardOption = js.native
  
  def GetWidth(): Double = js.native
  
  val HitHighlightingActive: Boolean = js.native
  
  def IsModified(): Boolean = js.native
  
  def IsOnMultiItemSequence(): Boolean = js.native
  
  def IsPoppedOut(): Boolean = js.native
  
  val Location: String = js.native
  
  val Minimized: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  val PreviewerVisible: Boolean = js.native
  
  val PreviewerWidth: Double = js.native
  
  def PromptForValue(dialog: js.Any): Boolean = js.native
  
  def ResumeAsyncOp(): Unit = js.native
  
  val SearchHits: String = js.native
  
  def SetEditStateDirty(dirty: Boolean): Unit = js.native
  
  def SetHeight(Height: Double): Unit = js.native
  
  def SetLocation(location: String): Unit = js.native
  
  def SetMinimized(Minimized: Boolean): Unit = js.native
  
  def SetWidth(Width: Double): Unit = js.native
  
  def ShowMessage(message: String): Double = js.native
  def ShowMessage(message: IMessage): Double = js.native
  
  def ShowNewObjectDialog(ObjectType: Double, defaultName: String): js.Any = js.native
  def ShowNewObjectDialog(ObjectType: MFBuiltInObjectType, defaultName: String): js.Any = js.native
  
  def ShowPermissionsDialog(): Unit = js.native
  
  def StorePreviewerState(previewerVisible: Boolean, previewerWidth: Double): Unit = js.native
  
  def StoreUIData(
    key: String,
    data: js.Any,
    dataIsModeSpecific: Boolean,
    dataIsLayoutSpecific: Boolean,
    dataIsPermanent: Boolean
  ): Unit = js.native
  
  def SuspendAsyncOp(): Unit = js.native
  
  val Vault: IVault = js.native
  
  val Views: ICollection = js.native
}
