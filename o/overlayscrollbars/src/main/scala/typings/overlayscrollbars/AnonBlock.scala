package typings.overlayscrollbars

import typings.overlayscrollbars.mod.BlockBehavior
import typings.overlayscrollbars.mod.JQuery
import typings.overlayscrollbars.mod.Margin
import typings.overlayscrollbars.mod.ScrollBehavior
import typings.overlayscrollbars.mod._Coordinates
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends _Coordinates {
  var block: js.UndefOr[BlockBehavior | AnonXY | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.undefined
  var el: HTMLElement | JQuery
  var margin: js.UndefOr[
    Margin | AnonBottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.undefined
  var scroll: js.UndefOr[ScrollBehavior | AnonY | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.undefined
}

object AnonBlock {
  @scala.inline
  def apply(
    el: HTMLElement | JQuery,
    block: BlockBehavior | AnonXY | (js.Tuple2[BlockBehavior, BlockBehavior]) = null,
    margin: Margin | AnonBottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin]) = null,
    scroll: ScrollBehavior | AnonY | (js.Tuple2[ScrollBehavior, ScrollBehavior]) = null
  ): AnonBlock = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
}

