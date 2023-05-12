package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PreserveShape extends StObject
@JSImport("photoshop/dom/Constants", "PreserveShape")
@js.native
object PreserveShape extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PreserveShape & String] = js.native
  
  @js.native
  sealed trait ROUNDNESS
    extends StObject
       with PreserveShape
  /* "roundness" */ val ROUNDNESS: typings.photoshop.domConstantsMod.PreserveShape.ROUNDNESS & String = js.native
  
  @js.native
  sealed trait SQUARENESS
    extends StObject
       with PreserveShape
  /* "squareness" */ val SQUARENESS: typings.photoshop.domConstantsMod.PreserveShape.SQUARENESS & String = js.native
}
