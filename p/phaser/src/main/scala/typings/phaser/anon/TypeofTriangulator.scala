package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTriangulator extends StObject {
  
  /* static member */
  var isConcave: js.Any = js.native
  
  /* static member */
  var positiveArea: js.Any = js.native
  
  /* static member */
  var winding: js.Any = js.native
}
object TypeofTriangulator {
  
  @scala.inline
  def apply(isConcave: js.Any, positiveArea: js.Any, winding: js.Any): TypeofTriangulator = {
    val __obj = js.Dynamic.literal(isConcave = isConcave.asInstanceOf[js.Any], positiveArea = positiveArea.asInstanceOf[js.Any], winding = winding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTriangulator]
  }
  
  @scala.inline
  implicit class TypeofTriangulatorMutableBuilder[Self <: TypeofTriangulator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConcave(value: js.Any): Self = StObject.set(x, "isConcave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveArea(value: js.Any): Self = StObject.set(x, "positiveArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinding(value: js.Any): Self = StObject.set(x, "winding", value.asInstanceOf[js.Any])
  }
}
