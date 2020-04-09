package typings.next

import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaths[P /* <: ParsedUrlQuery */] extends js.Object {
  var fallback: Boolean
  var paths: js.Array[String | AnonParamsP[P]]
}

object AnonPaths {
  @scala.inline
  def apply[P /* <: ParsedUrlQuery */](fallback: Boolean, paths: js.Array[String | AnonParamsP[P]]): AnonPaths[P] = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPaths[P]]
  }
}

