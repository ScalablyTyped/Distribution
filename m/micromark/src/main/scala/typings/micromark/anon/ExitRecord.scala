package typings.micromark.anon

import typings.micromark.constantTypesMod.Type
import typings.micromark.libSharedTypesMod.HtmlExtension
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExitRecord extends HtmlExtension {
  
  var exit: Record[Type, js.Function0[Unit]] = js.native
}
object ExitRecord {
  
  @scala.inline
  def apply(exit: Record[Type, js.Function0[Unit]]): ExitRecord = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitRecord]
  }
  
  @scala.inline
  implicit class ExitRecordOps[Self <: ExitRecord] (val x: Self) extends AnyVal {
    
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
    def setExit(value: Record[Type, js.Function0[Unit]]): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
}
