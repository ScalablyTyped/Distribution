package typings
package photoswipeLib.distPhotoswipeDashUiDashDefaultMod.PhotoSwipeUIUnderscoreDefaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShareButtonData extends js.Object {
  /**
           * Whether this link is a direct download button or not.
           *
           * Default false.
           */
  var download: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * An id for this share button entry. The share element associated with this entry will be classed with
           * 'pswp__share--' + id
           */
  var id: java.lang.String
  /**
           * The user-visible text to display for this entry.
           */
  var label: java.lang.String
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
  var url: java.lang.String
}

