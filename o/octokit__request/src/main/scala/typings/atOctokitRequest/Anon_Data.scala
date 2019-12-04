package typings.atOctokitRequest

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var headers: StringDictionary[String]
  var status: Double
  var url: String
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, headers: StringDictionary[String], status: Double, url: String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

