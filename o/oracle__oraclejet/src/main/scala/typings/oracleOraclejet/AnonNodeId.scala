package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeId
  extends /* propName */ StringDictionary[js.Any] {
  var nodeId: js.Any
}

object AnonNodeId {
  @scala.inline
  def apply(nodeId: js.Any, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonNodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonNodeId]
  }
}

