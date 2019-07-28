package typings.microrouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var params: StringDictionary[String]
  var query: StringDictionary[String]
}

object Anon_Key {
  @scala.inline
  def apply(params: StringDictionary[String], query: StringDictionary[String]): Anon_Key = {
    val __obj = js.Dynamic.literal(params = params, query = query)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

