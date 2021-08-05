package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skill extends StObject {
  
  /** Metadata about the skill. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The skill; for example, `underwater basket weaving`. */
  var value: js.UndefOr[String] = js.undefined
}
object Skill {
  
  inline def apply(): Skill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skill]
  }
  
  extension [Self <: Skill](x: Self) {
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
