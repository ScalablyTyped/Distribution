package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes :true} */
trait BaseEncodingOptionswithFiEncoding extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var withFileTypes: `true`
}
object BaseEncodingOptionswithFiEncoding {
  
  @scala.inline
  def apply(): BaseEncodingOptionswithFiEncoding = {
    val __obj = js.Dynamic.literal(withFileTypes = true)
    __obj.asInstanceOf[BaseEncodingOptionswithFiEncoding]
  }
  
  @scala.inline
  implicit class BaseEncodingOptionswithFiEncodingMutableBuilder[Self <: BaseEncodingOptionswithFiEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
  }
}
