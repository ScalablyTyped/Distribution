package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(created_at = created_at, created_by = created_by, curated = curated, description = description, display_name = display_name, featured = featured, name = name, released = released, score = score, short_description = short_description, updated_at = updated_at)
  
    __obj.asInstanceOf[SearchTopicsResponseItemsItem]
  }
}

