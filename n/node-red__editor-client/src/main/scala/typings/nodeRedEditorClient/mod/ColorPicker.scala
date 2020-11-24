package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.CellHeight
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker extends js.Object {
  
  def create(options: CellHeight): JQuery[HTMLDivElement] = js.native
}
object ColorPicker {
  
  @scala.inline
  def apply(create: CellHeight => JQuery[HTMLDivElement]): ColorPicker = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ColorPicker]
  }
  
  @scala.inline
  implicit class ColorPickerOps[Self <: ColorPicker] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: CellHeight => JQuery[HTMLDivElement]): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
