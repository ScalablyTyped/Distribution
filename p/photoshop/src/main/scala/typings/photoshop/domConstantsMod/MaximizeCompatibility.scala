package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaximizeCompatibility extends StObject
@JSImport("photoshop/dom/Constants", "MaximizeCompatibility")
@js.native
object MaximizeCompatibility extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MaximizeCompatibility & String] = js.native
  
  /**
    * Always maximize compatibility.
    */
  @js.native
  sealed trait ALWAYS
    extends StObject
       with MaximizeCompatibility
  /* "queryAlways" */ val ALWAYS: typings.photoshop.domConstantsMod.MaximizeCompatibility.ALWAYS & String = js.native
  
  /**
    * Always ask about maximize compatibility.
    */
  @js.native
  sealed trait ASK
    extends StObject
       with MaximizeCompatibility
  /* "queryAsk" */ val ASK: typings.photoshop.domConstantsMod.MaximizeCompatibility.ASK & String = js.native
  
  /**
    * Never ask about maximize compatibility.
    */
  @js.native
  sealed trait NEVER
    extends StObject
       with MaximizeCompatibility
  /* "queryNever" */ val NEVER: typings.photoshop.domConstantsMod.MaximizeCompatibility.NEVER & String = js.native
}
