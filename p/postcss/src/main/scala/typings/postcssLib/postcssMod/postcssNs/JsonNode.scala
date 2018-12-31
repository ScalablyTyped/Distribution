package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonNode extends js.Object {
  /**
    * Returns the node's parent node.
    */
  var parent: js.UndefOr[JsonContainer] = js.undefined
  /**
    * Contains information to generate byte-to-byte equal node string as it
    * was in origin input.
    */
  var raws: js.UndefOr[NodeRaws] = js.undefined
  /**
    * Returns the input source of the node. The property is used in source
    * map generation. If you create a node manually (e.g., with
    * postcss.decl() ), that node will not have a  source  property and
    * will be absent from the source map. For this reason, the plugin
    * developer should consider cloning nodes to create new ones (in which
    * case the new node's source will reference the original, cloned node)
    * or setting the source property manually.
    */
  var source: js.UndefOr[NodeSource] = js.undefined
  /**
    * Returns a string representing the node's type. Possible values are
    * root, atrule, rule, decl or comment.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

