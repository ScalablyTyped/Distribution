package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.BlockBehavior
import typings.overlayscrollbars.overlayscrollbarsMod.JQuery
import typings.overlayscrollbars.overlayscrollbarsMod.Margin
import typings.overlayscrollbars.overlayscrollbarsMod.ScrollBehavior
import typings.overlayscrollbars.overlayscrollbarsMod._Coordinates
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends _Coordinates {
  var block: js.UndefOr[BlockBehavior | Anon_XYBlockBehavior | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.undefined
  var el: HTMLElement | JQuery
  var margin: js.UndefOr[
    Margin | Anon_Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.undefined
  var scroll: js.UndefOr[ScrollBehavior | Anon_XY | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(
    el: HTMLElement | JQuery,
    block: BlockBehavior | Anon_XYBlockBehavior | (js.Tuple2[BlockBehavior, BlockBehavior]) = null,
    margin: Margin | Anon_Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin]) = null,
    scroll: ScrollBehavior | Anon_XY | (js.Tuple2[ScrollBehavior, ScrollBehavior]) = null
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Block]
  }
}

