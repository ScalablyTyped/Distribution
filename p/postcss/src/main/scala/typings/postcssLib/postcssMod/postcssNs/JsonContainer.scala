package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JsonContainer extends JsonNode {
  /**
           * @returns The container's first child.
           */
  var first: js.UndefOr[Node] = js.undefined
  /**
           * @returns The container's last child.
           */
  var last: js.UndefOr[Node] = js.undefined
  /**
           * Contains the container's children.
           */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
}

