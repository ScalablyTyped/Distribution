package typings.mnemonist

import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTypedArraysMod {
  
  @JSImport("mnemonist/utils/typed-arrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNumberType(value: Double): PointerArrayConstructor | SignedPointerArrayConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[PointerArrayConstructor | SignedPointerArrayConstructor]
  
  inline def getPointerArray(size: Double): PointerArrayConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerArray")(size.asInstanceOf[js.Any]).asInstanceOf[PointerArrayConstructor]
  
  inline def getSignedPointerArray(size: Double): SignedPointerArrayConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getSignedPointerArray")(size.asInstanceOf[js.Any]).asInstanceOf[SignedPointerArrayConstructor]
  
  inline def indices(length: Double): PointerArray = ^.asInstanceOf[js.Dynamic].applyDynamic("indices")(length.asInstanceOf[js.Any]).asInstanceOf[PointerArray]
  
  inline def isTypedArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type PointerArray = js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Float64Array
  
  type PointerArrayConstructor = Uint8ArrayConstructor | Uint16ArrayConstructor | Uint32ArrayConstructor | Float64ArrayConstructor
  
  type SignedPointerArray = js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Float64Array
  
  type SignedPointerArrayConstructor = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float64ArrayConstructor
}
