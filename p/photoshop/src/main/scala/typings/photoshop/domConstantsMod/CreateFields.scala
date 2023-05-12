package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CreateFields extends StObject
@JSImport("photoshop/dom/Constants", "CreateFields")
@js.native
object CreateFields extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CreateFields & String] = js.native
  
  @js.native
  sealed trait DUPLICATION
    extends StObject
       with CreateFields
  /* "createDroplet" */ val DUPLICATION: typings.photoshop.domConstantsMod.CreateFields.DUPLICATION & String = js.native
  
  @js.native
  sealed trait INTERPOLATION
    extends StObject
       with CreateFields
  /* "createInterpolation" */ val INTERPOLATION: typings.photoshop.domConstantsMod.CreateFields.INTERPOLATION & String = js.native
}
