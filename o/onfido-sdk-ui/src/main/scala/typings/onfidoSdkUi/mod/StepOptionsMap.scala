package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionsMap extends StObject {
  
  var auth: StepOptionAuth
  
  var complete: StepOptionComplete
  
  var data: StepOptionData
  
  var document: StepOptionDocument
  
  var face: StepOptionFace
  
  var poa: StepOptionPoA
  
  var retry: StepOptionRetry
  
  var welcome: StepOptionWelcome
}
object StepOptionsMap {
  
  inline def apply(
    auth: StepOptionAuth,
    complete: StepOptionComplete,
    data: StepOptionData,
    document: StepOptionDocument,
    face: StepOptionFace,
    poa: StepOptionPoA,
    retry: StepOptionRetry,
    welcome: StepOptionWelcome
  ): StepOptionsMap = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], poa = poa.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], welcome = welcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepOptionsMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionsMap] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: StepOptionAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: StepOptionComplete): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setData(value: StepOptionData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: StepOptionDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setFace(value: StepOptionFace): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    inline def setPoa(value: StepOptionPoA): Self = StObject.set(x, "poa", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: StepOptionRetry): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setWelcome(value: StepOptionWelcome): Self = StObject.set(x, "welcome", value.asInstanceOf[js.Any])
  }
}
