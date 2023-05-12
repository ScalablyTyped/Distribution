package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeOperation extends StObject
@JSImport("photoshop/dom/Constants", "ShapeOperation")
@js.native
object ShapeOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShapeOperation & String] = js.native
  
  @js.native
  sealed trait SHAPEADD
    extends StObject
       with ShapeOperation
  /* "add" */ val SHAPEADD: typings.photoshop.domConstantsMod.ShapeOperation.SHAPEADD & String = js.native
  
  @js.native
  sealed trait SHAPEINTERSECT
    extends StObject
       with ShapeOperation
  /* "intersect" */ val SHAPEINTERSECT: typings.photoshop.domConstantsMod.ShapeOperation.SHAPEINTERSECT & String = js.native
  
  @js.native
  sealed trait SHAPESUBTRACT
    extends StObject
       with ShapeOperation
  /* "subtract" */ val SHAPESUBTRACT: typings.photoshop.domConstantsMod.ShapeOperation.SHAPESUBTRACT & String = js.native
  
  @js.native
  sealed trait SHAPEXOR
    extends StObject
       with ShapeOperation
  /* "xor" */ val SHAPEXOR: typings.photoshop.domConstantsMod.ShapeOperation.SHAPEXOR & String = js.native
}
