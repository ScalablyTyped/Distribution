package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelTopicDetails extends js.Object {
  
  /** A list of Wikipedia URLs that describe the channel's content. */
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API. */
  var topicIds: js.UndefOr[js.Array[String]] = js.native
}
object ChannelTopicDetails {
  
  @scala.inline
  def apply(): ChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelTopicDetails]
  }
  
  @scala.inline
  implicit class ChannelTopicDetailsOps[Self <: ChannelTopicDetails] (val x: Self) extends AnyVal {
    
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
    def setTopicCategoriesVarargs(value: String*): Self = this.set("topicCategories", js.Array(value :_*))
    
    @scala.inline
    def setTopicCategories(value: js.Array[String]): Self = this.set("topicCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicCategories: Self = this.set("topicCategories", js.undefined)
    
    @scala.inline
    def setTopicIdsVarargs(value: String*): Self = this.set("topicIds", js.Array(value :_*))
    
    @scala.inline
    def setTopicIds(value: js.Array[String]): Self = this.set("topicIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicIds: Self = this.set("topicIds", js.undefined)
  }
}
