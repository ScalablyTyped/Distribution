package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
  
  var maxSize: String
  
  var position: start | end | bottom | top | auto
  
  var referenceObjectSection: Title
  
  var rendered: on | off | auto
  
  var scrolling: off | asNeeded
  
  var sections: js.Array[Items]
  
  var seriesSection: Title
  
  var size: String
  
  var symbolHeight: Double
  
  var symbolWidth: Double
  
  var textStyle: js.Object
  
  var title: String
  
  var titleHalign: center | end | start
  
  var titleStyle: js.Object
}
object BackgroundColor {
  
  inline def apply(
    backgroundColor: String,
    borderColor: String,
    maxSize: String,
    position: start | end | bottom | top | auto,
    referenceObjectSection: Title,
    rendered: on | off | auto,
    scrolling: off | asNeeded,
    sections: js.Array[Items],
    seriesSection: Title,
    size: String,
    symbolHeight: Double,
    symbolWidth: Double,
    textStyle: js.Object,
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjectSection = referenceObjectSection.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], seriesSection = seriesSection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: start | end | bottom | top | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReferenceObjectSection(value: Title): Self = StObject.set(x, "referenceObjectSection", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: on | off | auto): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setScrolling(value: off | asNeeded): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setSections(value: js.Array[Items]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsVarargs(value: Items*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    inline def setSeriesSection(value: Title): Self = StObject.set(x, "seriesSection", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSymbolHeight(value: Double): Self = StObject.set(x, "symbolHeight", value.asInstanceOf[js.Any])
    
    inline def setSymbolWidth(value: Double): Self = StObject.set(x, "symbolWidth", value.asInstanceOf[js.Any])
    
    inline def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleHalign(value: center | end | start): Self = StObject.set(x, "titleHalign", value.asInstanceOf[js.Any])
    
    inline def setTitleStyle(value: js.Object): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
  }
}
