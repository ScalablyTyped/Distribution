package typings
package podiumLib.podiumMod.PodiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CriteriaObject extends js.Object {
  /** if true, the listener method receives an additional callback argument which must be called when the method completes. No other event will be emitted until the callback methods is called. The method signature is function(). If block is set to a positive integer, the value is used to set a timeout after which any pending events will be emitted, ignoring the eventual call to callback. Defaults to false (non blocking). */
  var block: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /** a string or array of strings specifying the event channels to subscribe to. If the event registration specified a list of allowed channels, the channels array must match the allowed channels. If channels are specified, event updates without any channel designation will not be included in the subscription. Defaults to no channels filter. */
  var channels: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** if true, the data object passed to podium.emit() is cloned before it is passed to the listener method. Defaults to the event registration option (which defaults to false). */
  @JSName("clone")
  var clone_FCriteriaObject: js.UndefOr[scala.Boolean] = js.undefined
  /** a positive integer indicating the number of times the listener can be called after which the subscription is automatically removed. A count of 1 is the same as calling podium.once(). Defaults to no limit. */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * the event tags (if present) to subscribe to which can be one of:
    *  * a tag string.
    *  * an array of tag strings.
    *  * an object with the following:
    */
  var filter: js.UndefOr[java.lang.String | js.Array[java.lang.String] | CriteriaFilterOptionsObject] = js.undefined
  /** the handler method set to receive event updates. The function signature depends on the block, spread, and tags options. */
  var listener: js.UndefOr[Listener] = js.undefined
  /** the event name string (required). */
  var name: java.lang.String
  /** if true, and the data object passed to podium.emit() is an array, the listener method is called with each array element passed as a separate argument. This should only be used when the emitted data structure is known and predictable. Defaults to the event registration option (which defaults to false). */
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  /** if true and the criteria object passed to podium.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to the arguments list at the end (but before the callback argument if block is set). Defaults to the event registration option (which defaults to false). */
  var tags: js.UndefOr[scala.Boolean] = js.undefined
}

object CriteriaObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    block: scala.Boolean | scala.Double = null,
    channels: java.lang.String | js.Array[java.lang.String] = null,
    clone: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    filter: java.lang.String | js.Array[java.lang.String] | CriteriaFilterOptionsObject = null,
    listener: Listener = null,
    spread: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.UndefOr[scala.Boolean] = js.undefined
  ): CriteriaObject = {
    val __obj = js.Dynamic.literal(name = name)
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (listener != null) __obj.updateDynamic("listener")(listener)
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread)
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CriteriaObject]
  }
}

