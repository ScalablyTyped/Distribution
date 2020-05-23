package typings.photoswipe.photoswipeUiDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareButtonData extends js.Object {
  /**
    * Whether this link is a direct download button or not.
    *
    * Default false.
    */
  var download: js.UndefOr[Boolean] = js.undefined
  /**
    * An id for this share button entry. The share element associated with this entry will be classed with
    * 'pswp__share--' + id
    */
  var id: String
  /**
    * The user-visible text to display for this entry.
    */
  var label: String
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
  var url: String
}

object ShareButtonData {
  @scala.inline
  def apply(id: String, label: String, url: String, download: js.UndefOr[Boolean] = js.undefined): ShareButtonData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareButtonData]
  }
}

