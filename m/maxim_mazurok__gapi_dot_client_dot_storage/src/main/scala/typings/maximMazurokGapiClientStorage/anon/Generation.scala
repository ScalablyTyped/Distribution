package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generation extends StObject {
  
  /** The generation of this object to use as the source. */
  var generation: js.UndefOr[String] = js.undefined
  
  /** The source object's name. All source objects must reside in the same bucket. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Conditions that must be met for this operation to execute. */
  var objectPreconditions: js.UndefOr[IfGenerationMatch] = js.undefined
}
object Generation {
  
  inline def apply(): Generation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generation]
  }
  
  extension [Self <: Generation](x: Self) {
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObjectPreconditions(value: IfGenerationMatch): Self = StObject.set(x, "objectPreconditions", value.asInstanceOf[js.Any])
    
    inline def setObjectPreconditionsUndefined: Self = StObject.set(x, "objectPreconditions", js.undefined)
  }
}
