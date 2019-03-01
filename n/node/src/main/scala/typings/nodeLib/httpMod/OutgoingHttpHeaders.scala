package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// outgoing headers allows numbers (as they are converted internally to strings)
trait OutgoingHttpHeaders
  extends /* header */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]]

object OutgoingHttpHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* header */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double | java.lang.String | js.Array[java.lang.String]]] = null
  ): OutgoingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[OutgoingHttpHeaders]
  }
}

