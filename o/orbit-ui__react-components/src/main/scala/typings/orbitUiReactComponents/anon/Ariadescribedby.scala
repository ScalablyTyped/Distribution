package typings.orbitUiReactComponents.anon

import typings.orbitUiReactComponents.distSharedSrcUseMergedRefsMod.MergedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariadescribedby extends StObject {
  
  var `aria-describedby`: String
  
  var `aria-labelledby`: String
  
  var className: String
  
  var id: String
  
  var ref: MergedRef[Any]
  
  var role: String
}
object Ariadescribedby {
  
  inline def apply(
    `aria-describedby`: String,
    `aria-labelledby`: String,
    className: String,
    id: String,
    ref: MergedRef[Any],
    role: String
  ): Ariadescribedby = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariadescribedby]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ariadescribedby] (val x: Self) extends AnyVal {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRef(value: MergedRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
