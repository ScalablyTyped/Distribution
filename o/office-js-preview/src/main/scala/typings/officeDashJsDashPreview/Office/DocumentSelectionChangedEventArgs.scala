package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the document that raised the SelectionChanged event.
  */
trait DocumentSelectionChangedEventArgs extends js.Object {
  /**
    * Gets an {@link Office.Document} object that represents the document that raised the SelectionChanged event.
    */
  var document: Document
  /**
    * Get an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}

object DocumentSelectionChangedEventArgs {
  @scala.inline
  def apply(document: Document, `type`: EventType): DocumentSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(document = document)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentSelectionChangedEventArgs]
  }
}

