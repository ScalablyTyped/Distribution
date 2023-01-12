package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.ComputedAnnotation
import typings.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations[Datum] extends StObject {
  
  var annotations: js.Array[ComputedAnnotation[Datum]]
  
  var theme: CompleteTheme
}
object Annotations {
  
  inline def apply[Datum](annotations: js.Array[ComputedAnnotation[Datum]], theme: CompleteTheme): Annotations[Datum] = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotations[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotations[?], Datum] (val x: Self & Annotations[Datum]) extends AnyVal {
    
    inline def setAnnotations(value: js.Array[ComputedAnnotation[Datum]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: ComputedAnnotation[Datum]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
