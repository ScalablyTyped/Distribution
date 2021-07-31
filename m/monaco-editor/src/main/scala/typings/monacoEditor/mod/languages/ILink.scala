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
  
  @scala.inline
  def apply(range: IRange): ILink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILink]
  }
  
  @scala.inline
  implicit class ILinkMutableBuilder[Self <: ILink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setUrl(value: Uri | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
