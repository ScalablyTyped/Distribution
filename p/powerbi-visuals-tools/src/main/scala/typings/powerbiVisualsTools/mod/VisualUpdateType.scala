package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisualUpdateType extends StObject
@JSImport("powerbi-visuals-tools", "VisualUpdateType")
@js.native
object VisualUpdateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisualUpdateType & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with VisualUpdateType
  /* 62 */ val All: typings.powerbiVisualsTools.mod.VisualUpdateType.All & Double = js.native
  
  @js.native
  sealed trait Data
    extends StObject
       with VisualUpdateType
  /* 2 */ val Data: typings.powerbiVisualsTools.mod.VisualUpdateType.Data & Double = js.native
  
  @js.native
  sealed trait Resize
    extends StObject
       with VisualUpdateType
  /* 4 */ val Resize: typings.powerbiVisualsTools.mod.VisualUpdateType.Resize & Double = js.native
  
  @js.native
  sealed trait ResizeEnd
    extends StObject
       with VisualUpdateType
  /* 32 */ val ResizeEnd: typings.powerbiVisualsTools.mod.VisualUpdateType.ResizeEnd & Double = js.native
  
  @js.native
  sealed trait Style
    extends StObject
       with VisualUpdateType
  /* 16 */ val Style: typings.powerbiVisualsTools.mod.VisualUpdateType.Style & Double = js.native
  
  @js.native
  sealed trait ViewMode
    extends StObject
       with VisualUpdateType
  /* 8 */ val ViewMode: typings.powerbiVisualsTools.mod.VisualUpdateType.ViewMode & Double = js.native
}
