package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panner3D extends js.Object {
  /**
    *   Web Audio Spatial Panner Node Properties include
    *
    *   - <a title="w3 spec for Panning Model"
    *   href="https://www.w3.org/TR/webaudio/#idl-def-PanningModelType"
    *   panningModel: "equal power" or "HRTF"
    *   - <a title="w3 spec for Distance Model"
    *   href="https://www.w3.org/TR/webaudio/#idl-def-DistanceModelType"
    *   distanceModel: "linear", "inverse", or
    *   "exponential"
    */
  var panner: stdLib.AudioNode = js.native
  /**
    *   Maxium distance between the source and the
    *   listener
    *   @return updated value
    */
  def maxDist(maxDistance: scala.Double): scala.Double = js.native
  /**
    *   Set the X,Y,Z position of the Panner
    *   @return Updated x, y, z values as an array
    */
  def orient(xVal: scala.Double, yVal: scala.Double, zVal: scala.Double, time: scala.Double): js.Array[_] = js.native
  /**
    *   Getter and setter methods for orient coordinates
    *   @return updated coordinate value
    */
  def orientX(): scala.Double = js.native
  /**
    *   Getter and setter methods for orient coordinates
    *   @return updated coordinate value
    */
  def orientY(): scala.Double = js.native
  /**
    *   Getter and setter methods for orient coordinates
    *   @return updated coordinate value
    */
  def orientZ(): scala.Double = js.native
  /**
    *   Getter and setter methods for position coordinates
    *   @return updated coordinate value
    */
  def positionX(): scala.Double = js.native
  /**
    *   Getter and setter methods for position coordinates
    *   @return updated coordinate value
    */
  def positionY(): scala.Double = js.native
  /**
    *   Getter and setter methods for position coordinates
    *   @return updated coordinate value
    */
  def positionZ(): scala.Double = js.native
  /**
    *   Connect an audio sorce
    *   @param src Input source
    */
  def process(src: js.Object): scala.Unit = js.native
  /**
    *   How quickly the volume is reduced as the source
    *   moves away from the listener
    *   @return updated value
    */
  def rollof(rolloffFactor: scala.Double): scala.Double = js.native
  /**
    *   Set the X,Y,Z position of the Panner
    *   @return Updated x, y, z values as an array
    */
  def set(xVal: scala.Double, yVal: scala.Double, zVal: scala.Double, time: scala.Double): js.Array[_] = js.native
  /**
    *   Set the rolloff factor and max distance
    */
  def setFalloff(): scala.Unit = js.native
  def setFalloff(maxDistance: scala.Double): scala.Unit = js.native
  def setFalloff(maxDistance: scala.Double, rolloffFactor: scala.Double): scala.Unit = js.native
}

