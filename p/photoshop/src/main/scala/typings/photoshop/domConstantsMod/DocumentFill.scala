package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentFill extends StObject
@JSImport("photoshop/dom/Constants", "DocumentFill")
@js.native
object DocumentFill extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentFill & String] = js.native
  
  @js.native
  sealed trait BACKGROUNDCOLOR
    extends StObject
       with DocumentFill
  /* "backgroundColor" */ val BACKGROUNDCOLOR: typings.photoshop.domConstantsMod.DocumentFill.BACKGROUNDCOLOR & String = js.native
  
  @js.native
  sealed trait BLACK
    extends StObject
       with DocumentFill
  /* "black" */ val BLACK: typings.photoshop.domConstantsMod.DocumentFill.BLACK & String = js.native
  
  @js.native
  sealed trait COLOR
    extends StObject
       with DocumentFill
  /* "color" */ val COLOR: typings.photoshop.domConstantsMod.DocumentFill.COLOR & String = js.native
  
  @js.native
  sealed trait TRANSPARENT
    extends StObject
       with DocumentFill
  /* "transparent" */ val TRANSPARENT: typings.photoshop.domConstantsMod.DocumentFill.TRANSPARENT & String = js.native
  
  @js.native
  sealed trait WHITE
    extends StObject
       with DocumentFill
  /* "white" */ val WHITE: typings.photoshop.domConstantsMod.DocumentFill.WHITE & String = js.native
}
