package typings.pdfParse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var info: js.Any
  var metadata: js.Any
  var numpages: Double
  var numrender: Double
  var text: String
  var version: Version
}

object Result {
  @scala.inline
  def apply(
    info: js.Any,
    metadata: js.Any,
    numpages: Double,
    numrender: Double,
    text: String,
    version: Version
  ): Result = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], numpages = numpages.asInstanceOf[js.Any], numrender = numrender.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

