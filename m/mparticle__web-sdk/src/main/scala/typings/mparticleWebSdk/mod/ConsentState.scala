package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentState extends StObject {
  
  def addGDPRConsentState(purpose: String, gdprConsent: PrivacyConsentState): ConsentState
  
  def getCCPAConsentState(): CCPAConsentState
  
  def getGDPRConsentState(): GDPRConsentState
  
  def removeCCPAConsentState(): ConsentState
  
  def removeGDPRConsentState(purpose: String): ConsentState
  
  def setCCPAConsentState(ccpaConsentState: CCPAConsentState): ConsentState
  
  def setGDPRConsentState(gdprConsentState: GDPRConsentState): ConsentState
}
object ConsentState {
  
  inline def apply(
    addGDPRConsentState: (String, PrivacyConsentState) => ConsentState,
    getCCPAConsentState: () => CCPAConsentState,
    getGDPRConsentState: () => GDPRConsentState,
    removeCCPAConsentState: () => ConsentState,
    removeGDPRConsentState: String => ConsentState,
    setCCPAConsentState: CCPAConsentState => ConsentState,
    setGDPRConsentState: GDPRConsentState => ConsentState
  ): ConsentState = {
    val __obj = js.Dynamic.literal(addGDPRConsentState = js.Any.fromFunction2(addGDPRConsentState), getCCPAConsentState = js.Any.fromFunction0(getCCPAConsentState), getGDPRConsentState = js.Any.fromFunction0(getGDPRConsentState), removeCCPAConsentState = js.Any.fromFunction0(removeCCPAConsentState), removeGDPRConsentState = js.Any.fromFunction1(removeGDPRConsentState), setCCPAConsentState = js.Any.fromFunction1(setCCPAConsentState), setGDPRConsentState = js.Any.fromFunction1(setGDPRConsentState))
    __obj.asInstanceOf[ConsentState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentState] (val x: Self) extends AnyVal {
    
    inline def setAddGDPRConsentState(value: (String, PrivacyConsentState) => ConsentState): Self = StObject.set(x, "addGDPRConsentState", js.Any.fromFunction2(value))
    
    inline def setGetCCPAConsentState(value: () => CCPAConsentState): Self = StObject.set(x, "getCCPAConsentState", js.Any.fromFunction0(value))
    
    inline def setGetGDPRConsentState(value: () => GDPRConsentState): Self = StObject.set(x, "getGDPRConsentState", js.Any.fromFunction0(value))
    
    inline def setRemoveCCPAConsentState(value: () => ConsentState): Self = StObject.set(x, "removeCCPAConsentState", js.Any.fromFunction0(value))
    
    inline def setRemoveGDPRConsentState(value: String => ConsentState): Self = StObject.set(x, "removeGDPRConsentState", js.Any.fromFunction1(value))
    
    inline def setSetCCPAConsentState(value: CCPAConsentState => ConsentState): Self = StObject.set(x, "setCCPAConsentState", js.Any.fromFunction1(value))
    
    inline def setSetGDPRConsentState(value: GDPRConsentState => ConsentState): Self = StObject.set(x, "setGDPRConsentState", js.Any.fromFunction1(value))
  }
}
