package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MatteColor extends StObject
@JSImport("photoshop/dom/Constants", "MatteColor")
@js.native
object MatteColor extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MatteColor & String] = js.native
  
  @js.native
  sealed trait BACKGROUND
    extends StObject
       with MatteColor
  /* "backgroundColor" */ val BACKGROUND: typings.photoshop.domConstantsMod.MatteColor.BACKGROUND & String = js.native
  
  @js.native
  sealed trait BLACK
    extends StObject
       with MatteColor
  /* "black" */ val BLACK: typings.photoshop.domConstantsMod.MatteColor.BLACK & String = js.native
  
  @js.native
  sealed trait FOREGROUND
    extends StObject
       with MatteColor
  /* "foregroundColor" */ val FOREGROUND: typings.photoshop.domConstantsMod.MatteColor.FOREGROUND & String = js.native
  
  @js.native
  sealed trait NETSCAPE
    extends StObject
       with MatteColor
  /* "netscapeGray" */ val NETSCAPE: typings.photoshop.domConstantsMod.MatteColor.NETSCAPE & String = js.native
  
  @js.native
  sealed trait SEMIGRAY
    extends StObject
       with MatteColor
  /* "gray50" */ val SEMIGRAY: typings.photoshop.domConstantsMod.MatteColor.SEMIGRAY & String = js.native
  
  @js.native
  sealed trait WHITE
    extends StObject
       with MatteColor
  /* "white" */ val WHITE: typings.photoshop.domConstantsMod.MatteColor.WHITE & String = js.native
}
