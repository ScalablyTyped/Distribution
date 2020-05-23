package typings.openfin.anon

import typings.openfin.GoldenLayout.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: Config
  var dimensions: Top
  var indexInParent: Double
  var parentId: String
}

object Content {
  @scala.inline
  def apply(content: Config, dimensions: Top, indexInParent: Double, parentId: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], indexInParent = indexInParent.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

