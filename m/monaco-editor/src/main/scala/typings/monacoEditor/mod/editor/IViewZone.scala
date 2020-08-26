package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewZone extends js.Object {
  /**
    * The column after which this zone should appear.
    * If not set, the maxLineColumn of `afterLineNumber` will be used.
    */
  var afterColumn: js.UndefOr[Double] = js.native
  /**
    * The line number after which this zone should appear.
    * Use 0 to place a view zone before the first line number.
    */
  var afterLineNumber: Double = js.native
  /**
    * The dom node of the view zone
    */
  var domNode: HTMLElement = js.native
  /**
    * The height in lines of the view zone.
    * If specified, `heightInPx` will be used instead of this.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInLines: js.UndefOr[Double] = js.native
  /**
    * The height in px of the view zone.
    * If this is set, the editor will give preference to it rather than `heightInLines` above.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInPx: js.UndefOr[Double] = js.native
  /**
    * An optional dom node for the view zone that will be placed in the margin area.
    */
  var marginDomNode: js.UndefOr[HTMLElement | Null] = js.native
  /**
    * The minimum width in px of the view zone.
    * If this is set, the editor will ensure that the scroll width is >= than this value.
    */
  var minWidthInPx: js.UndefOr[Double] = js.native
  /**
    * Callback which gives the height in pixels of the view zone.
    */
  var onComputedHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.native
  /**
    * Callback which gives the relative top of the view zone as it appears (taking scrolling into account).
    */
  var onDomNodeTop: js.UndefOr[js.Function1[/* top */ Double, Unit]] = js.native
  /**
    * Suppress mouse down events.
    * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
    * Defaults to false
    */
  var suppressMouseDown: js.UndefOr[Boolean] = js.native
}

object IViewZone {
  @scala.inline
  def apply(afterLineNumber: Double, domNode: HTMLElement): IViewZone = {
    val __obj = js.Dynamic.literal(afterLineNumber = afterLineNumber.asInstanceOf[js.Any], domNode = domNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewZone]
  }
  @scala.inline
  implicit class IViewZoneOps[Self <: IViewZone] (val x: Self) extends AnyVal {
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
    def setAfterLineNumber(value: Double): Self = this.set("afterLineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomNode(value: HTMLElement): Self = this.set("domNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterColumn(value: Double): Self = this.set("afterColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfterColumn: Self = this.set("afterColumn", js.undefined)
    @scala.inline
    def setHeightInLines(value: Double): Self = this.set("heightInLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightInLines: Self = this.set("heightInLines", js.undefined)
    @scala.inline
    def setHeightInPx(value: Double): Self = this.set("heightInPx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightInPx: Self = this.set("heightInPx", js.undefined)
    @scala.inline
    def setMarginDomNode(value: HTMLElement): Self = this.set("marginDomNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginDomNode: Self = this.set("marginDomNode", js.undefined)
    @scala.inline
    def setMarginDomNodeNull: Self = this.set("marginDomNode", null)
    @scala.inline
    def setMinWidthInPx(value: Double): Self = this.set("minWidthInPx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidthInPx: Self = this.set("minWidthInPx", js.undefined)
    @scala.inline
    def setOnComputedHeight(value: /* height */ Double => Unit): Self = this.set("onComputedHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComputedHeight: Self = this.set("onComputedHeight", js.undefined)
    @scala.inline
    def setOnDomNodeTop(value: /* top */ Double => Unit): Self = this.set("onDomNodeTop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDomNodeTop: Self = this.set("onDomNodeTop", js.undefined)
    @scala.inline
    def setSuppressMouseDown(value: Boolean): Self = this.set("suppressMouseDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMouseDown: Self = this.set("suppressMouseDown", js.undefined)
  }
  
}

