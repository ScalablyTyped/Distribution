package typings.openssiWebsdk.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var attributes: StringDictionary[String]
  var data: String
}

object Attributes {
  @scala.inline
  def apply(attributes: StringDictionary[String], data: String): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

