package typings.officeJsPreview.Office.AddinCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates source data for add-in events.
  */
trait Source extends js.Object {
  /**
    * The ID of the control that triggered calling this function. The ID comes from the manifest and is the unique ID of your Office Add-in 
    * as a GUID.
    */
  var id: String
}

object Source {
  @scala.inline
  def apply(id: String): Source = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

