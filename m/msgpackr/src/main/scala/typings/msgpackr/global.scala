package typings.msgpackr

import typings.msgpackr.anon.AllowHalfOpen
import typings.msgpackr.unpackMod.Extension
import typings.msgpackr.unpackMod.Options
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object msgpackr {
    
    @JSGlobal("msgpackr")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("msgpackr.Decoder")
    @js.native
    open class Decoder ()
      extends typings.msgpackr.mod.Decoder {
      def this(options: Options) = this()
    }
    
    @JSGlobal("msgpackr.Encoder")
    @js.native
    open class Encoder ()
      extends typings.msgpackr.mod.Encoder {
      def this(options: Options) = this()
    }
    
    @JSGlobal("msgpackr.FLOAT32_OPTIONS")
    @js.native
    object FLOAT32_OPTIONS extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.msgpackr.unpackMod.FLOAT32_OPTIONS & Double] = js.native
      
      /* 1 */ val ALWAYS: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.ALWAYS & Double = js.native
      
      /* 4 */ val DECIMAL_FIT: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.DECIMAL_FIT & Double = js.native
      
      /* 3 */ val DECIMAL_ROUND: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.DECIMAL_ROUND & Double = js.native
      
      /* 0 */ val NEVER: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.NEVER & Double = js.native
    }
    
    @JSGlobal("msgpackr.Packr")
    @js.native
    open class Packr ()
      extends typings.msgpackr.mod.Packr {
      def this(options: Options) = this()
    }
    
    @JSGlobal("msgpackr.PackrStream")
    @js.native
    open class PackrStream ()
      extends typings.msgpackr.mod.PackrStream {
      def this(options: AllowHalfOpen) = this()
      def this(options: Options) = this()
    }
    
    @JSGlobal("msgpackr.Unpackr")
    @js.native
    open class Unpackr ()
      extends typings.msgpackr.mod.Unpackr {
      def this(options: Options) = this()
    }
    
    @JSGlobal("msgpackr.UnpackrStream")
    @js.native
    open class UnpackrStream ()
      extends typings.msgpackr.mod.UnpackrStream {
      def this(options: AllowHalfOpen) = this()
      def this(options: Options) = this()
    }
    
    inline def addExtension(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearSource(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSource")().asInstanceOf[Unit]
    
    inline def decode(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def decode(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def encode(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @JSGlobal("msgpackr.isNativeAccelerationEnabled")
    @js.native
    def isNativeAccelerationEnabled: Boolean = js.native
    inline def isNativeAccelerationEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNativeAccelerationEnabled")(x.asInstanceOf[js.Any])
    
    inline def pack(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def roundFloat32(float32Number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundFloat32")(float32Number.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def unpack(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def unpack(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def unpackMultiple(messagePack: js.typedarray.Uint8Array): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def unpackMultiple(messagePack: js.typedarray.Uint8Array, forEach: js.Function1[/* value */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any], forEach.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def unpackMultiple(messagePack: Buffer): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def unpackMultiple(messagePack: Buffer, forEach: js.Function1[/* value */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any], forEach.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
