package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStop extends StObject {
  
  /** The alignment of this tab stop. If unset, the value defaults to START. */
  var alignment: js.UndefOr[String] = js.undefined
  
  /** The offset between this tab stop and the start margin. */
  var offset: js.UndefOr[Dimension] = js.undefined
}
object TabStop {
  
  inline def apply(): TabStop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStop]
  }
  
  extension [Self <: TabStop](x: Self) {
    
    inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setOffset(value: Dimension): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
