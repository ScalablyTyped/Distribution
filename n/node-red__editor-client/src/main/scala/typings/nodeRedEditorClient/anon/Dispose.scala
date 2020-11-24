package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispose extends js.Object {
  
  var align: js.UndefOr[right | left] = js.native
  
  var dispose: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var target: JQuery[HTMLElement] = js.native
}
object Dispose {
  
  @scala.inline
  def apply(target: JQuery[HTMLElement]): Dispose = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
  
  @scala.inline
  implicit class DisposeOps[Self <: Dispose] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: JQuery[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: right | left): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setDispose(value: Boolean): Self = this.set("dispose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Tuple2[Double, Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
