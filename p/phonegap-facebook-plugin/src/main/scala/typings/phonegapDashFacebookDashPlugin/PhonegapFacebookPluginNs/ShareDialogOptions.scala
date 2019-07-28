package typings.phonegapDashFacebookDashPlugin.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Share dialog prompts a person to publish an individual story or an Open Graph story to their timeline.
  * This does not require Facebook Login or any extended permissions, so it is the easiest way to enable
  * sharing on web.
  *
  * For use with showDialog() of method type 'share'.
  */
trait ShareDialogOptions extends BaseDialogOptions {
  /**
    * The link attached to this post. Required when using method share. Include open graph meta tags in the
    * page at this URL to customize the story that is shared.
    */
  var href: String
}

object ShareDialogOptions {
  @scala.inline
  def apply(href: String, method: String): ShareDialogOptions = {
    val __obj = js.Dynamic.literal(href = href, method = method)
  
    __obj.asInstanceOf[ShareDialogOptions]
  }
}

