package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILink extends StObject {
  
  var range: IRange
  
  var tooltip: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[Uri | String] = js.undefined
}
object ILink {
  
  inline def apply(range: IRange): ILink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILink]
  }
  
  extension [Self <: ILink](x: Self) {
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setUrl(value: Uri | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
