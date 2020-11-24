package typings.prettier.docMod.builders

import typings.prettier.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Align_ extends _Doc {
  
  var contents: Doc = js.native
  
  var n: Double | String | Type = js.native
  
  var `type`: typings.prettier.prettierStrings.align = js.native
}
object Align_ {
  
  @scala.inline
  def apply(contents: Doc, n: Double | String | Type, `type`: typings.prettier.prettierStrings.align): Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align_]
  }
  
  @scala.inline
  implicit class Align_Ops[Self <: Align_] (val x: Self) extends AnyVal {
    
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
    def setContents(value: Doc): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double | String | Type): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.prettier.prettierStrings.align): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
