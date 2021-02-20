package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fragment extends StObject {
  
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
  implicit class FragmentMutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    @scala.inline
    def setGeometryClass(value: js.Any): Self = StObject.set(x, "geometryClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryClassUndefined: Self = StObject.set(x, "geometryClass", js.undefined)
    
    @scala.inline
    def setVertex(value: String): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexSize(value: Double): Self = StObject.set(x, "vertexSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexSizeUndefined: Self = StObject.set(x, "vertexSize", js.undefined)
    
    @scala.inline
    def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
