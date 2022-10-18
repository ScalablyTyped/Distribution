package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsManualRevalidate extends StObject {
  
  var isManualRevalidate: Boolean
  
  var revalidateOnlyGenerated: Boolean
}
object IsManualRevalidate {
  
  inline def apply(isManualRevalidate: Boolean, revalidateOnlyGenerated: Boolean): IsManualRevalidate = {
    val __obj = js.Dynamic.literal(isManualRevalidate = isManualRevalidate.asInstanceOf[js.Any], revalidateOnlyGenerated = revalidateOnlyGenerated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsManualRevalidate]
  }
  
  extension [Self <: IsManualRevalidate](x: Self) {
    
    inline def setIsManualRevalidate(value: Boolean): Self = StObject.set(x, "isManualRevalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateOnlyGenerated(value: Boolean): Self = StObject.set(x, "revalidateOnlyGenerated", value.asInstanceOf[js.Any])
  }
}
