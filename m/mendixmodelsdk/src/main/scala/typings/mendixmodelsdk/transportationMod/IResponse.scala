package typings.mendixmodelsdk.transportationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var headers: StringDictionary[js.Any]
}

object IResponse {
  @scala.inline
  def apply(headers: StringDictionary[js.Any]): IResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IResponse]
  }
}

