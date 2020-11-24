package typings.needle.mod.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedirectOptions extends js.Object {
  
  /**
    * When true, Needle will only follow redirects that point to the same host
    * as the original request.
    * false by default.
    */
  var follow_if_same_host: js.UndefOr[Boolean] = js.native
  
  /**
    * Unless true, Needle will not follow redirects that point to same location (as set in the response header) as the original request URL. false by default.
    */
  var follow_if_same_location: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, Needle will only follow redirects that point to the same protocol
    * as the original request.
    * false by default.
    */
  var follow_if_same_protocol: js.UndefOr[Boolean] = js.native
  
  /**
    * If enabled, resends the request using the original verb
    * instead of being rewritten to get with no data.
    * false by default.
    */
  var follow_keep_method: js.UndefOr[Boolean] = js.native
  
  /**
    * Sends the cookies received in the set-cookie header
    * as part of the following request.
    * false by default.
    */
  var follow_set_cookie: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the 'Referer' header to the requested URI
    * when following a redirect.
    * false by default.
    */
  var follow_set_referer: js.UndefOr[Boolean] = js.native
}
object RedirectOptions {
  
  @scala.inline
  def apply(): RedirectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectOptions]
  }
  
  @scala.inline
  implicit class RedirectOptionsOps[Self <: RedirectOptions] (val x: Self) extends AnyVal {
    
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
    def setFollow_if_same_host(value: Boolean): Self = this.set("follow_if_same_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_if_same_host: Self = this.set("follow_if_same_host", js.undefined)
    
    @scala.inline
    def setFollow_if_same_location(value: Boolean): Self = this.set("follow_if_same_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_if_same_location: Self = this.set("follow_if_same_location", js.undefined)
    
    @scala.inline
    def setFollow_if_same_protocol(value: Boolean): Self = this.set("follow_if_same_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_if_same_protocol: Self = this.set("follow_if_same_protocol", js.undefined)
    
    @scala.inline
    def setFollow_keep_method(value: Boolean): Self = this.set("follow_keep_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_keep_method: Self = this.set("follow_keep_method", js.undefined)
    
    @scala.inline
    def setFollow_set_cookie(value: Boolean): Self = this.set("follow_set_cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_set_cookie: Self = this.set("follow_set_cookie", js.undefined)
    
    @scala.inline
    def setFollow_set_referer(value: Boolean): Self = this.set("follow_set_referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow_set_referer: Self = this.set("follow_set_referer", js.undefined)
  }
}
