package typings.nodeDashMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64ContentContentID extends js.Object {
  var Base64Content: String
  var ContentID: String
  var ContentType: String
  var Filename: String
}

object Anon_Base64ContentContentID {
  @scala.inline
  def apply(Base64Content: String, ContentID: String, ContentType: String, Filename: String): Anon_Base64ContentContentID = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content, ContentID = ContentID, ContentType = ContentType, Filename = Filename)
  
    __obj.asInstanceOf[Anon_Base64ContentContentID]
  }
}

