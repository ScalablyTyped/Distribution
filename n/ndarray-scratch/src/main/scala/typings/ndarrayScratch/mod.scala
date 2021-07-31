package typings.ndarrayScratch

import typings.ndarray.mod.ndarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ndarray-scratch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone_(array: ndarray[Double]): ndarray[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(array.asInstanceOf[js.Any]).asInstanceOf[ndarray[Double]]
  
  @scala.inline
  def eye(shape: js.Array[Double]): ndarray[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")(shape.asInstanceOf[js.Any]).asInstanceOf[ndarray[Double]]
  @scala.inline
  def eye(shape: js.Array[Double], dtype: String): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("eye")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  @scala.inline
  def free(array: ndarray[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("free")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def malloc(shape: js.Array[Double]): ndarray[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("malloc")(shape.asInstanceOf[js.Any]).asInstanceOf[ndarray[Double]]
  @scala.inline
  def malloc(shape: js.Array[Double], dtype: String): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("malloc")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  @scala.inline
  def ones(shape: js.Array[Double]): ndarray[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any]).asInstanceOf[ndarray[Double]]
  @scala.inline
  def ones(shape: js.Array[Double], dtype: String): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
  
  @scala.inline
  def zeros(shape: js.Array[Double]): ndarray[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any]).asInstanceOf[ndarray[Double]]
  @scala.inline
  def zeros(shape: js.Array[Double], dtype: String): ndarray[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[ndarray[Double]]
}
