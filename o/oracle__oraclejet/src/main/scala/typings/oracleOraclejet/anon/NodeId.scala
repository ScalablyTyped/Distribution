package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeId
  extends /* key */ StringDictionary[js.Any] {
  var nodeId: js.Any
}

object NodeId {
  @scala.inline
  def apply(nodeId: js.Any, StringDictionary: /* name */ StringDictionary[js.Any] = null): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodeId]
  }
}

