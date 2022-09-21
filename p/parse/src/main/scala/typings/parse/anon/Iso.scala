package typings.parse.anon

import typings.parse.mod.global.Parse.Object._Encode
import typings.parse.parseStrings.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iso
  extends StObject
     with _Encode[Any] {
  
  var __type: Date
  
  var iso: String
}
object Iso {
  
  inline def apply(iso: String): Iso = {
    val __obj = js.Dynamic.literal(__type = "Date", iso = iso.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iso]
  }
  
  extension [Self <: Iso](x: Self) {
    
    inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def set__type(value: Date): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
