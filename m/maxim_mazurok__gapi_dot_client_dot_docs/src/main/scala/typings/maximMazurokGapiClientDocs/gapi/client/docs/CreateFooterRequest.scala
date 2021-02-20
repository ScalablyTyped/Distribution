package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFooterRequest extends StObject {
  
  /**
    * The location of the SectionBreak immediately preceding the section whose SectionStyle this footer should belong to. If this is unset or refers to the first section break in the
    * document, the footer applies to the document style.
    */
  var sectionBreakLocation: js.UndefOr[Location] = js.native
  
  /** The type of footer to create. */
  var `type`: js.UndefOr[String] = js.native
}
object CreateFooterRequest {
  
  @scala.inline
  def apply(): CreateFooterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFooterRequest]
  }
  
  @scala.inline
  implicit class CreateFooterRequestMutableBuilder[Self <: CreateFooterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSectionBreakLocation(value: Location): Self = StObject.set(x, "sectionBreakLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionBreakLocationUndefined: Self = StObject.set(x, "sectionBreakLocation", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
