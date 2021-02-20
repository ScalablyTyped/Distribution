package typings.msgpack5

import typings.bl.mod.^
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msgpack5", JSImport.Namespace)
  @js.native
  def apply(): MessagePack = js.native
  @JSImport("msgpack5", JSImport.Namespace)
  @js.native
  def apply(opts: MsgPackOptions): MessagePack = js.native
  
  @JSImport("msgpack5", "Base")
  @js.native
  class Base () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("msgpack5", "Decoder")
  @js.native
  class Decoder () extends Base {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("msgpack5", "Encoder")
  @js.native
  class Encoder () extends Base {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  trait EncodeDecodeOptions extends StObject {
    
    var header: js.UndefOr[Boolean] = js.native
  }
  object EncodeDecodeOptions {
    
    @scala.inline
    def apply(): EncodeDecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeDecodeOptions]
    }
    
    @scala.inline
    implicit class EncodeDecodeOptionsMutableBuilder[Self <: EncodeDecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
  
  @js.native
  trait MessagePack extends StObject {
    
    def decode(buf: ^): js.Any = js.native
    def decode(buf: Buffer): js.Any = js.native
    
    def decoder(): Decoder = js.native
    def decoder(opts: EncodeDecodeOptions): Decoder = js.native
    
    def encode(obj: js.Any): ^ = js.native
    
    def encoder(): Encoder = js.native
    def encoder(opts: EncodeDecodeOptions): Encoder = js.native
    
    def register[T](
      `type`: Double,
      $constructor: js.Any,
      encode: js.Function1[/* obj */ T, Buffer],
      decode: js.Function1[/* data */ Buffer, T]
    ): MessagePack = js.native
    
    def registerDecoder(`type`: Double, decode: js.Function1[/* data */ Buffer, _]): MessagePack = js.native
    
    def registerEncoder[T](check: js.Function1[/* obj */ T, Boolean], encode: js.Function1[/* obj */ T, Buffer]): MessagePack = js.native
  }
  
  @js.native
  trait MsgPackOptions extends StObject {
    
    var compatibilityMode: js.UndefOr[Boolean] = js.native
    
    var forceFloat64: js.UndefOr[Boolean] = js.native
  }
  object MsgPackOptions {
    
    @scala.inline
    def apply(): MsgPackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsgPackOptions]
    }
    
    @scala.inline
    implicit class MsgPackOptionsMutableBuilder[Self <: MsgPackOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompatibilityMode(value: Boolean): Self = StObject.set(x, "compatibilityMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibilityModeUndefined: Self = StObject.set(x, "compatibilityMode", js.undefined)
      
      @scala.inline
      def setForceFloat64(value: Boolean): Self = StObject.set(x, "forceFloat64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFloat64Undefined: Self = StObject.set(x, "forceFloat64", js.undefined)
    }
  }
}
