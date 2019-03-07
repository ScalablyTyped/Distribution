package typings
package olLib.renderFeatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lightweight, read-only, {@link ol.Feature} and {@link ol.geom.Geometry} like
  * structure, optimized for rendering and styling. Geometry access through the
  * API is limited to getting the type and extent of the geometry.
  *
  * @param type Geometry type.
  * @param flatCoordinates Flat coordinates. These always need
  *     to be right-handed for polygons.
  * @param ends Ends or Endss.
  * @param properties Properties.
  */
@JSImport("ol/render/Feature", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.renderNs.Feature {
  /**
    * Lightweight, read-only, {@link ol.Feature} and {@link ol.geom.Geometry} like
    * structure, optimized for rendering and styling. Geometry access through the
    * API is limited to getting the type and extent of the geometry.
    *
    * @param type Geometry type.
    * @param flatCoordinates Flat coordinates. These always need
    *     to be right-handed for polygons.
    * @param ends Ends or Endss.
    * @param properties Properties.
    */
  def this(`type`: openlayersLib.openlayersMod.geomNs.GeometryType, flatCoordinates: js.Array[scala.Double], ends: js.Array[js.Array[scala.Double] | scala.Double], properties: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

