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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Wrapper object for the encode and decode functions.
  */
object mod {
  
  @JSImport("plantuml-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decodes encoded PlantUML code.
    * @param encodedPuml The encoded PlantUML code that should be decoded.
    * @returns The decoded PlantUML code.
    */
  inline def decode(encodedPuml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(encodedPuml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encodes PlantUML code.
    * @param puml The PlantUML code that should be encoded.
    * @returns The encoded PlantUML code.
    */
  inline def encode(puml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: TypedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: DataView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Union type for possible typed arrays.
    */
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array | BigInt64Array | BigUint64Array
}
