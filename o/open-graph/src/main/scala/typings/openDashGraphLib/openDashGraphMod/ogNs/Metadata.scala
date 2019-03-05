package typings
package openDashGraphLib.openDashGraphMod.ogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]] {
  /** An alternate url to use if the webpage requires HTTPS. */
  var secure_url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** A MIME type for this image. */
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]] = null,
    secure_url: java.lang.String | js.Array[java.lang.String] = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (secure_url != null) __obj.updateDynamic("secure_url")(secure_url.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

