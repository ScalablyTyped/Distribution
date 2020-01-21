package typings.nodeMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64ContentContentID extends js.Object {
  var Base64Content: String
  var ContentID: String
  var ContentType: String
  var Filename: String
}

object AnonBase64ContentContentID {
  @scala.inline
  def apply(Base64Content: String, ContentID: String, ContentType: String, Filename: String): AnonBase64ContentContentID = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentID = ContentID.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase64ContentContentID]
  }
}

