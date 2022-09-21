package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: typings.orbitUiReactComponents.sizeMod.Size
}
object Size {
  
  inline def apply(size: typings.orbitUiReactComponents.sizeMod.Size): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setSize(value: typings.orbitUiReactComponents.sizeMod.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
