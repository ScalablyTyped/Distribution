package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  /** The contents of the footer. The indexes for a footer's content begin at zero. */
  var content: js.UndefOr[js.Array[StructuralElement]] = js.undefined
  
  /** The ID of the footer. */
  var footerId: js.UndefOr[String] = js.undefined
}
object Footer {
  
  inline def apply(): Footer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footer]
  }
  
  extension [Self <: Footer](x: Self) {
    
    inline def setContent(value: js.Array[StructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: StructuralElement*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    inline def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}
