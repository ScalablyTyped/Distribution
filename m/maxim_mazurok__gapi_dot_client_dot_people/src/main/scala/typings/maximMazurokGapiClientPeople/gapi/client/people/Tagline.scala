package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tagline extends StObject {
  
  /** Metadata about the tagline. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The tagline. */
  var value: js.UndefOr[String] = js.native
}
object Tagline {
  
  @scala.inline
  def apply(): Tagline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tagline]
  }
  
  @scala.inline
  implicit class TaglineMutableBuilder[Self <: Tagline] (val x: Self) extends AnyVal {
    
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
