package typings.photoshop.domConstantsMod

import typings.photoshop.domTypesCalculationsTypesMod.CalculationsLayerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalculationsLayer extends StObject
@JSImport("photoshop/dom/Constants", "CalculationsLayer")
@js.native
object CalculationsLayer extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalculationsLayer & String] = js.native
  
  @js.native
  sealed trait MERGED
    extends StObject
       with CalculationsLayer
       with CalculationsLayerType
  /* "merged" */ val MERGED: typings.photoshop.domConstantsMod.CalculationsLayer.MERGED & String = js.native
}
