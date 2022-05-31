package typings.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendSettableProperties<K, D>> */
trait ojLegendSettablePropertiesLenient[K, D]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var as: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.undefined
  
  var drilling: js.UndefOr[on | off] = js.undefined
  
  var expanded: js.UndefOr[KeySet[K] | Null] = js.undefined
  
  var halign: js.UndefOr[center | end | start] = js.undefined
  
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var hideAndShowBehavior: js.UndefOr[on | off] = js.undefined
  
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var scrolling: js.UndefOr[off | asNeeded] = js.undefined
  
  var symbolHeight: js.UndefOr[Double] = js.undefined
  
  var symbolWidth: js.UndefOr[Double] = js.undefined
  
  var textStyle: js.UndefOr[js.Object] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  
  var valign: js.UndefOr[middle | bottom | top] = js.undefined
}
object ojLegendSettablePropertiesLenient {
  
  inline def apply[K, D](): ojLegendSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLegendSettablePropertiesLenient[K, D]]
  }
  
  extension [Self <: ojLegendSettablePropertiesLenient[?, ?], K, D](x: Self & (ojLegendSettablePropertiesLenient[K, D])) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDrilling(value: on | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    inline def setDrillingUndefined: Self = StObject.set(x, "drilling", js.undefined)
    
    inline def setExpanded(value: KeySet[K]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedNull: Self = StObject.set(x, "expanded", null)
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setHalign(value: center | end | start): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
    
    inline def setHalignUndefined: Self = StObject.set(x, "halign", js.undefined)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesUndefined: Self = StObject.set(x, "hiddenCategories", js.undefined)
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    inline def setHideAndShowBehavior(value: on | off): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    inline def setHideAndShowBehaviorUndefined: Self = StObject.set(x, "hideAndShowBehavior", js.undefined)
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesUndefined: Self = StObject.set(x, "highlightedCategories", js.undefined)
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelayUndefined: Self = StObject.set(x, "hoverBehaviorDelay", js.undefined)
    
    inline def setHoverBehaviorUndefined: Self = StObject.set(x, "hoverBehavior", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScrolling(value: off | asNeeded): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSymbolHeight(value: Double): Self = StObject.set(x, "symbolHeight", value.asInstanceOf[js.Any])
    
    inline def setSymbolHeightUndefined: Self = StObject.set(x, "symbolHeight", js.undefined)
    
    inline def setSymbolWidth(value: Double): Self = StObject.set(x, "symbolWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolWidthUndefined: Self = StObject.set(x, "symbolWidth", js.undefined)
    
    inline def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValign(value: middle | bottom | top): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
  }
}
