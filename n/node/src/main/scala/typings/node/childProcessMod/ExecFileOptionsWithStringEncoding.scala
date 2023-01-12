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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecFileOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
