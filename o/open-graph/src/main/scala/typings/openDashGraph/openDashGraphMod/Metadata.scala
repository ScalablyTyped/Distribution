package typings.openDashGraph.openDashGraphMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata
  extends /* key */ StringDictionary[js.UndefOr[String | js.Array[String]]] {
  /** An alternate url to use if the webpage requires HTTPS. */
  var secure_url: js.UndefOr[String | js.Array[String]] = js.undefined
  /** A MIME type for this image. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | js.Array[String]]] = null,
    secure_url: String | js.Array[String] = null,
    `type`: String | js.Array[String] = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (secure_url != null) __obj.updateDynamic("secure_url")(secure_url.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

