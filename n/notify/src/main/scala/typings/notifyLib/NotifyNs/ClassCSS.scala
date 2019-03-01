package typings
package notifyLib.NotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notifications created with a specified class will have CSS properties applied to that
  * notification. This interface defines what properties and their values to apply for a given class.
  * Keys should be CSS property names, and values their values.
  */
trait ClassCSS
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object ClassCSS {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): ClassCSS = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ClassCSS]
  }
}

