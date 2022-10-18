package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var className: String
  
  var id: String
  
  var ref: MergedRef[Any]
}
object Id {
  
  inline def apply(className: String, id: String, ref: MergedRef[Any]): Id = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRef(value: MergedRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
