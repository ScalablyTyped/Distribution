package typings.msgpackr

import typings.msgpackr.unpackMod.Extension
import typings.msgpackr.unpackMod.Options
import typings.msgpackr.unpackMod.Unpackr
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packMod {
  
  @JSImport("msgpackr/pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msgpackr/pack", "Encoder")
  @js.native
  open class Encoder () extends Packr {
    def this(options: Options) = this()
  }
  
  @JSImport("msgpackr/pack", "FLOAT32_OPTIONS")
  @js.native
  object FLOAT32_OPTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.msgpackr.unpackMod.FLOAT32_OPTIONS & Double] = js.native
    
    /* 1 */ val ALWAYS: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.ALWAYS & Double = js.native
    
    /* 4 */ val DECIMAL_FIT: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.DECIMAL_FIT & Double = js.native
    
    /* 3 */ val DECIMAL_ROUND: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.DECIMAL_ROUND & Double = js.native
    
    /* 0 */ val NEVER: typings.msgpackr.unpackMod.FLOAT32_OPTIONS.NEVER & Double = js.native
  }
  
  @JSImport("msgpackr/pack", "Packr")
  @js.native
  open class Packr () extends Unpackr {
    def this(options: Options) = this()
    
    def encode(value: Any): Buffer = js.native
    
    def pack(value: Any): Buffer = js.native
  }
  
  inline def addExtension(`extension`: Extension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExtension")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def encode(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def pack(value: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
