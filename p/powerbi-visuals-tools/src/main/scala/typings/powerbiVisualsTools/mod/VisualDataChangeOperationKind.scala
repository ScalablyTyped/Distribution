package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisualDataChangeOperationKind extends StObject
@JSImport("powerbi-visuals-tools", "VisualDataChangeOperationKind")
@js.native
object VisualDataChangeOperationKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisualDataChangeOperationKind & Double] = js.native
  
  @js.native
  sealed trait Append
    extends StObject
       with VisualDataChangeOperationKind
  /* 1 */ val Append: typings.powerbiVisualsTools.mod.VisualDataChangeOperationKind.Append & Double = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with VisualDataChangeOperationKind
  /* 0 */ val Create: typings.powerbiVisualsTools.mod.VisualDataChangeOperationKind.Create & Double = js.native
}
