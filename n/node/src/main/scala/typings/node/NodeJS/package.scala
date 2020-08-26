package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJS {
  type ArrayBufferView = typings.node.NodeJS.TypedArray | typings.std.DataView
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type ReadOnlyDict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]]
  type TypedArray = typings.std.Uint8Array | typings.std.Uint8ClampedArray | typings.std.Uint16Array | typings.std.Uint32Array | typings.std.Int8Array | typings.std.Int16Array | typings.std.Int32Array | typings.std.Float32Array | typings.std.Float64Array
}
