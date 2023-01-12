package typings.pdfjsDist.typesSrcDisplayApiMod

import typings.pdfjsDist.typesSrcDisplayAnnotationStorageMod.PrintAnnotationStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOperatorListParameters extends StObject {
  
  /**
    * Controls which annotations are included
    * in the operatorList, for annotations with appearance-data; the values from
    * {@link AnnotationMode } should be used. The following values are supported:
    * - `AnnotationMode.DISABLE`, which disables all annotations.
    * - `AnnotationMode.ENABLE`, which includes all possible annotations (thus
    * it also depends on the `intent`-option, see above).
    * - `AnnotationMode.ENABLE_FORMS`, which excludes annotations that contain
    * interactive form elements (those will be rendered in the display layer).
    * - `AnnotationMode.ENABLE_STORAGE`, which includes all possible annotations
    * (as above) but where interactive form elements are updated with data
    * from the {@link AnnotationStorage }-instance; useful e.g. for printing.
    * The default value is `AnnotationMode.ENABLE`.
    */
  var annotationMode: js.UndefOr[Double] = js.undefined
  
  /**
    * - Rendering intent, can be 'display', 'print',
    * or 'any'. The default value is 'display'.
    */
  var intent: js.UndefOr[String] = js.undefined
  
  var printAnnotationStorage: js.UndefOr[PrintAnnotationStorage] = js.undefined
}
object GetOperatorListParameters {
  
  inline def apply(): GetOperatorListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperatorListParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOperatorListParameters] (val x: Self) extends AnyVal {
    
    inline def setAnnotationMode(value: Double): Self = StObject.set(x, "annotationMode", value.asInstanceOf[js.Any])
    
    inline def setAnnotationModeUndefined: Self = StObject.set(x, "annotationMode", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setPrintAnnotationStorage(value: PrintAnnotationStorage): Self = StObject.set(x, "printAnnotationStorage", value.asInstanceOf[js.Any])
    
    inline def setPrintAnnotationStorageUndefined: Self = StObject.set(x, "printAnnotationStorage", js.undefined)
  }
}
