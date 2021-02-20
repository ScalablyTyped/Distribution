package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Skill extends StObject {
  
  /** Metadata about the skill. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The skill; for example, `underwater basket weaving`. */
  var value: js.UndefOr[String] = js.native
}
object Skill {
  
  @scala.inline
  def apply(): Skill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skill]
  }
  
  @scala.inline
  implicit class SkillMutableBuilder[Self <: Skill] (val x: Self) extends AnyVal {
    
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
