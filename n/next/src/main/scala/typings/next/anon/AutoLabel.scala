package typings.next.anon

import typings.next.nextStrings.`dev-only`
import typings.next.nextStrings.always
import typings.next.nextStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoLabel extends StObject {
  
  var autoLabel: js.UndefOr[`dev-only` | always | never] = js.undefined
  
  var labelFormat: js.UndefOr[String] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}
object AutoLabel {
  
  inline def apply(): AutoLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLabel]
  }
  
  extension [Self <: AutoLabel](x: Self) {
    
    inline def setAutoLabel(value: `dev-only` | always | never): Self = StObject.set(x, "autoLabel", value.asInstanceOf[js.Any])
    
    inline def setAutoLabelUndefined: Self = StObject.set(x, "autoLabel", js.undefined)
    
    inline def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
