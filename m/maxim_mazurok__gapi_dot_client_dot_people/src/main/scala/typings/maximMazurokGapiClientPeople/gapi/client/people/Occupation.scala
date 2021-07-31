package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Occupation extends StObject {
  
  /** Metadata about the occupation. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The occupation; for example, `carpenter`. */
  var value: js.UndefOr[String] = js.undefined
}
object Occupation {
  
  @scala.inline
  def apply(): Occupation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Occupation]
  }
  
  @scala.inline
  implicit class OccupationMutableBuilder[Self <: Occupation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
