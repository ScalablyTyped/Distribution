package typings.oembedParser.mod

import typings.oembedParser.oembedParserStrings.link
import typings.oembedParser.oembedParserStrings.photo
import typings.oembedParser.oembedParserStrings.rich
import typings.oembedParser.oembedParserStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OembedData extends js.Object {
  /** The name of the author/owner of the resource. */
  var author_name: js.UndefOr[String] = js.native
  /** A URL for the author/owner of the resource. */
  var author_url: js.UndefOr[String] = js.native
  /** The suggested cache lifetime for this resource, in seconds. Consumers may choose to use this value or not. */
  var cache_age: js.UndefOr[String] = js.native
  /** The name of the resource provider. */
  var provider_name: js.UndefOr[String] = js.native
  /** The url of the resource provider. */
  var provider_url: js.UndefOr[String] = js.native
  /**
    * The height of the optional thumbnail.
    * If this parameter is present, thumbnail_url and thumbnail_width must also be present.
    */
  var thumbnail_height: js.UndefOr[Double] = js.native
  /**
    * A URL to a thumbnail image representing the resource.
    * The thumbnail must respect any maxwidth and maxheight parameters.
    * If this parameter is present, thumbnail_width and thumbnail_height must also be present.
    */
  var thumbnail_url: js.UndefOr[String] = js.native
  /**
    * The width of the optional thumbnail.
    * If this parameter is present, thumbnail_url and thumbnail_height must also be present.
    */
  var thumbnail_width: js.UndefOr[Double] = js.native
  /** A text title, describing the resource. */
  var title: js.UndefOr[String] = js.native
  var `type`: rich | video | photo | link = js.native
  var version: String = js.native
}

object OembedData {
  @scala.inline
  def apply(`type`: rich | video | photo | link, version: String): OembedData = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OembedData]
  }
  @scala.inline
  implicit class OembedDataOps[Self <: OembedData] (val x: Self) extends AnyVal {
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
    def setType(value: rich | video | photo | link): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor_name(value: String): Self = this.set("author_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor_name: Self = this.set("author_name", js.undefined)
    @scala.inline
    def setAuthor_url(value: String): Self = this.set("author_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor_url: Self = this.set("author_url", js.undefined)
    @scala.inline
    def setCache_age(value: String): Self = this.set("cache_age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache_age: Self = this.set("cache_age", js.undefined)
    @scala.inline
    def setProvider_name(value: String): Self = this.set("provider_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider_name: Self = this.set("provider_name", js.undefined)
    @scala.inline
    def setProvider_url(value: String): Self = this.set("provider_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider_url: Self = this.set("provider_url", js.undefined)
    @scala.inline
    def setThumbnail_height(value: Double): Self = this.set("thumbnail_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail_height: Self = this.set("thumbnail_height", js.undefined)
    @scala.inline
    def setThumbnail_url(value: String): Self = this.set("thumbnail_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail_url: Self = this.set("thumbnail_url", js.undefined)
    @scala.inline
    def setThumbnail_width(value: Double): Self = this.set("thumbnail_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail_width: Self = this.set("thumbnail_width", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

