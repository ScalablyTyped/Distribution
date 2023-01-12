package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BagAttributes extends StObject {
  
  var bagAttributes: js.UndefOr[String] = js.undefined
  
  var bagId: js.UndefOr[String] = js.undefined
  
  var bagValue: js.UndefOr[String] = js.undefined
}
object BagAttributes {
  
  inline def apply(): BagAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BagAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BagAttributes] (val x: Self) extends AnyVal {
    
    inline def setBagAttributes(value: String): Self = StObject.set(x, "bagAttributes", value.asInstanceOf[js.Any])
    
    inline def setBagAttributesUndefined: Self = StObject.set(x, "bagAttributes", js.undefined)
    
    inline def setBagId(value: String): Self = StObject.set(x, "bagId", value.asInstanceOf[js.Any])
    
    inline def setBagIdUndefined: Self = StObject.set(x, "bagId", js.undefined)
    
    inline def setBagValue(value: String): Self = StObject.set(x, "bagValue", value.asInstanceOf[js.Any])
    
    inline def setBagValueUndefined: Self = StObject.set(x, "bagValue", js.undefined)
  }
}
