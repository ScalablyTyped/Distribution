package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends js.Object {
  var created: String
  var lastModified: String
  var location: String
  var resourceType: String
}

object Created {
  @scala.inline
  def apply(created: String, lastModified: String, location: String, resourceType: String): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

