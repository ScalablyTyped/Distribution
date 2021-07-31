package typings.officeJsPreview.OneNote

import typings.officeJsPreview.officeJsPreviewStrings.SectionSelectionChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the binding that raised the section selection changed event
  *
  * [Api set: OneNoteApi 1.5]
  */
trait SectionSelectionChangedEventArgs extends StObject {
  
  /**
    *
    * Active Section id before change
    *
    * [Api set: OneNoteApi 1.5]
    */
  var oldId: String
  
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: SectionSelectionChanged
}
object SectionSelectionChangedEventArgs {
  
  @scala.inline
  def apply(oldId: String): SectionSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SectionSelectionChanged")
    __obj.asInstanceOf[SectionSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class SectionSelectionChangedEventArgsMutableBuilder[Self <: SectionSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldId(value: String): Self = StObject.set(x, "oldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: SectionSelectionChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
