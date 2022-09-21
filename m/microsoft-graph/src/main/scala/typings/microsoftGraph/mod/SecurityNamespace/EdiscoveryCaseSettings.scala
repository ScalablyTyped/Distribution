package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiscoveryCaseSettings
  extends StObject
     with Entity {
  
  // The OCR (Optical Character Recognition) settings for the case.
  var ocr: js.UndefOr[NullableOption[OcrSettings]] = js.undefined
  
  // The redundancy (near duplicate and email threading) detection settings for the case.
  var redundancyDetection: js.UndefOr[NullableOption[RedundancyDetectionSettings]] = js.undefined
  
  // The Topic Modeling (Themes) settings for the case.
  var topicModeling: js.UndefOr[NullableOption[TopicModelingSettings]] = js.undefined
}
object EdiscoveryCaseSettings {
  
  inline def apply(): EdiscoveryCaseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdiscoveryCaseSettings]
  }
  
  extension [Self <: EdiscoveryCaseSettings](x: Self) {
    
    inline def setOcr(value: NullableOption[OcrSettings]): Self = StObject.set(x, "ocr", value.asInstanceOf[js.Any])
    
    inline def setOcrNull: Self = StObject.set(x, "ocr", null)
    
    inline def setOcrUndefined: Self = StObject.set(x, "ocr", js.undefined)
    
    inline def setRedundancyDetection(value: NullableOption[RedundancyDetectionSettings]): Self = StObject.set(x, "redundancyDetection", value.asInstanceOf[js.Any])
    
    inline def setRedundancyDetectionNull: Self = StObject.set(x, "redundancyDetection", null)
    
    inline def setRedundancyDetectionUndefined: Self = StObject.set(x, "redundancyDetection", js.undefined)
    
    inline def setTopicModeling(value: NullableOption[TopicModelingSettings]): Self = StObject.set(x, "topicModeling", value.asInstanceOf[js.Any])
    
    inline def setTopicModelingNull: Self = StObject.set(x, "topicModeling", null)
    
    inline def setTopicModelingUndefined: Self = StObject.set(x, "topicModeling", js.undefined)
  }
}
