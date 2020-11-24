package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchSettings extends js.Object {
  
  /** The text color for the video watch page's branded area. */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** An ID that uniquely identifies a playlist that displays next to the video player. */
  var featuredPlaylistId: js.UndefOr[String] = js.native
  
  /** The background color for the video watch page's branded area. */
  var textColor: js.UndefOr[String] = js.native
}
object WatchSettings {
  
  @scala.inline
  def apply(): WatchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchSettings]
  }
  
  @scala.inline
  implicit class WatchSettingsOps[Self <: WatchSettings] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFeaturedPlaylistId(value: String): Self = this.set("featuredPlaylistId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeaturedPlaylistId: Self = this.set("featuredPlaylistId", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
