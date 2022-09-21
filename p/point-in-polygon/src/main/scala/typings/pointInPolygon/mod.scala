package typings.pointInPolygon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(point: js.Array[Double], polygon: js.Array[js.Array[Double] | Double]): Boolean = (^.asInstanceOf[js.Dynamic].apply(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(point: js.Array[Double], polygon: js.Array[js.Array[Double] | Double], start: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(point: js.Array[Double], polygon: js.Array[js.Array[Double] | Double], start: Double, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(point: js.Array[Double], polygon: js.Array[js.Array[Double] | Double], start: Unit, end: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(point.asInstanceOf[js.Any], polygon.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("point-in-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
