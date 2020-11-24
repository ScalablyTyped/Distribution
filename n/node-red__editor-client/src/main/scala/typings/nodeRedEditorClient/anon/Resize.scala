package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.vertical
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resize extends js.Object {
  
  var container: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  var dir: js.UndefOr[vertical] = js.native
  
  var id: String = js.native
  
  var resize: js.UndefOr[js.Function2[/* size1 */ Double, /* size2 */ Double, Unit]] = js.native
}
object Resize {
  
  @scala.inline
  def apply(id: String): Resize = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resize]
  }
  
  @scala.inline
  implicit class ResizeOps[Self <: Resize] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: JQuery[HTMLElement]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDir(value: vertical): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setResize(value: (/* size1 */ Double, /* size2 */ Double) => Unit): Self = this.set("resize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
  }
}
