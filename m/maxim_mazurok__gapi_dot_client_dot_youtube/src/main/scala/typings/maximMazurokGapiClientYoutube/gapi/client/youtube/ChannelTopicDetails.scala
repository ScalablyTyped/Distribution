package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelTopicDetails extends StObject {
  
  /** A list of Wikipedia URLs that describe the channel's content. */
  var topicCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of Freebase topic IDs associated with the channel. You can retrieve information about each topic using the Freebase Topic API. */
  var topicIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ChannelTopicDetails {
  
  inline def apply(): ChannelTopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelTopicDetails]
  }
  
  extension [Self <: ChannelTopicDetails](x: Self) {
    
    inline def setTopicCategories(value: js.Array[String]): Self = StObject.set(x, "topicCategories", value.asInstanceOf[js.Any])
    
    inline def setTopicCategoriesUndefined: Self = StObject.set(x, "topicCategories", js.undefined)
    
    inline def setTopicCategoriesVarargs(value: String*): Self = StObject.set(x, "topicCategories", js.Array(value*))
    
    inline def setTopicIds(value: js.Array[String]): Self = StObject.set(x, "topicIds", value.asInstanceOf[js.Any])
    
    inline def setTopicIdsUndefined: Self = StObject.set(x, "topicIds", js.undefined)
    
    inline def setTopicIdsVarargs(value: String*): Self = StObject.set(x, "topicIds", js.Array(value*))
  }
}
