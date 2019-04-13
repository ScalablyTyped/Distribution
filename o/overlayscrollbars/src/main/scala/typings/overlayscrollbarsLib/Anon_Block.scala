package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block
  extends overlayscrollbarsLib.overlayscrollbarsMod._Coordinates {
  var block: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.BlockBehavior | Anon_XYBlockBehavior | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.BlockBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.BlockBehavior
    ])
  ] = js.undefined
  var el: stdLib.HTMLElement | overlayscrollbarsLib.overlayscrollbarsMod.JQuery
  var margin: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.Margin | Anon_Bottom | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin
    ]) | (js.Tuple4[
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin
    ])
  ] = js.undefined
  var scroll: js.UndefOr[
    overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior | Anon_XY | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior
    ])
  ] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(
    el: stdLib.HTMLElement | overlayscrollbarsLib.overlayscrollbarsMod.JQuery,
    block: overlayscrollbarsLib.overlayscrollbarsMod.BlockBehavior | Anon_XYBlockBehavior | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.BlockBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.BlockBehavior
    ]) = null,
    margin: overlayscrollbarsLib.overlayscrollbarsMod.Margin | Anon_Bottom | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin
    ]) | (js.Tuple4[
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin, 
      overlayscrollbarsLib.overlayscrollbarsMod.Margin
    ]) = null,
    scroll: overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior | Anon_XY | (js.Tuple2[
      overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior, 
      overlayscrollbarsLib.overlayscrollbarsMod.ScrollBehavior
    ]) = null
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Block]
  }
}

