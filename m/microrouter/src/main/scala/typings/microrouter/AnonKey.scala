package typings.microrouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var params: StringDictionary[String]
  var query: StringDictionary[String]
}

object AnonKey {
  @scala.inline
  def apply(params: StringDictionary[String], query: StringDictionary[String]): AnonKey = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

