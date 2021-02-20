package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.CellHeight
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPicker extends StObject {
  
  def create(options: CellHeight): JQuery[HTMLDivElement] = js.native
}
object ColorPicker {
  
  @scala.inline
  def apply(create: CellHeight => JQuery[HTMLDivElement]): ColorPicker = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ColorPicker]
  }
  
  @scala.inline
  implicit class ColorPickerMutableBuilder[Self <: ColorPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: CellHeight => JQuery[HTMLDivElement]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
