package typings.passthroughEncoding

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passthrough-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Double, end: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Unit, end: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("passthrough-encoding", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("passthrough-encoding", "decode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  object encode {
    
    inline def apply(): Buffer = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Buffer]
    inline def apply(value: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(value: String, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: String, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: String, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Null, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Null, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Null, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Unit, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Unit, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Unit, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(value: Buffer, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Buffer, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(value: Buffer, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("passthrough-encoding", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("passthrough-encoding", "encode.bytes")
    @js.native
    val bytes: Double = js.native
  }
  
  inline def encodingLength(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")().asInstanceOf[Double]
  inline def encodingLength(buf: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def encodingLength(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
}
