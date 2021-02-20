package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.Instantiable0
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.format.Feature
import typings.openlayers.mod.source.Vector
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndDropOptions extends StObject {
  
  var formatConstructors: js.UndefOr[js.Array[Instantiable0[Feature]]] = js.native
  
  var projection: ProjectionLike = js.native
  
  var source: js.UndefOr[Vector] = js.native
  
  var target: js.UndefOr[Element] = js.native
}
object DragAndDropOptions {
  
  @scala.inline
  def apply(): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDropOptions]
  }
  
  @scala.inline
  implicit class DragAndDropOptionsMutableBuilder[Self <: DragAndDropOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatConstructors(value: js.Array[Instantiable0[Feature]]): Self = StObject.set(x, "formatConstructors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatConstructorsUndefined: Self = StObject.set(x, "formatConstructors", js.undefined)
    
    @scala.inline
    def setFormatConstructorsVarargs(value: Instantiable0[Feature]*): Self = StObject.set(x, "formatConstructors", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
