package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amphtml extends StObject {
  
  var amphtml: js.UndefOr[Boolean] = js.undefined
  
  var dataOnly: js.UndefOr[Boolean] = js.undefined
  
  var hasAmp: js.UndefOr[Boolean] = js.undefined
}
object Amphtml {
  
  inline def apply(): Amphtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amphtml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Amphtml] (val x: Self) extends AnyVal {
    
    inline def setAmphtml(value: Boolean): Self = StObject.set(x, "amphtml", value.asInstanceOf[js.Any])
    
    inline def setAmphtmlUndefined: Self = StObject.set(x, "amphtml", js.undefined)
    
    inline def setDataOnly(value: Boolean): Self = StObject.set(x, "dataOnly", value.asInstanceOf[js.Any])
    
    inline def setDataOnlyUndefined: Self = StObject.set(x, "dataOnly", js.undefined)
    
    inline def setHasAmp(value: Boolean): Self = StObject.set(x, "hasAmp", value.asInstanceOf[js.Any])
    
    inline def setHasAmpUndefined: Self = StObject.set(x, "hasAmp", js.undefined)
  }
}
