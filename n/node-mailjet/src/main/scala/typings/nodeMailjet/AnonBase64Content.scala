package typings.nodeMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64Content extends js.Object {
  var Base64Content: String
  var ContentType: String
  var Filename: String
}

object AnonBase64Content {
  @scala.inline
  def apply(Base64Content: String, ContentType: String, Filename: String): AnonBase64Content = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase64Content]
  }
}

