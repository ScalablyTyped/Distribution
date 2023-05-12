package typings.mnemonist

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypesMod {
  
  type ArrayLike = IArrayLike | js.typedarray.ArrayBuffer
  
  @js.native
  trait IArrayLike extends StObject {
    
    var length: Double = js.native
    
    def slice(from: Double): IArrayLike = js.native
    def slice(from: Double, to: Double): IArrayLike = js.native
  }
  
  @js.native
  trait IArrayLikeConstructor
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, ArrayLike]
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
