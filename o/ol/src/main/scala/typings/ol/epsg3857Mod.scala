package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.projectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object epsg3857Mod {
  
  @JSImport("ol/proj/epsg3857", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/proj/epsg3857", "EXTENT")
  @js.native
  val EXTENT: Extent = js.native
  
  @JSImport("ol/proj/epsg3857", "HALF_SIZE")
  @js.native
  val HALF_SIZE: Double = js.native
  
  @JSImport("ol/proj/epsg3857", "MAX_SAFE_Y")
  @js.native
  val MAX_SAFE_Y: Double = js.native
  
  @JSImport("ol/proj/epsg3857", "PROJECTIONS")
  @js.native
  val PROJECTIONS: js.Array[default] = js.native
  
  @JSImport("ol/proj/epsg3857", "RADIUS")
  @js.native
  val RADIUS: Double = js.native
  
  @JSImport("ol/proj/epsg3857", "WORLD_EXTENT")
  @js.native
  val WORLD_EXTENT: Extent = js.native
  
  inline def fromEPSG4326(input: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG4326")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def fromEPSG4326(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG4326")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def fromEPSG4326(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG4326")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def fromEPSG4326(input: js.Array[Double], opt_output: Unit, opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEPSG4326")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toEPSG4326(input: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toEPSG4326")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toEPSG4326(input: js.Array[Double], opt_output: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toEPSG4326")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def toEPSG4326(input: js.Array[Double], opt_output: js.Array[Double], opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toEPSG4326")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def toEPSG4326(input: js.Array[Double], opt_output: Unit, opt_dimension: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toEPSG4326")(input.asInstanceOf[js.Any], opt_output.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
