package typings.node.childProcessMod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptionsWithStringEncoding
  extends StObject
     with ExecFileOptions {
  
  var encoding: BufferEncoding
}
object ExecFileOptionsWithStringEncoding {
  
  inline def apply(encoding: BufferEncoding): ExecFileOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithStringEncoding]
  }
  
  extension [Self <: ExecFileOptionsWithStringEncoding](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
