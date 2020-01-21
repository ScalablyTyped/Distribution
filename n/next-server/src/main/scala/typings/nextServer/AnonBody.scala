package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.Any
  /**
    * Object of `cookies` from header
    */
  var cookies: StringDictionary[String]
  /**
    * Object of `query` values from url
    */
  var query: StringDictionary[String | js.Array[String]]
}

object AnonBody {
  @scala.inline
  def apply(
    body: js.Any,
    cookies: StringDictionary[String],
    query: StringDictionary[String | js.Array[String]]
  ): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

