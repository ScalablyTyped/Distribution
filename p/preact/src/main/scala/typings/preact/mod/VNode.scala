package typings.preact.mod

import typings.preact.anon.Children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact Virtual DOM
// -----------------------------------
@js.native
trait VNode[P] extends js.Object {
  /**
  		 * The time that the rendering of this `vnode` was completed. Will only be
  		 * set when the devtools are attached.
  		 * Default value: `-1`
  		 */
  var endTime: js.UndefOr[Double] = js.native
  var key: Key = js.native
  var props: P with Children = js.native
  /**
  		 * ref is not guaranteed by React.ReactElement, for compatibility reasons
  		 * with popular react libs we define it as optional too
  		 */
  var ref: js.UndefOr[Ref[_] | Null] = js.native
  /**
  		 * The time this `vnode` started rendering. Will only be set when
  		 * the devtools are attached.
  		 * Default value: `0`
  		 */
  var startTime: js.UndefOr[Double] = js.native
  var `type`: ComponentType[P] | String = js.native
}

object VNode {
  @scala.inline
  def apply[P](key: Key, props: P with Children, `type`: ComponentType[P] | String): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
  @scala.inline
  implicit class VNodeOps[Self <: VNode[_], P] (val x: Self with VNode[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: P with Children): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ComponentType[P] | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

