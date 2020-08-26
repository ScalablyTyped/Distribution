package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPreviewerActiveXCtrl extends js.Object {
  def ClearPreview(): Double = js.native
  def ShowFilePreview(bstrFilename: String): Double = js.native
  def ShowHitHighlightedFilePreview(
    bstrFilename: String,
    lObjType: Double,
    lObjID: Double,
    lObjVersion: Double,
    lFile: Double,
    lFileVersion: Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: String
  ): Double = js.native
}

object IPreviewerActiveXCtrl {
  @scala.inline
  def apply(
    ClearPreview: () => Double,
    ShowFilePreview: String => Double,
    ShowHitHighlightedFilePreview: (String, Double, Double, Double, Double, Double, js.Any, String) => Double
  ): IPreviewerActiveXCtrl = {
    val __obj = js.Dynamic.literal(ClearPreview = js.Any.fromFunction0(ClearPreview), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowHitHighlightedFilePreview = js.Any.fromFunction8(ShowHitHighlightedFilePreview))
    __obj.asInstanceOf[IPreviewerActiveXCtrl]
  }
  @scala.inline
  implicit class IPreviewerActiveXCtrlOps[Self <: IPreviewerActiveXCtrl] (val x: Self) extends AnyVal {
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
    def setClearPreview(value: () => Double): Self = this.set("ClearPreview", js.Any.fromFunction0(value))
    @scala.inline
    def setShowFilePreview(value: String => Double): Self = this.set("ShowFilePreview", js.Any.fromFunction1(value))
    @scala.inline
    def setShowHitHighlightedFilePreview(value: (String, Double, Double, Double, Double, Double, js.Any, String) => Double): Self = this.set("ShowHitHighlightedFilePreview", js.Any.fromFunction8(value))
  }
  
}

