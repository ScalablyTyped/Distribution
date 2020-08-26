package typings.photoswipe.photoswipeUiDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareButtonData extends js.Object {
  /**
    * Whether this link is a direct download button or not.
    *
    * Default false.
    */
  var download: js.UndefOr[Boolean] = js.native
  /**
    * An id for this share button entry. The share element associated with this entry will be classed with
    * 'pswp__share--' + id
    */
  var id: String = js.native
  /**
    * The user-visible text to display for this entry.
    */
  var label: String = js.native
  /**
    * The full sharing endpoint URL for this social media site (e.g. Facebook's is facebook.com/sharer/sharer.php), with URL parameters.
    * PhotoSwipUI_Default treats the URL specially. In the url string, any of the following text is treated specially:
    * '{{url}}', '{{image_url}}, '{{raw_image_url}}, '{{text}}'. PhotoSwipeUI_Default will replace each of them with the following value:
    *
    * {{url}} becomes the (URIEncoded) url to the current "Page" (as returned by getPageURLForShare).
    * {{image_url}} becomes the (URIEncoded) url of the selected image (as returned by getImageURLForShare).
    * {{raw_image_url}} becomes the raw url of the selected image (as returned by getImageURLForShare).
    * {{text}} becomes the (URIEncoded) share text of the selected image (as returned by getTextForShare).
    */
  var url: String = js.native
}

object ShareButtonData {
  @scala.inline
  def apply(id: String, label: String, url: String): ShareButtonData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareButtonData]
  }
  @scala.inline
  implicit class ShareButtonDataOps[Self <: ShareButtonData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload(value: Boolean): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
  }
  
}

