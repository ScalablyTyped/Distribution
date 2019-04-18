package typings
package nodeDashMailjetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64Content extends js.Object {
  var Base64Content: java.lang.String
  var ContentType: java.lang.String
  var Filename: java.lang.String
}

object Anon_Base64Content {
  @scala.inline
  def apply(Base64Content: java.lang.String, ContentType: java.lang.String, Filename: java.lang.String): Anon_Base64Content = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content, ContentType = ContentType, Filename = Filename)
  
    __obj.asInstanceOf[Anon_Base64Content]
  }
}

