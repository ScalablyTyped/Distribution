package typings.msgpackr

import typings.msgpackr.anon.AllowHalfOpen
import typings.msgpackr.unpackMod.Extension
import typings.msgpackr.unpackMod.Options
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msgpackr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msgpackr", "Decoder")
  @js.native
  open class Decoder ()
    extends typings.msgpackr.unpackMod.Decoder {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "Encoder")
  @js.native
  open class Encoder ()
    extends typings.msgpackr.packMod.Encoder {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "FLOAT32_OPTIONS")
  @js.native
  object FLOAT32_OPTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.msgpackr.unpackMod.FLOAT32_OPTIONS & Double] = js.native
    
    /* 1 */ val ALWAYS: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.ALWAYS & Double = js.native
    
    /* 4 */ val DECIMAL_FIT: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.DECIMAL_FIT & Double = js.native
    
    /* 3 */ val DECIMAL_ROUND: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.DECIMAL_ROUND & Double = js.native
    
    /* 0 */ val NEVER: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.NEVER & Double = js.native
  }
  
  @JSImport("msgpackr", "Packr")
  @js.native
  open class Packr ()
    extends typings.msgpackr.packMod.Packr {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "PackrStream")
  @js.native
  open class PackrStream () extends Transform {
    def this(options: AllowHalfOpen) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "Unpackr")
  @js.native
  open class Unpackr ()
    extends typings.msgpackr.unpackMod.Unpackr {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr", "UnpackrStream")
  @js.native
  open class UnpackrStream () extends Transform {
    def this(options: AllowHalfOpen) = this()
    def this(options: Options) = this()
  }
  
  inline def addExtension(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearSource(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSource")().asInstanceOf[Unit]
  
  inline def decode(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def encode(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("msgpackr", "isNativeAccelerationEnabled")
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
