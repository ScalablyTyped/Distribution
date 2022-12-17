package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectPublicKey extends StObject {
  
  var algorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var subjectPublicKey: js.UndefOr[String] = js.undefined
}
object SubjectPublicKey {
  
  inline def apply(): SubjectPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectPublicKey]
  }
  
  extension [Self <: SubjectPublicKey](x: Self) {
    
    inline def setAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    inline def setSubjectPublicKey(value: String): Self = StObject.set(x, "subjectPublicKey", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyUndefined: Self = StObject.set(x, "subjectPublicKey", js.undefined)
  }
}
