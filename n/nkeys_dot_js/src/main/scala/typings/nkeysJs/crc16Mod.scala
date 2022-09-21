package typings.nkeysJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crc16Mod {
  
  @JSImport("nkeys.js/lib/crc16", "crc16")
  @js.native
  open class crc16 () extends StObject
  /* static members */
  object crc16 {
    
    @JSImport("nkeys.js/lib/crc16", "crc16")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checksum(data: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksum")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def validate(data: js.typedarray.Uint8Array, expected: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(data.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
