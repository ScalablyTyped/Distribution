package typings.ndarrayScratch

import typings.ndarray.mod.Data
import typings.ndarray.mod.NdArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pool {
    
    @JSGlobal("pool")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone_(array: NdArray[Data[Double]]): NdArray[Data[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(array.asInstanceOf[js.Any]).asInstanceOf[NdArray[Data[Double]]]
    
    inline def eye(shape: js.Array[Double]): NdArray[Data[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[Data[Double]]]
    inline def eye(shape: js.Array[Double], dtype: String): NdArray[Data[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("eye")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[Data[Double]]]
    
    inline def free(array: NdArray[Data[Double]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("free")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def malloc(shape: js.Array[Double]): NdArray[Data[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("malloc")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[Data[Double]]]
    inline def malloc(shape: js.Array[Double], dtype: String): NdArray[Data[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("malloc")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[Data[Double]]]
    
    inline def ones(shape: js.Array[Double]): NdArray[Data[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[Data[Double]]]
    inline def ones(shape: js.Array[Double], dtype: String): NdArray[Data[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[Data[Double]]]
    
    inline def zeros(shape: js.Array[Double]): NdArray[Data[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any]).asInstanceOf[NdArray[Data[Double]]]
    inline def zeros(shape: js.Array[Double], dtype: String): NdArray[Data[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[NdArray[Data[Double]]]
  }
}
