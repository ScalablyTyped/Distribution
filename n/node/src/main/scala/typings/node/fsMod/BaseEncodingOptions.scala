package typings.node.fsMod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseEncodingOptions extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
}
object BaseEncodingOptions {
  
  @scala.inline
  def apply(): BaseEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptions]
  }
  
  @scala.inline
  implicit class BaseEncodingOptionsMutableBuilder[Self <: BaseEncodingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
