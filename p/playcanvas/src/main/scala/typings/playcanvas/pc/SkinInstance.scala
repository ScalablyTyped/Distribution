package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A skin instance is responsible for generating the matrix palette that is used to
  * skin vertices from object space to world space.
  * @property bones - An array of nodes representing each bone in this skin instance.
  * @param skin - The skin that will provide the inverse bind pose matrices to
  * generate the final matrix palette.
  */
@js.native
trait SkinInstance extends js.Object {
  
  /**
    * An array of nodes representing each bone in this skin instance.
    */
  var bones: js.Array[GraphNode] = js.native
}
object SkinInstance {
  
  @scala.inline
  def apply(bones: js.Array[GraphNode]): SkinInstance = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinInstance]
  }
  
  @scala.inline
  implicit class SkinInstanceOps[Self <: SkinInstance] (val x: Self) extends AnyVal {
    
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
    def setBonesVarargs(value: GraphNode*): Self = this.set("bones", js.Array(value :_*))
    
    @scala.inline
    def setBones(value: js.Array[GraphNode]): Self = this.set("bones", value.asInstanceOf[js.Any])
  }
}
