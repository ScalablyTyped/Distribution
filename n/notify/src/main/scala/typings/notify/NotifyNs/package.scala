package typings.notify

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NotifyNs {
  /**
    * Notifications created with a specified class will have CSS properties applied to that
    * notification. This interface defines what properties and their values to apply for a given class.
    * Keys should be CSS property names, and values their values.
    */
  type ClassCSS = StringDictionary[String]
}
