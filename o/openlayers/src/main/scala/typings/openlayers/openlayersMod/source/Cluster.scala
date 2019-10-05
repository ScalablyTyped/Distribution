package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.olx.source.ClusterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Layer source to cluster vector data. Works out of the box with point
  * geometries. For other geometry types, or if not all geometries should be
  * considered for clustering, a custom `geometryFunction` can be defined.
  *
  * @param options Constructor options.
  * @api
  */
@JSImport("openlayers", "source.Cluster")
@js.native
class Cluster protected () extends Vector {
  /**
    * @classdesc
    * Layer source to cluster vector data. Works out of the box with point
    * geometries. For other geometry types, or if not all geometries should be
    * considered for clustering, a custom `geometryFunction` can be defined.
    *
    * @param options Constructor options.
    * @api
    */
  def this(options: ClusterOptions) = this()
  /**
    * Get the distance in pixels between clusters.
    * @return The distance in pixels.
    * @api
    */
  def getDistance(): Double = js.native
  /**
    * Get a reference to the wrapped source.
    * @return Source.
    * @api
    */
  def getSource(): Vector = js.native
  /**
    * Set the distance in pixels between clusters.
    * @param distance The distance in pixels.
    * @api
    */
  def setDistance(distance: Double): Unit = js.native
}

