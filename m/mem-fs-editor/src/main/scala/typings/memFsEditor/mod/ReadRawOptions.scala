package typings.memFsEditor.mod

import typings.memFsEditor.memFsEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadRawOptions extends js.Object {
  
  var defaults: js.UndefOr[ReadRawContents] = js.native
  
  var raw: `true` = js.native
}
object ReadRawOptions {
  
  @scala.inline
  def apply(raw: `true`): ReadRawOptions = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadRawOptions]
  }
  
  @scala.inline
  implicit class ReadRawOptionsOps[Self <: ReadRawOptions] (val x: Self) extends AnyVal {
    
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
    def setRaw(value: `true`): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: ReadRawContents): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setDefaultsNull: Self = this.set("defaults", null)
  }
}
