package typings.preact.mod

import typings.preact.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact Virtual DOM
// -----------------------------------
trait VNode[P] extends js.Object {
  /**
  		 * The time that the rendering of this `vnode` was completed. Will only be
  		 * set when the devtools are attached.
  		 * Default value: `-1`
  		 */
  var endTime: js.UndefOr[Double] = js.undefined
  var key: Key
  var props: P with Children
  /**
  		 * ref is not guaranteed by React.ReactElement, for compatiblity reasons
  		 * with popular react libs we define it as optional too
  		 */
  var ref: js.UndefOr[Ref[_] | Null] = js.undefined
  /**
  		 * The time this `vnode` started rendering. Will only be set when
  		 * the devtools are attached.
  		 * Default value: `0`
  		 */
  var startTime: js.UndefOr[Double] = js.undefined
  var `type`: ComponentType[P] | String
}

object VNode {
  @scala.inline
  def apply[P](
    key: Key,
    props: P with Children,
    `type`: ComponentType[P] | String,
    endTime: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | Ref[_]] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined
  ): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
}

