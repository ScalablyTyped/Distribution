package typings.plantumlEncoder

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plantuml-encoder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Decodes encoded PlantUML code.
    * @param encodedPuml The encoded PlantUML code that should be decoded.
    * @returns The decoded PlantUML code.
    */
  def decode(encodedPuml: String): String = js.native
  /**
    * Encodes PlantUML code.
    * @param puml The PlantUML code that should be encoded.
    * @returns The encoded PlantUML code.
    */
  def encode(puml: String): String = js.native
  def encode(puml: Buffer): String = js.native
  def encode(puml: TypedArray): String = js.native
  def encode(puml: ArrayBuffer): String = js.native
  def encode(puml: DataView): String = js.native
  /**
    * Union type for possible typed arrays.
    */
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | BigInt64Array | BigUint64Array
}

