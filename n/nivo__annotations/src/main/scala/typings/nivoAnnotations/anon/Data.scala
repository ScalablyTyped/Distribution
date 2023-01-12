package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.AnnotationDimensionsGetter
import typings.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typings.nivoAnnotations.distTypesTypesMod.AnnotationPositionGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[Datum] extends StObject {
  
  var annotations: js.Array[AnnotationMatcher[Datum]]
  
  var data: js.Array[Datum]
  
  var getDimensions: AnnotationDimensionsGetter[Datum]
  
  var getPosition: AnnotationPositionGetter[Datum]
}
object Data {
  
  inline def apply[Datum](
    annotations: js.Array[AnnotationMatcher[Datum]],
    data: js.Array[Datum],
    getDimensions: Datum => Width,
    getPosition: Datum => Y
  ): Data[Datum] = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getDimensions = js.Any.fromFunction1(getDimensions), getPosition = js.Any.fromFunction1(getPosition))
    __obj.asInstanceOf[Data[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], Datum] (val x: Self & Data[Datum]) extends AnyVal {
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[Datum]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[Datum]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGetDimensions(value: Datum => Width): Self = StObject.set(x, "getDimensions", js.Any.fromFunction1(value))
    
    inline def setGetPosition(value: Datum => Y): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
  }
}
