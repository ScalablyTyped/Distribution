package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Share dialog prompts a person to publish an individual story or an Open Graph story to their timeline.
  * This does not require Facebook Login or any extended permissions, so it is the easiest way to enable
  * sharing on web.
  *
  * For use with showDialog() of method type 'share'.
  */
@js.native
trait ShareDialogOptions extends BaseDialogOptions {
  
  /**
    * The link attached to this post. Required when using method share. Include open graph meta tags in the
    * page at this URL to customize the story that is shared.
    */
  var href: String = js.native
}
object ShareDialogOptions {
  
  @scala.inline
  def apply(href: String, method: String): ShareDialogOptions = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogOptions]
  }
  
  @scala.inline
  implicit class ShareDialogOptionsOps[Self <: ShareDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
  }
}
