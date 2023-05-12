package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UndefinedAreas extends StObject
@JSImport("photoshop/dom/Constants", "UndefinedAreas")
@js.native
object UndefinedAreas extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UndefinedAreas & String] = js.native
  
  @js.native
  sealed trait REPEATEDGEPIXELS
    extends StObject
       with UndefinedAreas
  /* "repeatEdgePixels" */ val REPEATEDGEPIXELS: typings.photoshop.domConstantsMod.UndefinedAreas.REPEATEDGEPIXELS & String = js.native
  
  @js.native
  sealed trait WRAPAROUND
    extends StObject
       with UndefinedAreas
  /* "wrapAround" */ val WRAPAROUND: typings.photoshop.domConstantsMod.UndefinedAreas.WRAPAROUND & String = js.native
}
