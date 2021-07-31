package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  flag :node.fs.OpenMode | undefined} */
trait BaseEncodingOptionsflagOp extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var flag: js.UndefOr[OpenMode] = js.undefined
}
object BaseEncodingOptionsflagOp {
  
  @scala.inline
  def apply(): BaseEncodingOptionsflagOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionsflagOp]
  }
  
  @scala.inline
  implicit class BaseEncodingOptionsflagOpMutableBuilder[Self <: BaseEncodingOptionsflagOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
