package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON representation of {@link AlgorithmIdentifier}
  */
trait AlgorithmIdentifierJson extends StObject {
  
  var algorithmId: String
  
  var algorithmParams: js.UndefOr[Any] = js.undefined
}
object AlgorithmIdentifierJson {
  
  inline def apply(algorithmId: String): AlgorithmIdentifierJson = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmIdentifierJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgorithmIdentifierJson] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmId(value: String): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmParams(value: Any): Self = StObject.set(x, "algorithmParams", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmParamsUndefined: Self = StObject.set(x, "algorithmParams", js.undefined)
  }
}
