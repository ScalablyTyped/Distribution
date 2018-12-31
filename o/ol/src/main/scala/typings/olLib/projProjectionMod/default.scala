package typings
package olLib.projProjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Projection definition class. One of these is created for each projection
  * supported in the application and stored in the {@link ol.proj} namespace.
  * You can use these in applications, but this is not required, as API params
  * and options use {@link ol.ProjectionLike} which means the simple string
  * code will suffice.
  *
  * You can use {@link ol.proj.get} to retrieve the object for a particular
  * projection.
  *
  * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
  * with the following aliases:
  * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
  *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
  *     http://www.opengis.net/gml/srs/epsg.xml#4326,
  *     urn:x-ogc:def:crs:EPSG:4326
  * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
  *     urn:ogc:def:crs:EPSG:6.18:3:3857,
  *     http://www.opengis.net/gml/srs/epsg.xml#3857
  *
  * If you use proj4js, aliases can be added using `proj4.defs()`; see
  * [documentation](https://github.com/proj4js/proj4js). To set an alternative
  * namespace for proj4, use {@link ol.proj.setProj4}.
  *
  * @param options Projection options.
  * @struct
  * @api stable
  */
@JSImport("ol/proj/projection", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.projNs.Projection {
  /**
    * @classdesc
    * Projection definition class. One of these is created for each projection
    * supported in the application and stored in the {@link ol.proj} namespace.
    * You can use these in applications, but this is not required, as API params
    * and options use {@link ol.ProjectionLike} which means the simple string
    * code will suffice.
    *
    * You can use {@link ol.proj.get} to retrieve the object for a particular
    * projection.
    *
    * The library includes definitions for `EPSG:4326` and `EPSG:3857`, together
    * with the following aliases:
    * * `EPSG:4326`: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326,
    *     urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84,
    *     http://www.opengis.net/gml/srs/epsg.xml#4326,
    *     urn:x-ogc:def:crs:EPSG:4326
    * * `EPSG:3857`: EPSG:102100, EPSG:102113, EPSG:900913,
    *     urn:ogc:def:crs:EPSG:6.18:3:3857,
    *     http://www.opengis.net/gml/srs/epsg.xml#3857
    *
    * If you use proj4js, aliases can be added using `proj4.defs()`; see
    * [documentation](https://github.com/proj4js/proj4js). To set an alternative
    * namespace for proj4, use {@link ol.proj.setProj4}.
    *
    * @param options Projection options.
    * @struct
    * @api stable
    */
  def this(options: openlayersLib.openlayersMod.olxNs.ProjectionOptions) = this()
}

