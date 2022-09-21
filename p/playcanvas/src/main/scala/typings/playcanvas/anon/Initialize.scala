package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initialize extends StObject {
  
  var initialize: String
  
  var postInitialize: String
  
  var postUpdate: String
  
  var swap: String
  
  var update: String
}
object Initialize {
  
  inline def apply(initialize: String, postInitialize: String, postUpdate: String, swap: String, update: String): Initialize = {
    val __obj = js.Dynamic.literal(initialize = initialize.asInstanceOf[js.Any], postInitialize = postInitialize.asInstanceOf[js.Any], postUpdate = postUpdate.asInstanceOf[js.Any], swap = swap.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initialize]
  }
  
  extension [Self <: Initialize](x: Self) {
    
    inline def setInitialize(value: String): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
    
    inline def setPostInitialize(value: String): Self = StObject.set(x, "postInitialize", value.asInstanceOf[js.Any])
    
    inline def setPostUpdate(value: String): Self = StObject.set(x, "postUpdate", value.asInstanceOf[js.Any])
    
    inline def setSwap(value: String): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
