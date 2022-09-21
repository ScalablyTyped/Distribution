package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Wraps a set of data used in animation.
  *
  * @ignore
  */
@JSImport("playcanvas", "AnimData")
@js.native
open class AnimData protected () extends StObject {
  def this(components: Double, data: js.Array[Double]) = this()
  /**
    * Create a new animation AnimData instance.
    *
    * @param {number} components - Specifies how many components make up an element of data. For
    * example, specify 3 for a set of 3-dimensional vectors. The number of elements in data array
    * must be a multiple of components.
    * @param {Float32Array|number[]} data - The set of data.
    */
  def this(components: Double, data: js.typedarray.Float32Array) = this()
  
  var _components: Double = js.native
  
  var _data: js.Array[Double] | js.typedarray.Float32Array = js.native
  
  /**
    * Gets the number of components that make up an element.
    *
    * @type {number}
    */
  def components: Double = js.native
  
  /**
    * Gets the data.
    *
    * @type {Float32Array|number[]}
    */
  def data: js.Array[Double] | js.typedarray.Float32Array = js.native
}
