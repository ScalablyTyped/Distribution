package typings.openui5.anon

import typings.openui5.sapUiModelOdataOdataannotationsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations extends StObject {
  
  /**
    * the annotations object.
    */
  var annotations: js.UndefOr[default] = js.undefined
}
object Annotations {
  
  inline def apply(): Annotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotations]
  }
  
  extension [Self <: Annotations](x: Self) {
    
    inline def setAnnotations(value: default): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
  }
}
