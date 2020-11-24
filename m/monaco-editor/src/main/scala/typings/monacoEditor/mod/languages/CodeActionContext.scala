package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.editor.IMarkerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeActionContext extends js.Object {
  
  /**
    * An array of diagnostics.
    */
  val markers: js.Array[IMarkerData] = js.native
  
  /**
    * Requested kind of actions to return.
    */
  val only: js.UndefOr[String] = js.native
}
object CodeActionContext {
  
  @scala.inline
  def apply(markers: js.Array[IMarkerData]): CodeActionContext = {
    val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionContext]
  }
  
  @scala.inline
  implicit class CodeActionContextOps[Self <: CodeActionContext] (val x: Self) extends AnyVal {
    
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
    def setMarkersVarargs(value: IMarkerData*): Self = this.set("markers", js.Array(value :_*))
    
    @scala.inline
    def setMarkers(value: js.Array[IMarkerData]): Self = this.set("markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly(value: String): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
  }
}
