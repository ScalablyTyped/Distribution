package typings.officeUiFabricReact.exampleDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleItem extends js.Object {
  var color: String
  var description: String
  var height: Double
  var key: String
  var location: String
  var name: String
  var shape: String
  var thumbnail: String
  var width: Double
}

object IExampleItem {
  @scala.inline
  def apply(
    color: String,
    description: String,
    height: Double,
    key: String,
    location: String,
    name: String,
    shape: String,
    thumbnail: String,
    width: Double
  ): IExampleItem = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IExampleItem]
  }
}

