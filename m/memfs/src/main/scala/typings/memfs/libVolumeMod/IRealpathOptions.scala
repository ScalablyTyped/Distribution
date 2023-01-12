package typings.memfs.libVolumeMod

import typings.memfs.libEncodingMod.TEncodingExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRealpathOptions extends StObject {
  
  var encoding: js.UndefOr[TEncodingExtended] = js.undefined
}
object IRealpathOptions {
  
  inline def apply(): IRealpathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRealpathOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRealpathOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: TEncodingExtended): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
