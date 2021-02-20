package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxWidth[K2, D2] extends StObject {
  
  var label: js.UndefOr[`7`[K2, D2]] = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var rendered: js.UndefOr[on | off] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object MaxWidth {
  
  @scala.inline
  def apply[K2, D2](): MaxWidth[K2, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxWidth[K2, D2]]
  }
  
  @scala.inline
  implicit class MaxWidthMutableBuilder[Self <: MaxWidth[_, _], K2, D2] (val x: Self with (MaxWidth[K2, D2])) extends AnyVal {
    
    @scala.inline
    def setLabel(value: `7`[K2, D2]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setRendered(value: on | off): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
