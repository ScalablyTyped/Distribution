package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDefinition extends js.Object {
  
  /** A list of events that are a child of this event. */
  var childEvents: js.UndefOr[js.Array[EventChild]] = js.native
  
  /** Description of what this event represents. */
  var description: js.UndefOr[String] = js.native
  
  /** The name to display for the event. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The ID of the event. */
  var id: js.UndefOr[String] = js.native
  
  /** The base URL for the image that represents the event. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isDefaultImageUrl: js.UndefOr[Boolean] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventDefinition`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The visibility of event being tracked in this definition. */
  var visibility: js.UndefOr[String] = js.native
}
object EventDefinition {
  
  @scala.inline
  def apply(): EventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDefinition]
  }
  
  @scala.inline
  implicit class EventDefinitionOps[Self <: EventDefinition] (val x: Self) extends AnyVal {
    
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
    def setChildEventsVarargs(value: EventChild*): Self = this.set("childEvents", js.Array(value :_*))
    
    @scala.inline
    def setChildEvents(value: js.Array[EventChild]): Self = this.set("childEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildEvents: Self = this.set("childEvents", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setIsDefaultImageUrl(value: Boolean): Self = this.set("isDefaultImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultImageUrl: Self = this.set("isDefaultImageUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
