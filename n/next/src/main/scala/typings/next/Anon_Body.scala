package typings.next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
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

object Anon_Body {
  @scala.inline
  def apply(
    body: js.Any,
    cookies: StringDictionary[String],
    query: StringDictionary[String | js.Array[String]]
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body, cookies = cookies, query = query)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

