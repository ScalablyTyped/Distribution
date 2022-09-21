package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISupportDict extends StObject {
  
  var uint32Indices: Boolean
}
object ISupportDict {
  
  inline def apply(uint32Indices: Boolean): ISupportDict = {
    val __obj = js.Dynamic.literal(uint32Indices = uint32Indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISupportDict]
  }
  
  extension [Self <: ISupportDict](x: Self) {
    
    inline def setUint32Indices(value: Boolean): Self = StObject.set(x, "uint32Indices", value.asInstanceOf[js.Any])
  }
}
