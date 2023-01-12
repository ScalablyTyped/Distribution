package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedundancyDetectionSettings extends StObject {
  
  // Indicates whether email threading and near duplicate detection are enabled.
  var isEnabled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specifies the maximum number of words used for email threading and near duplicate detection. To learn more, see
    * Minimum/maximum number of words.
    */
  var maxWords: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies the minimum number of words used for email threading and near duplicate detection. To learn more, see
    * Minimum/maximum number of words.
    */
  var minWords: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Specifies the similarity level for documents to be put in the same near duplicate set. To learn more, see Document and
    * email similarity threshold.
    */
  var similarityThreshold: js.UndefOr[NullableOption[Double]] = js.undefined
}
object RedundancyDetectionSettings {
  
  inline def apply(): RedundancyDetectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedundancyDetectionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedundancyDetectionSettings] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: NullableOption[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledNull: Self = StObject.set(x, "isEnabled", null)
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setMaxWords(value: NullableOption[Double]): Self = StObject.set(x, "maxWords", value.asInstanceOf[js.Any])
    
    inline def setMaxWordsNull: Self = StObject.set(x, "maxWords", null)
    
    inline def setMaxWordsUndefined: Self = StObject.set(x, "maxWords", js.undefined)
    
    inline def setMinWords(value: NullableOption[Double]): Self = StObject.set(x, "minWords", value.asInstanceOf[js.Any])
    
    inline def setMinWordsNull: Self = StObject.set(x, "minWords", null)
    
    inline def setMinWordsUndefined: Self = StObject.set(x, "minWords", js.undefined)
    
    inline def setSimilarityThreshold(value: NullableOption[Double]): Self = StObject.set(x, "similarityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSimilarityThresholdNull: Self = StObject.set(x, "similarityThreshold", null)
    
    inline def setSimilarityThresholdUndefined: Self = StObject.set(x, "similarityThreshold", js.undefined)
  }
}
