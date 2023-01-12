package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.BoundAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsArray[Datum] extends StObject {
  
  var annotations: js.Array[BoundAnnotation[Datum]]
}
object AnnotationsArray {
  
  inline def apply[Datum](annotations: js.Array[BoundAnnotation[Datum]]): AnnotationsArray[Datum] = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationsArray[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationsArray[?], Datum] (val x: Self & AnnotationsArray[Datum]) extends AnyVal {
    
    inline def setAnnotations(value: js.Array[BoundAnnotation[Datum]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: BoundAnnotation[Datum]*): Self = StObject.set(x, "annotations", js.Array(value*))
  }
}
