package typings.openlayers.openlayersMod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The geometry type. One of `'Point'`, `'LineString'`, `'LinearRing'`,
  * `'Polygon'`, `'MultiPoint'`, `'MultiLineString'`, `'MultiPolygon'`,
  * `'GeometryCollection'`, `'Circle'`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.Point
  - typings.openlayers.openlayersStrings.LineString
  - typings.openlayers.openlayersStrings.LinearRing
  - typings.openlayers.openlayersStrings.Polygon
  - typings.openlayers.openlayersStrings.MultiPoint
  - typings.openlayers.openlayersStrings.MultiLineString
  - typings.openlayers.openlayersStrings.MultiPolygon
  - typings.openlayers.openlayersStrings.GeometryCollection
  - typings.openlayers.openlayersStrings.Circle
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  def Circle: typings.openlayers.openlayersStrings.Circle = this.cast("Circle")
  @scala.inline
  def GeometryCollection: typings.openlayers.openlayersStrings.GeometryCollection = this.cast("GeometryCollection")
  @scala.inline
  def LineString: typings.openlayers.openlayersStrings.LineString = this.cast("LineString")
  @scala.inline
  def LinearRing: typings.openlayers.openlayersStrings.LinearRing = this.cast("LinearRing")
  @scala.inline
  def MultiLineString: typings.openlayers.openlayersStrings.MultiLineString = this.cast("MultiLineString")
  @scala.inline
  def MultiPoint: typings.openlayers.openlayersStrings.MultiPoint = this.cast("MultiPoint")
  @scala.inline
  def MultiPolygon: typings.openlayers.openlayersStrings.MultiPolygon = this.cast("MultiPolygon")
  @scala.inline
  def Point: typings.openlayers.openlayersStrings.Point = this.cast("Point")
  @scala.inline
  def Polygon: typings.openlayers.openlayersStrings.Polygon = this.cast("Polygon")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

