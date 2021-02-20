package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideProperties extends StObject {
  
  /** The object ID of the layout that this slide is based on. This property is read-only. */
  var layoutObjectId: js.UndefOr[String] = js.native
  
  /** The object ID of the master that this slide is based on. This property is read-only. */
  var masterObjectId: js.UndefOr[String] = js.native
  
  /**
    * The notes page that this slide is associated with. It defines the visual appearance of a notes page when printing or exporting slides with speaker notes. A notes page inherits
    * properties from the notes master. The placeholder shape with type BODY on the notes page contains the speaker notes for this slide. The ID of this shape is identified by the
    * speakerNotesObjectId field. The notes page is read-only except for the text content and styles of the speaker notes shape. This property is read-only.
    */
  var notesPage: js.UndefOr[Page] = js.native
}
object SlideProperties {
  
  @scala.inline
  def apply(): SlideProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideProperties]
  }
  
  @scala.inline
  implicit class SlidePropertiesMutableBuilder[Self <: SlideProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutObjectId(value: String): Self = StObject.set(x, "layoutObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutObjectIdUndefined: Self = StObject.set(x, "layoutObjectId", js.undefined)
    
    @scala.inline
    def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
    
    @scala.inline
    def setNotesPage(value: Page): Self = StObject.set(x, "notesPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesPageUndefined: Self = StObject.set(x, "notesPage", js.undefined)
  }
}
