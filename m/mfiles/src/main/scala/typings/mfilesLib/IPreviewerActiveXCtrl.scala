package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreviewerActiveXCtrl extends js.Object {
  def ClearPreview(): scala.Double
  def ShowFilePreview(bstrFilename: java.lang.String): scala.Double
  def ShowHitHighlightedFilePreview(
    bstrFilename: java.lang.String,
    lObjType: scala.Double,
    lObjID: scala.Double,
    lObjVersion: scala.Double,
    lFile: scala.Double,
    lFileVersion: scala.Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: java.lang.String
  ): scala.Double
}

object IPreviewerActiveXCtrl {
  @scala.inline
  def apply(
    ClearPreview: () => scala.Double,
    ShowFilePreview: java.lang.String => scala.Double,
    ShowHitHighlightedFilePreview: (java.lang.String, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, js.Any, java.lang.String) => scala.Double
  ): IPreviewerActiveXCtrl = {
    val __obj = js.Dynamic.literal(ClearPreview = js.Any.fromFunction0(ClearPreview), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowHitHighlightedFilePreview = js.Any.fromFunction8(ShowHitHighlightedFilePreview))
  
    __obj.asInstanceOf[IPreviewerActiveXCtrl]
  }
}

