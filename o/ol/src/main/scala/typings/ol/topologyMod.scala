package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topologyMod {
  
  @JSImport("ol/geom/flat/topology", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lineStringIsClosed(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lineStringIsClosed")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
