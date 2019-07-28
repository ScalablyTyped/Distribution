package typings.p5.p5Mod

import typings.std.AudioNode
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
  var panner: AudioNode = js.native
  /**
    *   Maxium distance between the source and the
    *   listener
    *   @return updated value
    */
  def maxDist(maxDistance: Double): Double = js.native
  /**
    *   Set the X,Y,Z position of the Panner
    *   @return Updated x, y, z values as an array
    */
  def orient(xVal: Double, yVal: Double, zVal: Double, time: Double): js.Array[_] = js.native
  /**
    *   Getter and setter methods for orient coordinates
    *   @return updated coordinate value
    */
  def orientX(): Double = js.native
  /**
    *   Getter and setter methods for orient coordinates
    *   @return updated coordinate value
    */
  def orientY(): Double = js.native
  /**
    *   Getter and setter methods for orient coordinates
    *   @return updated coordinate value
    */
  def orientZ(): Double = js.native
  /**
    *   Getter and setter methods for position coordinates
    *   @return updated coordinate value
    */
  def positionX(): Double = js.native
  /**
    *   Getter and setter methods for position coordinates
    *   @return updated coordinate value
    */
  def positionY(): Double = js.native
  /**
    *   Getter and setter methods for position coordinates
    *   @return updated coordinate value
    */
  def positionZ(): Double = js.native
  /**
    *   Connect an audio sorce
    *   @param src Input source
    */
  def process(src: js.Object): Unit = js.native
  /**
    *   How quickly the volume is reduced as the source
    *   moves away from the listener
    *   @return updated value
    */
  def rollof(rolloffFactor: Double): Double = js.native
  /**
    *   Set the X,Y,Z position of the Panner
    *   @return Updated x, y, z values as an array
    */
  def set(xVal: Double, yVal: Double, zVal: Double, time: Double): js.Array[_] = js.native
  /**
    *   Set the rolloff factor and max distance
    */
  def setFalloff(): Unit = js.native
  def setFalloff(maxDistance: Double): Unit = js.native
  def setFalloff(maxDistance: Double, rolloffFactor: Double): Unit = js.native
}

