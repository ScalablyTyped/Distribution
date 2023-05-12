package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewZone extends StObject {
  
  /**
    * The column after which this zone should appear.
    * If not set, the maxLineColumn of `afterLineNumber` will be used.
    * This is relevant for wrapped lines.
    */
  var afterColumn: js.UndefOr[Double] = js.undefined
  
  /**
    * If the `afterColumn` has multiple view columns, the affinity specifies which one to use. Defaults to `none`.
    */
  var afterColumnAffinity: js.UndefOr[PositionAffinity] = js.undefined
  
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
    * Tiebreaker that is used when multiple view zones want to be after the same line.
    * Defaults to `afterColumn` otherwise 10000;
    */
  var ordinal: js.UndefOr[Double] = js.undefined
  
  /**
    * Render the zone even when its line is hidden.
    */
  var showInHiddenAreas: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Suppress mouse down events.
    * If set, the editor will attach a mouse down listener to the view zone and .preventDefault on it.
    * Defaults to false
    */
  var suppressMouseDown: js.UndefOr[Boolean] = js.undefined
}
object IViewZone {
  
  inline def apply(afterLineNumber: Double, domNode: HTMLElement): IViewZone = {
    val __obj = js.Dynamic.literal(afterLineNumber = afterLineNumber.asInstanceOf[js.Any], domNode = domNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IViewZone] (val x: Self) extends AnyVal {
    
    inline def setAfterColumn(value: Double): Self = StObject.set(x, "afterColumn", value.asInstanceOf[js.Any])
    
    inline def setAfterColumnAffinity(value: PositionAffinity): Self = StObject.set(x, "afterColumnAffinity", value.asInstanceOf[js.Any])
    
    inline def setAfterColumnAffinityUndefined: Self = StObject.set(x, "afterColumnAffinity", js.undefined)
    
    inline def setAfterColumnUndefined: Self = StObject.set(x, "afterColumn", js.undefined)
    
    inline def setAfterLineNumber(value: Double): Self = StObject.set(x, "afterLineNumber", value.asInstanceOf[js.Any])
    
    inline def setDomNode(value: HTMLElement): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
    
    inline def setHeightInLines(value: Double): Self = StObject.set(x, "heightInLines", value.asInstanceOf[js.Any])
    
    inline def setHeightInLinesUndefined: Self = StObject.set(x, "heightInLines", js.undefined)
    
    inline def setHeightInPx(value: Double): Self = StObject.set(x, "heightInPx", value.asInstanceOf[js.Any])
    
    inline def setHeightInPxUndefined: Self = StObject.set(x, "heightInPx", js.undefined)
    
    inline def setMarginDomNode(value: HTMLElement): Self = StObject.set(x, "marginDomNode", value.asInstanceOf[js.Any])
    
    inline def setMarginDomNodeNull: Self = StObject.set(x, "marginDomNode", null)
    
    inline def setMarginDomNodeUndefined: Self = StObject.set(x, "marginDomNode", js.undefined)
    
    inline def setMinWidthInPx(value: Double): Self = StObject.set(x, "minWidthInPx", value.asInstanceOf[js.Any])
    
    inline def setMinWidthInPxUndefined: Self = StObject.set(x, "minWidthInPx", js.undefined)
    
    inline def setOnComputedHeight(value: /* height */ Double => Unit): Self = StObject.set(x, "onComputedHeight", js.Any.fromFunction1(value))
    
    inline def setOnComputedHeightUndefined: Self = StObject.set(x, "onComputedHeight", js.undefined)
    
    inline def setOnDomNodeTop(value: /* top */ Double => Unit): Self = StObject.set(x, "onDomNodeTop", js.Any.fromFunction1(value))
    
    inline def setOnDomNodeTopUndefined: Self = StObject.set(x, "onDomNodeTop", js.undefined)
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setShowInHiddenAreas(value: Boolean): Self = StObject.set(x, "showInHiddenAreas", value.asInstanceOf[js.Any])
    
    inline def setShowInHiddenAreasUndefined: Self = StObject.set(x, "showInHiddenAreas", js.undefined)
    
    inline def setSuppressMouseDown(value: Boolean): Self = StObject.set(x, "suppressMouseDown", value.asInstanceOf[js.Any])
    
    inline def setSuppressMouseDownUndefined: Self = StObject.set(x, "suppressMouseDown", js.undefined)
  }
}
