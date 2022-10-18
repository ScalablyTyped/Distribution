package typings.multiformats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcVarintMod {
  
  @JSImport("multiformats/dist/types/src/varint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: js.typedarray.Uint8Array): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def decode(data: js.typedarray.Uint8Array, offset: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def encodeTo(int: Double, target: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeTo(int: Double, target: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encodingLength(int: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(int.asInstanceOf[js.Any]).asInstanceOf[Double]
}
