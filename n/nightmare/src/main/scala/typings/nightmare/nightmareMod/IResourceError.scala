package typings.nightmare.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceError extends js.Object {
  var errorCode: Double
  var errorString: String
  var id: Double
  var url: String
}

object IResourceError {
  @scala.inline
  def apply(errorCode: Double, errorString: String, id: Double, url: String): IResourceError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorString = errorString, id = id, url = url)
  
    __obj.asInstanceOf[IResourceError]
  }
}

