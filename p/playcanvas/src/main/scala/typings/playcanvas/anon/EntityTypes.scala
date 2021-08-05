package typings.playcanvas.anon

import typings.playcanvas.pc.Ray
import typings.playcanvas.pc.XrHitTestSource
import typings.playcanvas.pc.callbacks.XrHitTestStart
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityTypes extends StObject {
  
  var callback: js.UndefOr[XrHitTestStart] = js.undefined
  
  var entityTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var offsetRay: js.UndefOr[Ray] = js.undefined
  
  var profile: js.UndefOr[String] = js.undefined
  
  var spaceType: js.UndefOr[String] = js.undefined
}
object EntityTypes {
  
  inline def apply(): EntityTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityTypes]
  }
  
  extension [Self <: EntityTypes](x: Self) {
    
    inline def setCallback(value: (/* err */ Error | Null, /* hitTestSource */ XrHitTestSource | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setOffsetRay(value: Ray): Self = StObject.set(x, "offsetRay", value.asInstanceOf[js.Any])
    
    inline def setOffsetRayUndefined: Self = StObject.set(x, "offsetRay", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSpaceType(value: String): Self = StObject.set(x, "spaceType", value.asInstanceOf[js.Any])
    
    inline def setSpaceTypeUndefined: Self = StObject.set(x, "spaceType", js.undefined)
  }
}
