package typings
package phononLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PhononNs {
  /*** Ajax ***/
  type PhononAjaxErrorFlag = phononLib.phononLibStrings.NO_INTERNET_ACCESS | phononLib.phononLibStrings.TIMEOUT_EXCEEDED | phononLib.phononLibStrings.XMLHTTPREQUEST_UNAVAILABLE | phononLib.phononLibStrings.JSON_MALFORMED | phononLib.phononLibStrings.REQUEST_CANCELED
  /*** Components ***/
  type PhononColor = phononLib.phononLibStrings.positive | phononLib.phononLibStrings.negative
  type PhononPopoverDirection = phononLib.phononLibStrings.left | phononLib.phononLibStrings.`title-left` | phononLib.phononLibStrings.right | phononLib.phononLibStrings.title
}
