package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Geometry extends StObject
@JSImport("photoshop/dom/Constants", "Geometry")
@js.native
object Geometry extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Geometry & String] = js.native
  
  @js.native
  sealed trait HEPTAGON
    extends StObject
       with Geometry
  /* "heptagon" */ val HEPTAGON: typings.photoshop.domConstantsMod.Geometry.HEPTAGON & String = js.native
  
  @js.native
  sealed trait HEXAGON
    extends StObject
       with Geometry
  /* "hexagon" */ val HEXAGON: typings.photoshop.domConstantsMod.Geometry.HEXAGON & String = js.native
  
  @js.native
  sealed trait OCTAGON
    extends StObject
       with Geometry
  /* "octagon" */ val OCTAGON: typings.photoshop.domConstantsMod.Geometry.OCTAGON & String = js.native
  
  @js.native
  sealed trait PENTAGON
    extends StObject
       with Geometry
  /* "pentagon" */ val PENTAGON: typings.photoshop.domConstantsMod.Geometry.PENTAGON & String = js.native
  
  @js.native
  sealed trait SQUARE
    extends StObject
       with Geometry
  /* "square" */ val SQUARE: typings.photoshop.domConstantsMod.Geometry.SQUARE & String = js.native
  
  @js.native
  sealed trait TRIANGLE
    extends StObject
       with Geometry
  /* "triangle" */ val TRIANGLE: typings.photoshop.domConstantsMod.Geometry.TRIANGLE & String = js.native
}
