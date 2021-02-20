package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes :false | undefined} */
@js.native
trait BaseEncodingOptionswithFi extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  
  var withFileTypes: js.UndefOr[`false`] = js.native
}
object BaseEncodingOptionswithFi {
  
  @scala.inline
  def apply(): BaseEncodingOptionswithFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionswithFi]
  }
  
  @scala.inline
  implicit class BaseEncodingOptionswithFiMutableBuilder[Self <: BaseEncodingOptionswithFi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
