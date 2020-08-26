package typings.podium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CriteriaObject extends js.Object {
  /** if true, the listener method receives an additional callback argument which must be called when the method completes. No other event will be emitted until the callback methods is called. The method signature is function(). If block is set to a positive integer, the value is used to set a timeout after which any pending events will be emitted, ignoring the eventual call to callback. Defaults to false (non blocking). */
  var block: js.UndefOr[Boolean | Double] = js.native
  /** a string or array of strings specifying the event channels to subscribe to. If the event registration specified a list of allowed channels, the channels array must match the allowed channels. If channels are specified, event updates without any channel designation will not be included in the subscription. Defaults to no channels filter. */
  var channels: js.UndefOr[String | js.Array[String]] = js.native
  /** if true, the data object passed to podium.emit() is cloned before it is passed to the listener method. Defaults to the event registration option (which defaults to false). */
  @JSName("clone")
  var clone_FCriteriaObject: js.UndefOr[Boolean] = js.native
  /** a positive integer indicating the number of times the listener can be called after which the subscription is automatically removed. A count of 1 is the same as calling podium.once(). Defaults to no limit. */
  var count: js.UndefOr[Double] = js.native
  /**
    * the event tags (if present) to subscribe to which can be one of:
    *  * a tag string.
    *  * an array of tag strings.
    *  * an object with the following:
    */
  var filter: js.UndefOr[String | js.Array[String] | CriteriaFilterOptionsObject] = js.native
  /** the handler method set to receive event updates. The function signature depends on the block, spread, and tags options. */
  var listener: js.UndefOr[Listener] = js.native
  /** the event name string (required). */
  var name: String = js.native
  /** if true, and the data object passed to podium.emit() is an array, the listener method is called with each array element passed as a separate argument. This should only be used when the emitted data structure is known and predictable. Defaults to the event registration option (which defaults to false). */
  var spread: js.UndefOr[Boolean] = js.native
  /** if true and the criteria object passed to podium.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to the arguments list at the end (but before the callback argument if block is set). Defaults to the event registration option (which defaults to false). */
  var tags: js.UndefOr[Boolean] = js.native
}

object CriteriaObject {
  @scala.inline
  def apply(name: String): CriteriaObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriteriaObject]
  }
  @scala.inline
  implicit class CriteriaObjectOps[Self <: CriteriaObject] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: Boolean | Double): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: String | js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: String | js.Array[String] | CriteriaFilterOptionsObject): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setListener(
      value: (/* data */ js.Any, /* tags */ js.UndefOr[Tags], /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit
    ): Self = this.set("listener", js.Any.fromFunction3(value))
    @scala.inline
    def deleteListener: Self = this.set("listener", js.undefined)
    @scala.inline
    def setSpread(value: Boolean): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
    @scala.inline
    def setTags(value: Boolean): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

