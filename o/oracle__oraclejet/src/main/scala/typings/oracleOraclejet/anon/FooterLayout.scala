package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings._empty
import typings.oracleOraclejet.oracleOraclejetStrings.focus
import typings.oracleOraclejet.oracleOraclejetStrings.image
import typings.oracleOraclejet.oracleOraclejetStrings.now
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterLayout extends StObject {
  
  var footerLayout: _empty | now
  
  var showOn: focus | image
  
  var timeIncrement: String
}
object FooterLayout {
  
  inline def apply(footerLayout: _empty | now, showOn: focus | image, timeIncrement: String): FooterLayout = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FooterLayout] (val x: Self) extends AnyVal {
    
    inline def setFooterLayout(value: _empty | now): Self = StObject.set(x, "footerLayout", value.asInstanceOf[js.Any])
    
    inline def setShowOn(value: focus | image): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setTimeIncrement(value: String): Self = StObject.set(x, "timeIncrement", value.asInstanceOf[js.Any])
  }
}
