package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relation extends StObject {
  
  /** Output only. The type of the relation translated and formatted in the viewer's account locale or the locale specified in the Accept-Language HTTP header. */
  var formattedType: js.UndefOr[String] = js.native
  
  /** Metadata about the relation. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The name of the other person this relation refers to. */
  var person: js.UndefOr[String] = js.native
  
  /**
    * The person's relation to the other person. The type can be custom or one of these predefined values: * `spouse` * `child` * `mother` * `father` * `parent` * `brother` * `sister` *
    * `friend` * `relative` * `domesticPartner` * `manager` * `assistant` * `referredBy` * `partner`
    */
  var `type`: js.UndefOr[String] = js.native
}
object Relation {
  
  @scala.inline
  def apply(): Relation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relation]
  }
  
  @scala.inline
  implicit class RelationMutableBuilder[Self <: Relation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
