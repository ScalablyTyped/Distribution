package typings.parcelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recursive extends StObject {
  
  var includeInline: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object Recursive {
  
  inline def apply(): Recursive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recursive]
  }
  
  extension [Self <: Recursive](x: Self) {
    
    inline def setIncludeInline(value: Boolean): Self = StObject.set(x, "includeInline", value.asInstanceOf[js.Any])
    
    inline def setIncludeInlineUndefined: Self = StObject.set(x, "includeInline", js.undefined)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
