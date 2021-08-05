package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPreviewerActiveXCtrl extends StObject {
  
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
  
  inline def apply(
    ClearPreview: () => Double,
    ShowFilePreview: String => Double,
    ShowHitHighlightedFilePreview: (String, Double, Double, Double, Double, Double, js.Any, String) => Double
  ): IPreviewerActiveXCtrl = {
    val __obj = js.Dynamic.literal(ClearPreview = js.Any.fromFunction0(ClearPreview), ShowFilePreview = js.Any.fromFunction1(ShowFilePreview), ShowHitHighlightedFilePreview = js.Any.fromFunction8(ShowHitHighlightedFilePreview))
    __obj.asInstanceOf[IPreviewerActiveXCtrl]
  }
  
  extension [Self <: IPreviewerActiveXCtrl](x: Self) {
    
    inline def setClearPreview(value: () => Double): Self = StObject.set(x, "ClearPreview", js.Any.fromFunction0(value))
    
    inline def setShowFilePreview(value: String => Double): Self = StObject.set(x, "ShowFilePreview", js.Any.fromFunction1(value))
    
    inline def setShowHitHighlightedFilePreview(value: (String, Double, Double, Double, Double, Double, js.Any, String) => Double): Self = StObject.set(x, "ShowHitHighlightedFilePreview", js.Any.fromFunction8(value))
  }
}
