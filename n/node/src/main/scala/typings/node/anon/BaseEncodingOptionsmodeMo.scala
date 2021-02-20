package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.Mode
import typings.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  mode :node.fs.Mode | undefined,   flag :node.fs.OpenMode | undefined} */
@js.native
trait BaseEncodingOptionsmodeMo extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.native
  
  var flag: js.UndefOr[OpenMode] = js.native
  
  var mode: js.UndefOr[Mode] = js.native
}
object BaseEncodingOptionsmodeMo {
  
  @scala.inline
  def apply(): BaseEncodingOptionsmodeMo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionsmodeMo]
  }
  
  @scala.inline
  implicit class BaseEncodingOptionsmodeMoMutableBuilder[Self <: BaseEncodingOptionsmodeMo] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
