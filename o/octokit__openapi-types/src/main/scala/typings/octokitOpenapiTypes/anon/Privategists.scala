package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privategists extends StObject {
  
  var private_gists: js.UndefOr[Double] = js.undefined
  
  var public_gists: js.UndefOr[Double] = js.undefined
  
  var total_gists: js.UndefOr[Double] = js.undefined
}
object Privategists {
  
  inline def apply(): Privategists = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privategists]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Privategists] (val x: Self) extends AnyVal {
    
    inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
    
    inline def setPrivate_gistsUndefined: Self = StObject.set(x, "private_gists", js.undefined)
    
    inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
    
    inline def setPublic_gistsUndefined: Self = StObject.set(x, "public_gists", js.undefined)
    
    inline def setTotal_gists(value: Double): Self = StObject.set(x, "total_gists", value.asInstanceOf[js.Any])
    
    inline def setTotal_gistsUndefined: Self = StObject.set(x, "total_gists", js.undefined)
  }
}
