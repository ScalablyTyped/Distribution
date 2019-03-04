package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block
  extends overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs._Coordinates {
  var block: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior | Anon_XYBlockBehavior | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior
    ])
  ] = js.undefined
  var el: stdLib.HTMLElement | overlayscrollbarsLib.overlayscrollbarsMod.JQuery
  var margin: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin | Anon_Bottom | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin
    ]) | (js.Tuple4[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin
    ])
  ] = js.undefined
  var scroll: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollBehavior | Anon_XY | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollBehavior
    ])
  ] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement | overlayscrollbarsLib.overlayscrollbarsMod.JQuery,
    block: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior | Anon_XYBlockBehavior | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.BlockBehavior
    ]) = null,
    margin: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin | Anon_Bottom | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin
    ]) | (js.Tuple4[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin
    ]) = null,
    scroll: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollBehavior | Anon_XY | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.ScrollBehavior
    ]) = null
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Block]
  }
}

