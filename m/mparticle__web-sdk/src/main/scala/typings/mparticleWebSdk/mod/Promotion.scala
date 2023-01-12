package typings.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promotion extends StObject {
  
  var Creative: js.UndefOr[String] = js.undefined
  
  var Id: String
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Position: js.UndefOr[Double] = js.undefined
}
object Promotion {
  
  inline def apply(Id: String): Promotion = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promotion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Promotion] (val x: Self) extends AnyVal {
    
    inline def setCreative(value: String): Self = StObject.set(x, "Creative", value.asInstanceOf[js.Any])
    
    inline def setCreativeUndefined: Self = StObject.set(x, "Creative", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "Position", js.undefined)
  }
}
