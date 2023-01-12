package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISafeContents extends StObject {
  
  var safeBags: js.Array[SafeBag[BagType]]
}
object ISafeContents {
  
  inline def apply(safeBags: js.Array[SafeBag[BagType]]): ISafeContents = {
    val __obj = js.Dynamic.literal(safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISafeContents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISafeContents] (val x: Self) extends AnyVal {
    
    inline def setSafeBags(value: js.Array[SafeBag[BagType]]): Self = StObject.set(x, "safeBags", value.asInstanceOf[js.Any])
    
    inline def setSafeBagsVarargs(value: SafeBag[BagType]*): Self = StObject.set(x, "safeBags", js.Array(value*))
  }
}
