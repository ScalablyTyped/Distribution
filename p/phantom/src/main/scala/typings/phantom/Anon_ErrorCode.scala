package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCode extends js.Object {
  var errorCode: Double
  var errorString: String
  var id: String
  var url: String
}

object Anon_ErrorCode {
  @scala.inline
  def apply(errorCode: Double, errorString: String, id: String, url: String): Anon_ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorString = errorString, id = id, url = url)
  
    __obj.asInstanceOf[Anon_ErrorCode]
  }
}

