package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointKind extends StObject
@JSImport("photoshop/dom/Constants", "PointKind")
@js.native
object PointKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PointKind & String] = js.native
  
  @js.native
  sealed trait CORNERPOINT
    extends StObject
       with PointKind
  /* "cornerPoint" */ val CORNERPOINT: typings.photoshop.domConstantsMod.PointKind.CORNERPOINT & String = js.native
  
  @js.native
  sealed trait SMOOTHPOINT
    extends StObject
       with PointKind
  /* "smoothPoint" */ val SMOOTHPOINT: typings.photoshop.domConstantsMod.PointKind.SMOOTHPOINT & String = js.native
}
