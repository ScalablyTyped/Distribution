package typings.phaser.MatterJS

import typings.phaser.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBound extends StObject {
  
  var max: X
  
  var min: X
}
object IBound {
  
  inline def apply(max: X, min: X): IBound = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBound] (val x: Self) extends AnyVal {
    
    inline def setMax(value: X): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: X): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
