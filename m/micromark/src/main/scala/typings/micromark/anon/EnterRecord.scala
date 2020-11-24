package typings.micromark.anon

import typings.micromark.constantTypesMod.Type
import typings.micromark.libSharedTypesMod.HtmlExtension
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterRecord extends HtmlExtension {
  
  var enter: Record[Type, js.Function0[Unit]] = js.native
}
object EnterRecord {
  
  @scala.inline
  def apply(enter: Record[Type, js.Function0[Unit]]): EnterRecord = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterRecord]
  }
  
  @scala.inline
  implicit class EnterRecordOps[Self <: EnterRecord] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: Record[Type, js.Function0[Unit]]): Self = this.set("enter", value.asInstanceOf[js.Any])
  }
}
