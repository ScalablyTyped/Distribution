package typings.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCountMode extends js.Object {
  
  /**
    * Count is retrieved by a separate request upfront and inline with each data request
    */
  var Both: js.Any = js.native
  
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in the data request
    */
  var Inline: js.Any = js.native
  
  /**
    * Count is retrieved by adding $inlinecount=allpages and is included in every data request
    */
  var InlineRepeat: js.Any = js.native
  
  /**
    * Count is not requested from the server
    */
  var None: js.Any = js.native
  
  /**
    * Count is retrieved by sending a separate $count request, before requesting data
    */
  var Request: js.Any = js.native
}
object TypeofCountMode {
  
  @scala.inline
  def apply(Both: js.Any, Inline: js.Any, InlineRepeat: js.Any, None: js.Any, Request: js.Any): TypeofCountMode = {
    val __obj = js.Dynamic.literal(Both = Both.asInstanceOf[js.Any], Inline = Inline.asInstanceOf[js.Any], InlineRepeat = InlineRepeat.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Request = Request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCountMode]
  }
  
  @scala.inline
  implicit class TypeofCountModeOps[Self <: TypeofCountMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBoth(value: js.Any): Self = this.set("Both", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline(value: js.Any): Self = this.set("Inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineRepeat(value: js.Any): Self = this.set("InlineRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: js.Any): Self = this.set("None", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("Request", value.asInstanceOf[js.Any])
  }
}
