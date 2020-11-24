package typings.ndarrayScratch

import typings.ndarray.mod.ndarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndarray-scratch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clone(array: ndarray[Double]): ndarray[Double] = js.native
  
  def eye(shape: js.Array[Double]): ndarray[Double] = js.native
  def eye(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
  
  def free(array: ndarray[Double]): Unit = js.native
  
  def malloc(shape: js.Array[Double]): ndarray[Double] = js.native
  def malloc(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
  
  def ones(shape: js.Array[Double]): ndarray[Double] = js.native
  def ones(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
  
  def zeros(shape: js.Array[Double]): ndarray[Double] = js.native
  def zeros(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
}
