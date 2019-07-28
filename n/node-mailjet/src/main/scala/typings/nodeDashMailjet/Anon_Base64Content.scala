package typings.nodeDashMailjet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64Content extends js.Object {
  var Base64Content: String
  var ContentType: String
  var Filename: String
}

object Anon_Base64Content {
  @scala.inline
  def apply(Base64Content: String, ContentType: String, Filename: String): Anon_Base64Content = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content, ContentType = ContentType, Filename = Filename)
  
    __obj.asInstanceOf[Anon_Base64Content]
  }
}

