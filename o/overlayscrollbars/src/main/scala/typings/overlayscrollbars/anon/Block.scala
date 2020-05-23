package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.BlockBehavior
import typings.overlayscrollbars.mod.JQuery
import typings.overlayscrollbars.mod.Margin
import typings.overlayscrollbars.mod.ScrollBehavior
import typings.overlayscrollbars.mod._Coordinates
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends _Coordinates {
  var block: js.UndefOr[BlockBehavior | XY | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.undefined
  var el: HTMLElement | JQuery
  var margin: js.UndefOr[
    Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.undefined
  var scroll: js.UndefOr[ScrollBehavior | Y | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    el: HTMLElement | JQuery,
    block: BlockBehavior | XY | (js.Tuple2[BlockBehavior, BlockBehavior]) = null,
    margin: Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin]) = null,
    scroll: ScrollBehavior | Y | (js.Tuple2[ScrollBehavior, ScrollBehavior]) = null
  ): Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

