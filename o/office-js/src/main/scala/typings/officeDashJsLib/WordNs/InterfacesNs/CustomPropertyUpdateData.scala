package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the CustomProperty object, for use in "customProperty.set({ ... })". */

trait CustomPropertyUpdateData extends js.Object {
  /**
               *
               * Gets or sets the value of the custom property. Note that even though Word Online and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
               *
               * [Api set: WordApi 1.3]
               */
  var value: js.UndefOr[js.Any] = js.undefined
}

