package typings.msgpack5

import typings.bl.mod.BufferListStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): MessagePack = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MessagePack]
  inline def apply(opts: MsgPackOptions): MessagePack = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[MessagePack]
  
  @JSImport("msgpack5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msgpack5", "Base")
  @js.native
  open class Base () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("msgpack5", "Decoder")
  @js.native
  open class Decoder () extends Base {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("msgpack5", "Encoder")
  @js.native
  open class Encoder () extends Base {
    def this(opts: TransformOptions) = this()
  }
  
  trait EncodeDecodeOptions extends StObject {
    
    var header: js.UndefOr[Boolean] = js.undefined
  }
  object EncodeDecodeOptions {
    
    inline def apply(): EncodeDecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeDecodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncodeDecodeOptions] (val x: Self) extends AnyVal {
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  @js.native
  trait MessagePack extends StObject {
    
    def decode(buf: BufferListStream): Any = js.native
    def decode(buf: Buffer): Any = js.native
    
    def decoder(): Decoder = js.native
    def decoder(opts: EncodeDecodeOptions): Decoder = js.native
    
    def encode(obj: Any): BufferListStream = js.native
    
    def encoder(): Encoder = js.native
    def encoder(opts: EncodeDecodeOptions): Encoder = js.native
    
    def register[T](
      `type`: Double,
      $constructor: Any,
      encode: js.Function1[/* obj */ T, Buffer],
      decode: js.Function1[/* data */ Buffer, T]
    ): MessagePack = js.native
    
    def registerDecoder(`type`: Double, decode: js.Function1[/* data */ Buffer, Any]): MessagePack = js.native
    
    def registerEncoder[T](check: js.Function1[/* obj */ T, Boolean], encode: js.Function1[/* obj */ T, Buffer]): MessagePack = js.native
  }
  
  trait MsgPackOptions extends StObject {
    
    var compatibilityMode: js.UndefOr[Boolean] = js.undefined
    
    var forceFloat64: js.UndefOr[Boolean] = js.undefined
  }
  object MsgPackOptions {
    
    inline def apply(): MsgPackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsgPackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MsgPackOptions] (val x: Self) extends AnyVal {
      
      inline def setCompatibilityMode(value: Boolean): Self = StObject.set(x, "compatibilityMode", value.asInstanceOf[js.Any])
      
      inline def setCompatibilityModeUndefined: Self = StObject.set(x, "compatibilityMode", js.undefined)
      
      inline def setForceFloat64(value: Boolean): Self = StObject.set(x, "forceFloat64", value.asInstanceOf[js.Any])
      
      inline def setForceFloat64Undefined: Self = StObject.set(x, "forceFloat64", js.undefined)
    }
  }
}
