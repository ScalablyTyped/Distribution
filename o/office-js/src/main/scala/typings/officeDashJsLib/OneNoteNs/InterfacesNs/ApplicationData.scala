package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "application.toJSON()". */

trait ApplicationData extends js.Object {
  /**
              *
              * Gets the collection of notebooks that are open in the OneNote application instance. In OneNote Online, only one notebook at a time is open in the application instance. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var notebooks: js.UndefOr[js.Array[NotebookData]] = js.undefined
}

