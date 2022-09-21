package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisualDataRoleKind extends StObject
@JSImport("powerbi-visuals-tools", "VisualDataRoleKind")
@js.native
object VisualDataRoleKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisualDataRoleKind & Double] = js.native
  
  /** Indicates that the role should be bound to something that evaluates to a grouping of values. */
  @js.native
  sealed trait Grouping
    extends StObject
       with VisualDataRoleKind
  /* 0 */ val Grouping: typings.powerbiVisualsTools.mod.VisualDataRoleKind.Grouping & Double = js.native
  
  /** Indicates that the role can be bound to either Grouping or Measure. */
  @js.native
  sealed trait GroupingOrMeasure
    extends StObject
       with VisualDataRoleKind
  /* 2 */ val GroupingOrMeasure: typings.powerbiVisualsTools.mod.VisualDataRoleKind.GroupingOrMeasure & Double = js.native
  
  /** Indicates that the role should be bound to something that evaluates to a single value in a scope. */
  @js.native
  sealed trait Measure
    extends StObject
       with VisualDataRoleKind
  /* 1 */ val Measure: typings.powerbiVisualsTools.mod.VisualDataRoleKind.Measure & Double = js.native
}
