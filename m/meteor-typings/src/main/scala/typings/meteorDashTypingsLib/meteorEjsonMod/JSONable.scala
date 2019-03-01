package typings
package meteorDashTypingsLib.meteorEjsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONable
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object]
    ]

object JSONable {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object]
    ] = null
  ): JSONable = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONable]
  }
}

