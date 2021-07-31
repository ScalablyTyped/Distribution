package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reverseMod {
  
  @JSImport("ol/geom/flat/reverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def coordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("coordinates")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
