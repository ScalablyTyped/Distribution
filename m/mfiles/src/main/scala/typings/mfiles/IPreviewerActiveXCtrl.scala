package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreviewerActiveXCtrl extends js.Object {
  def ClearPreview(): Double
  def ShowFilePreview(bstrFilename: String): Double
  def ShowHitHighlightedFilePreview(
    bstrFilename: String,
    lObjType: Double,
    lObjID: Double,
    lObjVersion: Double,
    lFile: Double,
    lFileVersion: Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: String
  ): Double
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
}

