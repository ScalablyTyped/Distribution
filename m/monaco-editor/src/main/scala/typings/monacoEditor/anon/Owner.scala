package typings.monacoEditor.anon

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  var owner: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[Uri] = js.undefined
  
  var take: js.UndefOr[Double] = js.undefined
}
object Owner {
  
  inline def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  extension [Self <: Owner](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setResource(value: Uri): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
  }
}
