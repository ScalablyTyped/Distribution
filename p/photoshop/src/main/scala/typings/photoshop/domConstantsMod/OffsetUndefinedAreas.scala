package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OffsetUndefinedAreas extends StObject
@JSImport("photoshop/dom/Constants", "OffsetUndefinedAreas")
@js.native
object OffsetUndefinedAreas extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OffsetUndefinedAreas & String] = js.native
  
  @js.native
  sealed trait REPEATEDGEPIXELS
    extends StObject
       with OffsetUndefinedAreas
  /* "repeat" */ val REPEATEDGEPIXELS: typings.photoshop.domConstantsMod.OffsetUndefinedAreas.REPEATEDGEPIXELS & String = js.native
  
  @js.native
  sealed trait SETTOBACKGROUND
    extends StObject
       with OffsetUndefinedAreas
  /* "background" */ val SETTOBACKGROUND: typings.photoshop.domConstantsMod.OffsetUndefinedAreas.SETTOBACKGROUND & String = js.native
  
  @js.native
  sealed trait WRAPAROUND
    extends StObject
       with OffsetUndefinedAreas
  /* "wrap" */ val WRAPAROUND: typings.photoshop.domConstantsMod.OffsetUndefinedAreas.WRAPAROUND & String = js.native
}
