package typings.msgpackr

import typings.msgpackr.mod.Extension
import typings.msgpackr.mod.Options
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unpackMod {
  
  @JSImport("msgpackr/unpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msgpackr/unpack", "Decoder")
  @js.native
  open class Decoder ()
    extends typings.msgpackr.mod.Decoder {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr/unpack", "FLOAT32_OPTIONS")
  @js.native
  object FLOAT32_OPTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.msgpackr.mod.FLOAT32_OPTIONS & Double] = js.native
    
    /* 1 */ val ALWAYS: typings.msgpackr.mod.FLOAT32_OPTIONS.ALWAYS & Double = js.native
    
    /* 4 */ val DECIMAL_FIT: typings.msgpackr.mod.FLOAT32_OPTIONS.DECIMAL_FIT & Double = js.native
    
    /* 3 */ val DECIMAL_ROUND: typings.msgpackr.mod.FLOAT32_OPTIONS.DECIMAL_ROUND & Double = js.native
    
    /* 0 */ val NEVER: typings.msgpackr.mod.FLOAT32_OPTIONS.NEVER & Double = js.native
  }
  
  @JSImport("msgpackr/unpack", "Unpackr")
  @js.native
  open class Unpackr ()
    extends typings.msgpackr.mod.Unpackr {
    def this(options: Options) = this()
  }
  
  inline def addExtension(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearSource(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSource")().asInstanceOf[Unit]
  
  inline def decode(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def roundFloat32(float32Number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundFloat32")(float32Number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def unpack(messagePack: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def unpack(messagePack: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(messagePack.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def unpackMultiple(messagePack: js.typedarray.Uint8Array): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def unpackMultiple(messagePack: js.typedarray.Uint8Array, forEach: js.Function1[/* value */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any], forEach.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unpackMultiple(messagePack: Buffer): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def unpackMultiple(messagePack: Buffer, forEach: js.Function1[/* value */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackMultiple")(messagePack.asInstanceOf[js.Any], forEach.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
