package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpherizeMode extends StObject
@JSImport("photoshop/dom/Constants", "SpherizeMode")
@js.native
object SpherizeMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SpherizeMode & String] = js.native
  
  @js.native
  sealed trait HORIZONTAL
    extends StObject
       with SpherizeMode
  /* "horizontalOnly" */ val HORIZONTAL: typings.photoshop.domConstantsMod.SpherizeMode.HORIZONTAL & String = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with SpherizeMode
  /* "normal" */ val NORMAL: typings.photoshop.domConstantsMod.SpherizeMode.NORMAL & String = js.native
  
  @js.native
  sealed trait VERTICAL
    extends StObject
       with SpherizeMode
  /* "verticalOnly" */ val VERTICAL: typings.photoshop.domConstantsMod.SpherizeMode.VERTICAL & String = js.native
}
