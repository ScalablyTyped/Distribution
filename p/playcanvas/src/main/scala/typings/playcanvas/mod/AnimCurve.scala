package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Animation curve links an input data set to an output data set and defines the interpolation
  * method to use.
  *
  * @ignore
  */
@JSImport("playcanvas", "AnimCurve")
@js.native
open class AnimCurve protected () extends StObject {
  /**
    * Create a new animation curve.
    *
    * @param {string[]} paths - Array of path strings identifying the targets of this curve, for
    * example "rootNode.translation".
    * @param {number} input - Index of the curve which specifies the key data.
    * @param {number} output - Index of the curve which specifies the value data.
    * @param {number} interpolation - The interpolation method to use. One of the following:
    *
    * - {@link INTERPOLATION_STEP}
    * - {@link INTERPOLATION_LINEAR}
    * - {@link INTERPOLATION_CUBIC}
    */
  def this(paths: js.Array[String], input: Double, output: Double, interpolation: Double) = this()
  
  var _input: Double = js.native
  
  var _interpolation: Double = js.native
  
  var _output: Double = js.native
  
  var _paths: js.Array[String] = js.native
  
  /**
    * The index of the AnimTrack input which contains the key data for this curve.
    *
    * @type {number}
    */
  def input: Double = js.native
  
  /**
    * The interpolation method used by this curve.
    *
    * @type {number}
    */
  def interpolation: Double = js.native
  
  /**
    * The index of the AnimTrack input which contains the key data for this curve.
    *
    * @type {number}
    */
  def output: Double = js.native
  
  /**
    * The list of paths which identify targets of this curve.
    *
    * @type {string[]}
    */
  def paths: js.Array[String] = js.native
}
