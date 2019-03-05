package typings
package openDashGraphLib.openDashGraphMod.ogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[java.lang.String | js.Array[java.lang.String] | ImageVideoMetadata | Metadata]
    ] {
  /** A URL to an audio file to accompany this object. */
  var audio: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Metadata] = js.undefined
  /** A one to two sentence description of your object. */
  var description: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The word that appears before this object's title in a sentence. An enum of (a, an, the, "", auto).
    * If auto is chosen, the consumer of your data should chose between "a" or "an". Default is "" (blank).
    */
  var determiner: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** An image URL which should represent your object within the graph. */
  var image: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ImageVideoMetadata] = js.undefined
  /** The locale these tags are marked up in. Of the format `language_TERRITORY`. Default is `en_US`. */
  var locale: js.UndefOr[java.lang.String | js.Array[java.lang.String] | openDashGraphLib.Anon_Alternate] = js.undefined
  /** If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., "IMDb". */
  var site_name: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** The title of your object as it should appear within the graph, e.g., "The Rock". */
  var title: java.lang.String | js.Array[java.lang.String]
  /** The type of your object, e.g., "video.movie". Depending on the type you specify, other properties may also be required. */
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** The canonical URL of your object that will be used as its permanent ID in the graph, e.g., "http://www.imdb.com/title/tt0117500/". */
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** A URL to a video file that complements this object. */
  var video: js.UndefOr[java.lang.String | js.Array[java.lang.String] | ImageVideoMetadata] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    title: java.lang.String | js.Array[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[java.lang.String | js.Array[java.lang.String] | ImageVideoMetadata | Metadata]
    ] = null,
    audio: java.lang.String | js.Array[java.lang.String] | Metadata = null,
    description: java.lang.String | js.Array[java.lang.String] = null,
    determiner: java.lang.String | js.Array[java.lang.String] = null,
    image: java.lang.String | js.Array[java.lang.String] | ImageVideoMetadata = null,
    locale: java.lang.String | js.Array[java.lang.String] | openDashGraphLib.Anon_Alternate = null,
    site_name: java.lang.String | js.Array[java.lang.String] = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    url: java.lang.String | js.Array[java.lang.String] = null,
    video: java.lang.String | js.Array[java.lang.String] | ImageVideoMetadata = null
  ): Data = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (determiner != null) __obj.updateDynamic("determiner")(determiner.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (site_name != null) __obj.updateDynamic("site_name")(site_name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

