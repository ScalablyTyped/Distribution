package typings.ndarrayScratch

import typings.ndarray.mod.ndarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndarray-scratch", "clone")
  @js.native
  def clone_(array: ndarray[Double]): ndarray[Double] = js.native
  
  @JSImport("ndarray-scratch", "eye")
  @js.native
  def eye(shape: js.Array[Double]): ndarray[Double] = js.native
  @JSImport("ndarray-scratch", "eye")
  @js.native
  def eye(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
  
  @JSImport("ndarray-scratch", "free")
  @js.native
  def free(array: ndarray[Double]): Unit = js.native
  
  @JSImport("ndarray-scratch", "malloc")
  @js.native
  def malloc(shape: js.Array[Double]): ndarray[Double] = js.native
  @JSImport("ndarray-scratch", "malloc")
  @js.native
  def malloc(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
  
  @JSImport("ndarray-scratch", "ones")
  @js.native
  def ones(shape: js.Array[Double]): ndarray[Double] = js.native
  @JSImport("ndarray-scratch", "ones")
  @js.native
  def ones(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
  
  @JSImport("ndarray-scratch", "zeros")
  @js.native
  def zeros(shape: js.Array[Double]): ndarray[Double] = js.native
  @JSImport("ndarray-scratch", "zeros")
  @js.native
  def zeros(shape: js.Array[Double], dtype: String): ndarray[Double] = js.native
}
