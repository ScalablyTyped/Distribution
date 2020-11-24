package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fragment extends js.Object {
  
  var fragment: js.UndefOr[String] = js.native
  
  var geometryClass: js.UndefOr[js.Any] = js.native
  
  var vertex: js.UndefOr[String] = js.native
  
  var vertexSize: js.UndefOr[Double] = js.native
}
object Fragment {
  
  @scala.inline
  def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    
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
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    
    @scala.inline
    def setGeometryClass(value: js.Any): Self = this.set("geometryClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryClass: Self = this.set("geometryClass", js.undefined)
    
    @scala.inline
    def setVertex(value: String): Self = this.set("vertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertex: Self = this.set("vertex", js.undefined)
    
    @scala.inline
    def setVertexSize(value: Double): Self = this.set("vertexSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexSize: Self = this.set("vertexSize", js.undefined)
  }
}
