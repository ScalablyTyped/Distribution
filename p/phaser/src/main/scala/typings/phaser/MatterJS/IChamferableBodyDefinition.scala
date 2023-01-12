package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChamferableBodyDefinition
  extends StObject
     with IBodyDefinition {
  
  var chamfer: js.UndefOr[IChamfer] = js.undefined
}
object IChamferableBodyDefinition {
  
  inline def apply(): IChamferableBodyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChamferableBodyDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IChamferableBodyDefinition] (val x: Self) extends AnyVal {
    
    inline def setChamfer(value: IChamfer): Self = StObject.set(x, "chamfer", value.asInstanceOf[js.Any])
    
    inline def setChamferUndefined: Self = StObject.set(x, "chamfer", js.undefined)
  }
}
