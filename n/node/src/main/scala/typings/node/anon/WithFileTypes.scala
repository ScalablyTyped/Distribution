package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithFileTypes extends StObject {
  
  var encoding: BufferEncoding | Null
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object WithFileTypes {
  
  @scala.inline
  def apply(): WithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[WithFileTypes]
  }
  
  @scala.inline
  implicit class WithFileTypesMutableBuilder[Self <: WithFileTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
