package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateChainValidationEngineVerifyParams extends StObject {
  
  var initialExcludedSubtreesSet: js.UndefOr[js.Array[GeneralSubtree]] = js.undefined
  
  var initialExplicitPolicy: js.UndefOr[Boolean] = js.undefined
  
  var initialInhibitPolicy: js.UndefOr[Boolean] = js.undefined
  
  var initialPermittedSubtreesSet: js.UndefOr[js.Array[GeneralSubtree]] = js.undefined
  
  var initialPolicyMappingInhibit: js.UndefOr[Boolean] = js.undefined
  
  var initialPolicySet: js.UndefOr[js.Array[String]] = js.undefined
  
  var initialRequiredNameForms: js.UndefOr[js.Array[GeneralSubtree]] = js.undefined
  
  var passedWhenNotRevValues: js.UndefOr[Boolean] = js.undefined
}
object CertificateChainValidationEngineVerifyParams {
  
  inline def apply(): CertificateChainValidationEngineVerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateChainValidationEngineVerifyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateChainValidationEngineVerifyParams] (val x: Self) extends AnyVal {
    
    inline def setInitialExcludedSubtreesSet(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "initialExcludedSubtreesSet", value.asInstanceOf[js.Any])
    
    inline def setInitialExcludedSubtreesSetUndefined: Self = StObject.set(x, "initialExcludedSubtreesSet", js.undefined)
    
    inline def setInitialExcludedSubtreesSetVarargs(value: GeneralSubtree*): Self = StObject.set(x, "initialExcludedSubtreesSet", js.Array(value*))
    
    inline def setInitialExplicitPolicy(value: Boolean): Self = StObject.set(x, "initialExplicitPolicy", value.asInstanceOf[js.Any])
    
    inline def setInitialExplicitPolicyUndefined: Self = StObject.set(x, "initialExplicitPolicy", js.undefined)
    
    inline def setInitialInhibitPolicy(value: Boolean): Self = StObject.set(x, "initialInhibitPolicy", value.asInstanceOf[js.Any])
    
    inline def setInitialInhibitPolicyUndefined: Self = StObject.set(x, "initialInhibitPolicy", js.undefined)
    
    inline def setInitialPermittedSubtreesSet(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "initialPermittedSubtreesSet", value.asInstanceOf[js.Any])
    
    inline def setInitialPermittedSubtreesSetUndefined: Self = StObject.set(x, "initialPermittedSubtreesSet", js.undefined)
    
    inline def setInitialPermittedSubtreesSetVarargs(value: GeneralSubtree*): Self = StObject.set(x, "initialPermittedSubtreesSet", js.Array(value*))
    
    inline def setInitialPolicyMappingInhibit(value: Boolean): Self = StObject.set(x, "initialPolicyMappingInhibit", value.asInstanceOf[js.Any])
    
    inline def setInitialPolicyMappingInhibitUndefined: Self = StObject.set(x, "initialPolicyMappingInhibit", js.undefined)
    
    inline def setInitialPolicySet(value: js.Array[String]): Self = StObject.set(x, "initialPolicySet", value.asInstanceOf[js.Any])
    
    inline def setInitialPolicySetUndefined: Self = StObject.set(x, "initialPolicySet", js.undefined)
    
    inline def setInitialPolicySetVarargs(value: String*): Self = StObject.set(x, "initialPolicySet", js.Array(value*))
    
    inline def setInitialRequiredNameForms(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "initialRequiredNameForms", value.asInstanceOf[js.Any])
    
    inline def setInitialRequiredNameFormsUndefined: Self = StObject.set(x, "initialRequiredNameForms", js.undefined)
    
    inline def setInitialRequiredNameFormsVarargs(value: GeneralSubtree*): Self = StObject.set(x, "initialRequiredNameForms", js.Array(value*))
    
    inline def setPassedWhenNotRevValues(value: Boolean): Self = StObject.set(x, "passedWhenNotRevValues", value.asInstanceOf[js.Any])
    
    inline def setPassedWhenNotRevValuesUndefined: Self = StObject.set(x, "passedWhenNotRevValues", js.undefined)
  }
}
