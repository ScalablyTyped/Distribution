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
    ClearPreview: js.Function0[scala.Double],
    ShowFilePreview: js.Function1[java.lang.String, scala.Double],
    ShowHitHighlightedFilePreview: js.Function8[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Any, 
      java.lang.String, 
      scala.Double
    ]
  ): IPreviewerActiveXCtrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClearPreview")(ClearPreview)
    __obj.updateDynamic("ShowFilePreview")(ShowFilePreview)
    __obj.updateDynamic("ShowHitHighlightedFilePreview")(ShowHitHighlightedFilePreview)
    __obj.asInstanceOf[IPreviewerActiveXCtrl]
  }
}

