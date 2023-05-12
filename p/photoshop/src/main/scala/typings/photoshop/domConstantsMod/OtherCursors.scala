package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OtherCursors extends StObject
@JSImport("photoshop/dom/Constants", "OtherCursors")
@js.native
object OtherCursors extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OtherCursors & String] = js.native
  
  /**
    * Use crosshair cursors for tools.
    */
  @js.native
  sealed trait PRECISE
    extends StObject
       with OtherCursors
  /* "precise" */ val PRECISE: typings.photoshop.domConstantsMod.OtherCursors.PRECISE & String = js.native
  
  /**
    * Use small iconic cursors for tools.
    */
  @js.native
  sealed trait STANDARD
    extends StObject
       with OtherCursors
  /* "standard" */ val STANDARD: typings.photoshop.domConstantsMod.OtherCursors.STANDARD & String = js.native
}
