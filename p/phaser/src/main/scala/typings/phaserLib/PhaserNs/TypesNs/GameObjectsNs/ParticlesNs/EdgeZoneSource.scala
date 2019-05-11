package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeZoneSource extends js.Object {
  /**
    * A function placing points on the sources edge or edges.
    */
  @JSName("getPoints")
  var getPoints_Original: EdgeZoneSourceCallback = js.native
  /**
    * A function placing points on the sources edge or edges.
    */
  def getPoints(quantity: phaserLib.integer): scala.Unit = js.native
  def getPoints(quantity: phaserLib.integer, stepRate: scala.Double): scala.Unit = js.native
}

