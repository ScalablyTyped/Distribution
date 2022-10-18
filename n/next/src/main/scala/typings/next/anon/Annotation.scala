package typings.next.anon

import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  var annotation: Boolean
  
  var `inline`: Boolean
  
  var prev: js.UndefOr[String | `false`] = js.undefined
}
object Annotation {
  
  inline def apply(annotation: Boolean, `inline`: Boolean): Annotation = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setAnnotation(value: Boolean): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: String | `false`): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
  }
}
