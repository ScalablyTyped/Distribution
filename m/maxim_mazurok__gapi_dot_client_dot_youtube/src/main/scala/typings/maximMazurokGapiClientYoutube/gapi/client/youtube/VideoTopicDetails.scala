package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoTopicDetails extends js.Object {
  
  /**
    * Similar to topic_id, except that these topics are merely relevant to the video. These are topics that may be mentioned in, or appear in the video. You can retrieve information about
    * each topic using Freebase Topic API.
    */
  var relevantTopicIds: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of Wikipedia URLs that provide a high-level description of the video's content. */
  var topicCategories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of Freebase topic IDs that are centrally associated with the video. These are topics that are centrally featured in the video, and it can be said that the video is mainly
    * about each of these. You can retrieve information about each topic using the < a href="http://wiki.freebase.com/wiki/Topic_API">Freebase Topic API.
    */
  var topicIds: js.UndefOr[js.Array[String]] = js.native
}
object VideoTopicDetails {
  
  @scala.inline
  def apply(): VideoTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoTopicDetails]
  }
  
  @scala.inline
  implicit class VideoTopicDetailsOps[Self <: VideoTopicDetails] (val x: Self) extends AnyVal {
    
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
    def setRelevantTopicIdsVarargs(value: String*): Self = this.set("relevantTopicIds", js.Array(value :_*))
    
    @scala.inline
    def setRelevantTopicIds(value: js.Array[String]): Self = this.set("relevantTopicIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevantTopicIds: Self = this.set("relevantTopicIds", js.undefined)
    
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
