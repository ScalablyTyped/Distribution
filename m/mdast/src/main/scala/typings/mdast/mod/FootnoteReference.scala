package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteReference
import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FootnoteReference
  extends StaticPhrasingContent
     with Node
     with Association {
  
  @JSName("type")
  var type_FootnoteReference: footnoteReference = js.native
}
object FootnoteReference {
  
  @scala.inline
  def apply(identifier: String, `type`: footnoteReference): FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReference]
  }
  
  @scala.inline
  implicit class FootnoteReferenceOps[Self <: FootnoteReference] (val x: Self) extends AnyVal {
    
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
    def setType(value: footnoteReference): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
