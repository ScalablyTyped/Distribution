package typings
package meteorLib.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EJSONable
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object] | stdLib.Date | stdLib.Uint8Array | EJSONableCustomType | scala.Null
      ]
    ]

object EJSONable {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object] | stdLib.Date | stdLib.Uint8Array | EJSONableCustomType | scala.Null
      ]
    ] = null
  ): EJSONable = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EJSONable]
  }
}

