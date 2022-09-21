package typings.nodeJose.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("node-jose", "util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def asBuffer(input: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("asBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def asBuffer(input: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("asBuffer")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def asBuffer(input: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("asBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def asBuffer(input: Buffer, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("asBuffer")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  object base64url {
    
    @JSImport("node-jose", "util.base64url")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(base64url: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64url.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def encode(buffer: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encode(buffer: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encode(buffer: Buffer, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def randomBytes(len: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(len.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  object utf8 {
    
    @JSImport("node-jose", "util.utf8")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
