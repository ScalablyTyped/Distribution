package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionColumnProperties extends StObject {
  
  /** The padding at the end of the column. */
  var paddingEnd: js.UndefOr[Dimension] = js.undefined
  
  /** Output only. The width of the column. */
  var width: js.UndefOr[Dimension] = js.undefined
}
object SectionColumnProperties {
  
  inline def apply(): SectionColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionColumnProperties]
  }
  
  extension [Self <: SectionColumnProperties](x: Self) {
    
    inline def setPaddingEnd(value: Dimension): Self = StObject.set(x, "paddingEnd", value.asInstanceOf[js.Any])
    
    inline def setPaddingEndUndefined: Self = StObject.set(x, "paddingEnd", js.undefined)
    
    inline def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
