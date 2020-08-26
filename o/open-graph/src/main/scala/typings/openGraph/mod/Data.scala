package typings.openGraph.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openGraph.anon.Alternate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data
  extends /* key */ StringDictionary[js.UndefOr[String | js.Array[String] | ImageVideoMetadata | Metadata]] {
  /** A URL to an audio file to accompany this object. */
  var audio: js.UndefOr[String | js.Array[String] | Metadata] = js.native
  /** A one to two sentence description of your object. */
  var description: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * The word that appears before this object's title in a sentence. An enum of (a, an, the, "", auto).
    * If auto is chosen, the consumer of your data should chose between "a" or "an". Default is "" (blank).
    */
  var determiner: js.UndefOr[String | js.Array[String]] = js.native
  /** An image URL which should represent your object within the graph. */
  var image: js.UndefOr[String | js.Array[String] | ImageVideoMetadata] = js.native
  /** The locale these tags are marked up in. Of the format `language_TERRITORY`. Default is `en_US`. */
  var locale: js.UndefOr[String | js.Array[String] | Alternate] = js.native
  /** If your object is part of a larger web site, the name which should be displayed for the overall site. e.g., "IMDb". */
  var site_name: js.UndefOr[String | js.Array[String]] = js.native
  /** The title of your object as it should appear within the graph, e.g., "The Rock". */
  var title: String | js.Array[String] = js.native
  /** The type of your object, e.g., "video.movie". Depending on the type you specify, other properties may also be required. */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  /** The canonical URL of your object that will be used as its permanent ID in the graph, e.g., "http://www.imdb.com/title/tt0117500/". */
  var url: js.UndefOr[String | js.Array[String]] = js.native
  /** A URL to a video file that complements this object. */
  var video: js.UndefOr[String | js.Array[String] | ImageVideoMetadata] = js.native
}

object Data {
  @scala.inline
  def apply(title: String | js.Array[String]): Data = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitleVarargs(value: String*): Self = this.set("title", js.Array(value :_*))
    @scala.inline
    def setTitle(value: String | js.Array[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioVarargs(value: String*): Self = this.set("audio", js.Array(value :_*))
    @scala.inline
    def setAudio(value: String | js.Array[String] | Metadata): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    @scala.inline
    def setDescription(value: String | js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDeterminerVarargs(value: String*): Self = this.set("determiner", js.Array(value :_*))
    @scala.inline
    def setDeterminer(value: String | js.Array[String]): Self = this.set("determiner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeterminer: Self = this.set("determiner", js.undefined)
    @scala.inline
    def setImageVarargs(value: String*): Self = this.set("image", js.Array(value :_*))
    @scala.inline
    def setImage(value: String | js.Array[String] | ImageVideoMetadata): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLocaleVarargs(value: String*): Self = this.set("locale", js.Array(value :_*))
    @scala.inline
    def setLocale(value: String | js.Array[String] | Alternate): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setSite_nameVarargs(value: String*): Self = this.set("site_name", js.Array(value :_*))
    @scala.inline
    def setSite_name(value: String | js.Array[String]): Self = this.set("site_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite_name: Self = this.set("site_name", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrlVarargs(value: String*): Self = this.set("url", js.Array(value :_*))
    @scala.inline
    def setUrl(value: String | js.Array[String]): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVideoVarargs(value: String*): Self = this.set("video", js.Array(value :_*))
    @scala.inline
    def setVideo(value: String | js.Array[String] | ImageVideoMetadata): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

