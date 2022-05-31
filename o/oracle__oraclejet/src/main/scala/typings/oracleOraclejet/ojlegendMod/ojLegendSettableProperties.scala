package typings.oracleOraclejet.ojlegendMod

import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

trait ojLegendSettableProperties[K, D]
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  var as: String
  
  var data: (DataProvider[K, D]) | Null
  
  var drilling: on | off
  
  var expanded: KeySet[K] | Null
  
  var halign: center | end | start
  
  var hiddenCategories: js.Array[String]
  
  var hideAndShowBehavior: on | off
  
  var highlightedCategories: js.Array[String]
  
  var hoverBehavior: dim | none
  
  var hoverBehaviorDelay: Double
  
  var orientation: horizontal | vertical
  
  var scrolling: off | asNeeded
  
  var symbolHeight: Double
  
  var symbolWidth: Double
  
  var textStyle: js.UndefOr[js.Object] = js.undefined
  
  @JSName("translations")
  var translations_ojLegendSettableProperties: LabelAndValue
  
  var valign: middle | bottom | top
}
object ojLegendSettableProperties {
  
  inline def apply[K, D](
    as: String,
    drilling: on | off,
    halign: center | end | start,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: on | off,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    orientation: horizontal | vertical,
    scrolling: off | asNeeded,
    symbolHeight: Double,
    symbolWidth: Double,
    trackResize: on | off,
    translations: LabelAndValue,
    valign: middle | bottom | top
  ): ojLegendSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], data = null, expanded = null)
    __obj.asInstanceOf[ojLegendSettableProperties[K, D]]
  }
  
  extension [Self <: ojLegendSettableProperties[?, ?], K, D](x: Self & (ojLegendSettableProperties[K, D])) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setData(value: DataProvider[K, D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDrilling(value: on | off): Self = StObject.set(x, "drilling", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: KeySet[K]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedNull: Self = StObject.set(x, "expanded", null)
    
    inline def setHalign(value: center | end | start): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    inline def setHideAndShowBehavior(value: on | off): Self = StObject.set(x, "hideAndShowBehavior", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setScrolling(value: off | asNeeded): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setSymbolHeight(value: Double): Self = StObject.set(x, "symbolHeight", value.asInstanceOf[js.Any])
    
    inline def setSymbolWidth(value: Double): Self = StObject.set(x, "symbolWidth", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setValign(value: middle | bottom | top): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
  }
}
