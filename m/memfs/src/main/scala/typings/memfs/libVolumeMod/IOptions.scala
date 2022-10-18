package typings.memfs.libVolumeMod

import typings.memfs.libEncodingMod.TEncodingExtended
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOptions extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | TEncodingExtended] = js.undefined
}
object IOptions {
  
  inline def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  extension [Self <: IOptions](x: Self) {
    
    inline def setEncoding(value: BufferEncoding | TEncodingExtended): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
