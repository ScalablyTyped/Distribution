package typings.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipsMode extends StObject
@JSImport("nouislider", "PipsMode")
@js.native
object PipsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PipsMode & String] = js.native
  
  @js.native
  sealed trait Count
    extends StObject
       with PipsMode
  /* "count" */ val Count: typings.nouislider.mod.PipsMode.Count & String = js.native
  
  @js.native
  sealed trait Positions
    extends StObject
       with PipsMode
  /* "positions" */ val Positions: typings.nouislider.mod.PipsMode.Positions & String = js.native
  
  @js.native
  sealed trait Range
    extends StObject
       with PipsMode
  /* "range" */ val Range: typings.nouislider.mod.PipsMode.Range & String = js.native
  
  @js.native
  sealed trait Steps
    extends StObject
       with PipsMode
  /* "steps" */ val Steps: typings.nouislider.mod.PipsMode.Steps & String = js.native
  
  @js.native
  sealed trait Values
    extends StObject
       with PipsMode
  /* "values" */ val Values: typings.nouislider.mod.PipsMode.Values & String = js.native
}
