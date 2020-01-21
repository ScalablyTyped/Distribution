package typings.openssiWebsdk

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: StringDictionary[String]
  var data: String
}

object AnonAttributes {
  @scala.inline
  def apply(attributes: StringDictionary[String], data: String): AnonAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttributes]
  }
}

