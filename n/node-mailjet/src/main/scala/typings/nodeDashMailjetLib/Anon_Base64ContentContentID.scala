package typings
package nodeDashMailjetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64ContentContentID extends js.Object {
  var Base64Content: java.lang.String
  var ContentID: java.lang.String
  var ContentType: java.lang.String
  var Filename: java.lang.String
}

object Anon_Base64ContentContentID {
  @scala.inline
  def apply(
    Base64Content: java.lang.String,
    ContentID: java.lang.String,
    ContentType: java.lang.String,
    Filename: java.lang.String
  ): Anon_Base64ContentContentID = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content, ContentID = ContentID, ContentType = ContentType, Filename = Filename)
  
    __obj.asInstanceOf[Anon_Base64ContentContentID]
  }
}

