package typings.openlayers.openlayersMod.source.wms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available server types: `'carmentaserver'`, `'geoserver'`, `'mapserver'`,
  *     `'qgis'`. These are servers that have vendor parameters beyond the WMS
  *     specification that OpenLayers can make use of.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.carmentaserver
  - typings.openlayers.openlayersStrings.geoserver
  - typings.openlayers.openlayersStrings.mapserver
  - typings.openlayers.openlayersStrings.qgis
*/
trait ServerType extends js.Object

object ServerType {
  @scala.inline
  def carmentaserver: typings.openlayers.openlayersStrings.carmentaserver = this.cast("carmentaserver")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def geoserver: typings.openlayers.openlayersStrings.geoserver = this.cast("geoserver")
  @scala.inline
  def mapserver: typings.openlayers.openlayersStrings.mapserver = this.cast("mapserver")
  @scala.inline
  def qgis: typings.openlayers.openlayersStrings.qgis = this.cast("qgis")
}

