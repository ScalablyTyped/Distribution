package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2LDiversityEquivalenceClass extends StObject {
  
  /** Size of the k-anonymity equivalence class. */
  var equivalenceClassSize: js.UndefOr[String] = js.undefined
  
  /** Number of distinct sensitive values in this equivalence class. */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.undefined
  
  /** Quasi-identifier values defining the k-anonymity equivalence class. The order is always the same as the original request. */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.undefined
  
  /** Estimated frequencies of top sensitive values. */
  var topSensitiveValues: js.UndefOr[js.Array[GooglePrivacyDlpV2ValueFrequency]] = js.undefined
}
object GooglePrivacyDlpV2LDiversityEquivalenceClass {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityEquivalenceClass]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LDiversityEquivalenceClassMutableBuilder[Self <: GooglePrivacyDlpV2LDiversityEquivalenceClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquivalenceClassSize(value: String): Self = StObject.set(x, "equivalenceClassSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquivalenceClassSizeUndefined: Self = StObject.set(x, "equivalenceClassSize", js.undefined)
    
    @scala.inline
    def setNumDistinctSensitiveValues(value: String): Self = StObject.set(x, "numDistinctSensitiveValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDistinctSensitiveValuesUndefined: Self = StObject.set(x, "numDistinctSensitiveValues", js.undefined)
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
    
    @scala.inline
    def setTopSensitiveValues(value: js.Array[GooglePrivacyDlpV2ValueFrequency]): Self = StObject.set(x, "topSensitiveValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopSensitiveValuesUndefined: Self = StObject.set(x, "topSensitiveValues", js.undefined)
    
    @scala.inline
    def setTopSensitiveValuesVarargs(value: GooglePrivacyDlpV2ValueFrequency*): Self = StObject.set(x, "topSensitiveValues", js.Array(value :_*))
  }
}
