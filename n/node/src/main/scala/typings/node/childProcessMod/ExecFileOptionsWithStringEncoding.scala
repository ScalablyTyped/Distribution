package typings.node.childProcessMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecFileOptionsWithStringEncoding extends ExecFileOptions {
  
  var encoding: BufferEncoding = js.native
}
object ExecFileOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecFileOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class ExecFileOptionsWithStringEncodingMutableBuilder[Self <: ExecFileOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
