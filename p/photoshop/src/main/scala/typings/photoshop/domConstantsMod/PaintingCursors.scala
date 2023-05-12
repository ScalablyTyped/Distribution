package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaintingCursors extends StObject
@JSImport("photoshop/dom/Constants", "PaintingCursors")
@js.native
object PaintingCursors extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PaintingCursors & String] = js.native
  
  /**
    * Displays cursors as brush shapes representing the size of the current brush
    * where boundaries have 50% brush opacity
    */
  @js.native
  sealed trait BRUSHSIZE
    extends StObject
       with PaintingCursors
  /* "brushSize" */ val BRUSHSIZE: typings.photoshop.domConstantsMod.PaintingCursors.BRUSHSIZE & String = js.native
  
  /**
    * Use the full size of the brush regardless of brush opacity
    */
  @js.native
  sealed trait FULLSIZE
    extends StObject
       with PaintingCursors
  /* "fullSize" */ val FULLSIZE: typings.photoshop.domConstantsMod.PaintingCursors.FULLSIZE & String = js.native
  
  /**
    * Use crosshair cursors when painting.
    */
  @js.native
  sealed trait PRECISE
    extends StObject
       with PaintingCursors
  /* "precise" */ val PRECISE: typings.photoshop.domConstantsMod.PaintingCursors.PRECISE & String = js.native
  
  /**
    * Use small iconic cursors when painting.
    */
  @js.native
  sealed trait STANDARD
    extends StObject
       with PaintingCursors
  /* "standard" */ val STANDARD: typings.photoshop.domConstantsMod.PaintingCursors.STANDARD & String = js.native
}
