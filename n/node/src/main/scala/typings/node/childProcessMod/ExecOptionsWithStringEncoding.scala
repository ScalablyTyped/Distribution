package typings.node.childProcessMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecOptionsWithStringEncoding extends ExecOptions {
  
  var encoding: BufferEncoding = js.native
}
object ExecOptionsWithStringEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): ExecOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptionsWithStringEncoding]
  }
  
  @scala.inline
  implicit class ExecOptionsWithStringEncodingMutableBuilder[Self <: ExecOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
