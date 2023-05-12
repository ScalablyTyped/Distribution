package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EliminateFields extends StObject
@JSImport("photoshop/dom/Constants", "EliminateFields")
@js.native
object EliminateFields extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EliminateFields & String] = js.native
  
  @js.native
  sealed trait EVENFIELDS
    extends StObject
       with EliminateFields
  /* "eliminateEvenFields" */ val EVENFIELDS: typings.photoshop.domConstantsMod.EliminateFields.EVENFIELDS & String = js.native
  
  @js.native
  sealed trait ODDFIELDS
    extends StObject
       with EliminateFields
  /* "eliminateOddFields" */ val ODDFIELDS: typings.photoshop.domConstantsMod.EliminateFields.ODDFIELDS & String = js.native
}
