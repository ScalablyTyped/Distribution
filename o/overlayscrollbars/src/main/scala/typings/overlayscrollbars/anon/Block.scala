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

@js.native
trait Block extends _Coordinates {
  var block: js.UndefOr[BlockBehavior | XY | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.native
  var el: HTMLElement | JQuery = js.native
  var margin: js.UndefOr[
    Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.native
  var scroll: js.UndefOr[ScrollBehavior | Y | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.native
}

object Block {
  @scala.inline
  def apply(el: HTMLElement | JQuery): Block = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setEl(value: HTMLElement | JQuery): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlock(value: BlockBehavior | XY | (js.Tuple2[BlockBehavior, BlockBehavior])): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setMargin(value: Margin | Bottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setScroll(value: ScrollBehavior | Y | (js.Tuple2[ScrollBehavior, ScrollBehavior])): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
  
}

