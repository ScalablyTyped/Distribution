package typings.polygonSelfintersect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polygon-selfintersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findSelfIntersections(points: js.Array[js.Array[Double]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("findSelfIntersections")(points.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def findSelfIntersections(points: js.Array[js.Array[Double]], findAllLines: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("findSelfIntersections")(points.asInstanceOf[js.Any], findAllLines.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getSelfIntersectLines(): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelfIntersectLines")().asInstanceOf[js.Array[js.Array[Double]]]
}
