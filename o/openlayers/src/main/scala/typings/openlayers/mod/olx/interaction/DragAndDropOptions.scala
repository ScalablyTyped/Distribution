package typings.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.Instantiable0
import typings.openlayers.mod.ProjectionLike
import typings.openlayers.mod.format.Feature
import typings.openlayers.mod.source.Vector
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndDropOptions extends StObject {
  
  var formatConstructors: js.UndefOr[js.Array[Instantiable0[Feature]]] = js.undefined
  
  var projection: ProjectionLike
  
  var source: js.UndefOr[Vector] = js.undefined
  
  var target: js.UndefOr[Element] = js.undefined
}
object DragAndDropOptions {
  
  inline def apply(): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDropOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragAndDropOptions] (val x: Self) extends AnyVal {
    
    inline def setFormatConstructors(value: js.Array[Instantiable0[Feature]]): Self = StObject.set(x, "formatConstructors", value.asInstanceOf[js.Any])
    
    inline def setFormatConstructorsUndefined: Self = StObject.set(x, "formatConstructors", js.undefined)
    
    inline def setFormatConstructorsVarargs(value: Instantiable0[Feature]*): Self = StObject.set(x, "formatConstructors", js.Array(value*))
    
    inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setSource(value: Vector): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
