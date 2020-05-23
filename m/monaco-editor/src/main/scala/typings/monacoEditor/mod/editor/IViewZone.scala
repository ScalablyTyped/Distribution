package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewZone extends js.Object {
  /**
    * The column after which this zone should appear.
    * If not set, the maxLineColumn of `afterLineNumber` will be used.
    */
  var afterColumn: js.UndefOr[Double] = js.undefined
  /**
    * The line number after which this zone should appear.
    * Use 0 to place a view zone before the first line number.
    */
  var afterLineNumber: Double
  /**
    * The dom node of the view zone
    */
  var domNode: HTMLElement
  /**
    * The height in lines of the view zone.
    * If specified, `heightInPx` will be used instead of this.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInLines: js.UndefOr[Double] = js.undefined
  /**
    * The height in px of the view zone.
    * If this is set, the editor will give preference to it rather than `heightInLines` above.
    * If neither `heightInPx` nor `heightInLines` is specified, a default of `heightInLines` = 1 will be chosen.
    */
  var heightInPx: js.UndefOr[Double] = js.undefined
  /**
    * An optional dom node for the view zone that will be placed in the margin area.
    */
  var marginDomNode: js.UndefOr[HTMLElement | Null] = js.undefined
  /**
    * The minimum width in px of the view zone.
    * If this is set, the editor will ensure that the scroll width is >= than this value.
    */
  var minWidthInPx: js.UndefOr[Double] = js.undefined
  /**
    * Callback which gives the height in pixels of the view zone.
    */
  var onComputedHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
  /**
    * Callback which gives the relative top of the view zone as it appears (taking scrolling into account).
    */
  var onDomNodeTop: js.UndefOr[js.Function1[/* top */ Double, Unit]] = js.undefined
  /**
    * Suppress mouse down events.
    * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
    * Defaults to false
    */
  var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
}

object IViewZone {
  @scala.inline
  def apply(
    afterLineNumber: Double,
    domNode: HTMLElement,
    afterColumn: js.UndefOr[Double] = js.undefined,
    heightInLines: js.UndefOr[Double] = js.undefined,
    heightInPx: js.UndefOr[Double] = js.undefined,
    marginDomNode: js.UndefOr[Null | HTMLElement] = js.undefined,
    minWidthInPx: js.UndefOr[Double] = js.undefined,
    onComputedHeight: /* height */ Double => Unit = null,
    onDomNodeTop: /* top */ Double => Unit = null,
    suppressMouseDown: js.UndefOr[Boolean] = js.undefined
  ): IViewZone = {
    val __obj = js.Dynamic.literal(afterLineNumber = afterLineNumber.asInstanceOf[js.Any], domNode = domNode.asInstanceOf[js.Any])
    if (!js.isUndefined(afterColumn)) __obj.updateDynamic("afterColumn")(afterColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightInLines)) __obj.updateDynamic("heightInLines")(heightInLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heightInPx)) __obj.updateDynamic("heightInPx")(heightInPx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginDomNode)) __obj.updateDynamic("marginDomNode")(marginDomNode.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidthInPx)) __obj.updateDynamic("minWidthInPx")(minWidthInPx.get.asInstanceOf[js.Any])
    if (onComputedHeight != null) __obj.updateDynamic("onComputedHeight")(js.Any.fromFunction1(onComputedHeight))
    if (onDomNodeTop != null) __obj.updateDynamic("onDomNodeTop")(js.Any.fromFunction1(onDomNodeTop))
    if (!js.isUndefined(suppressMouseDown)) __obj.updateDynamic("suppressMouseDown")(suppressMouseDown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewZone]
  }
}

