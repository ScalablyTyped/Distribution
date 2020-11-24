package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the document that raised the SelectionChanged event.
  */
@js.native
trait DocumentSelectionChangedEventArgs extends js.Object {
  
  /**
    * Gets an {@link Office.Document} object that represents the document that raised the SelectionChanged event.
    */
  var document: Document = js.native
  
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType = js.native
}
object DocumentSelectionChangedEventArgs {
  
  @scala.inline
  def apply(document: Document, `type`: EventType): DocumentSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit class DocumentSelectionChangedEventArgsOps[Self <: DocumentSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EventType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
