package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchTopicsResponseItemsItem extends js.Object {
  var created_at: String
  var created_by: String
  var curated: Boolean
  var description: String
  var display_name: String
  var featured: Boolean
  var name: String
  var released: String
  var score: Double
  var short_description: String
  var updated_at: String
}

object SearchTopicsResponseItemsItem {
  @scala.inline
  def apply(
    created_at: String,
    created_by: String,
    curated: Boolean,
    description: String,
    display_name: String,
    featured: Boolean,
    name: String,
    released: String,
    score: Double,
    short_description: String,
    updated_at: String
  ): SearchTopicsResponseItemsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], curated = curated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], released = released.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], short_description = short_description.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchTopicsResponseItemsItem]
  }
}

