package typings.phantom.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined phantom.phantom.IRequestData & {  errorCode  :number,   errorString  :string} */
trait IRequestDataerrorCodenumb extends js.Object {
  var errorCode: Double
  var errorString: String
  var headers: js.Array[Name]
  var id: Double
  var method: String
  var time: Date
  var url: String
}

object IRequestDataerrorCodenumb {
  @scala.inline
  def apply(
    errorCode: Double,
    errorString: String,
    headers: js.Array[Name],
    id: Double,
    method: String,
    time: Date,
    url: String
  ): IRequestDataerrorCodenumb = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestDataerrorCodenumb]
  }
}

