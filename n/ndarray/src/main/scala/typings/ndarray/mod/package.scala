package typings.ndarray

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Data[T] = js.Array[T] | typings.std.Int8Array | typings.std.Int16Array | typings.std.Int32Array | typings.std.Uint8Array | typings.std.Uint16Array | typings.std.Uint32Array | typings.std.Float32Array | typings.std.Float64Array | typings.std.Uint8ClampedArray
}
