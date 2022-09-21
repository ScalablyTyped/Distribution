package typings.plantumlEncoder

import typings.node.bufferMod.global.Buffer
import typings.std.BigInt64Array
import typings.std.BigUint64Array
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
  inline def encode(puml: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: js.typedarray.DataView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(puml: TypedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(puml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Union type for possible typed arrays.
    */
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | BigInt64Array | BigUint64Array
}
