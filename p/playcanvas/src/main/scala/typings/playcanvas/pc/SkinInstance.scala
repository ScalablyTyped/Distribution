package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
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
trait SkinInstance extends StObject {
  
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
  implicit class SkinInstanceMutableBuilder[Self <: SkinInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBones(value: js.Array[GraphNode]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBonesVarargs(value: GraphNode*): Self = StObject.set(x, "bones", js.Array(value :_*))
  }
}
