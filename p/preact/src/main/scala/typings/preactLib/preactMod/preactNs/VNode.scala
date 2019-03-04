package typings
package preactLib.preactMod.preactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Define the contract for a virtual node in preact.
	 *
	 * A virtual node has a name, a map of attributes, an array
	 * of child {VNode}s and a key. The key is used by preact for
	 * internal purposes.
	 */
trait VNode[P] extends js.Object {
  var attributes: P
  var children: js.Array[VNode[_] | java.lang.String]
  var key: js.UndefOr[Key | scala.Null] = js.undefined
  var nodeName: ComponentFactory[P] | java.lang.String
}

object VNode {
  @scala.inline
  def apply[P](
    attributes: P,
    children: js.Array[VNode[_] | java.lang.String],
    nodeName: ComponentFactory[P] | java.lang.String,
    key: Key = null
  ): VNode[P] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children, nodeName = nodeName.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
}

