package typings.pendoIoBrowser.pendo

import typings.pendoIoBrowser.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitOptions extends Identity {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var disablePersistence: js.UndefOr[Boolean] = js.native
  
  var events: js.UndefOr[EventCallbacks] = js.native
  
  var excludeAllText: js.UndefOr[Boolean] = js.native
  
  var excludeTitle: js.UndefOr[Boolean] = js.native
  
  var guides: js.UndefOr[Delay] = js.native
}
object InitOptions {
  
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setDisablePersistence(value: Boolean): Self = this.set("disablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePersistence: Self = this.set("disablePersistence", js.undefined)
    
    @scala.inline
    def setEvents(value: EventCallbacks): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setExcludeAllText(value: Boolean): Self = this.set("excludeAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAllText: Self = this.set("excludeAllText", js.undefined)
    
    @scala.inline
    def setExcludeTitle(value: Boolean): Self = this.set("excludeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeTitle: Self = this.set("excludeTitle", js.undefined)
    
    @scala.inline
    def setGuides(value: Delay): Self = this.set("guides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuides: Self = this.set("guides", js.undefined)
  }
}
