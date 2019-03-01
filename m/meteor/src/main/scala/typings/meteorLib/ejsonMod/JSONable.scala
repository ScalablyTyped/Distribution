package typings
package meteorLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONable
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object] | scala.Null
      ]
    ]

object JSONable {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object] | scala.Null
      ]
    ] = null
  ): JSONable = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JSONable]
  }
}

