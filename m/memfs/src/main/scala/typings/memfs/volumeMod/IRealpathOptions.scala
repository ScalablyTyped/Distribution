package typings.memfs.volumeMod

import typings.memfs.encodingMod.TEncodingExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRealpathOptions extends StObject {
  
  var encoding: js.UndefOr[TEncodingExtended] = js.undefined
}
object IRealpathOptions {
  
  @scala.inline
  def apply(): IRealpathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRealpathOptions]
  }
  
  @scala.inline
  implicit class IRealpathOptionsMutableBuilder[Self <: IRealpathOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: TEncodingExtended): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
