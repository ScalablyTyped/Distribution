package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetFileInfoSuccessResult extends js.Object {
  var digest: String
  var size: Double
}

object IGetFileInfoSuccessResult {
  @scala.inline
  def apply(digest: String, size: Double): IGetFileInfoSuccessResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoSuccessResult]
  }
}

