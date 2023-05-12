package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getTextContentParameters extends StObject {
  
  /**
    * - When true the text is *not*
    * normalized in the worker-thread. The default is `false`.
    */
  var disableNormalization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * - When true include marked
    * content items in the items array of TextContent. The default is `false`.
    */
  var includeMarkedContent: js.UndefOr[Boolean] = js.undefined
}
object getTextContentParameters {
  
  inline def apply(): getTextContentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[getTextContentParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: getTextContentParameters] (val x: Self) extends AnyVal {
    
    inline def setDisableNormalization(value: Boolean): Self = StObject.set(x, "disableNormalization", value.asInstanceOf[js.Any])
    
    inline def setDisableNormalizationUndefined: Self = StObject.set(x, "disableNormalization", js.undefined)
    
    inline def setIncludeMarkedContent(value: Boolean): Self = StObject.set(x, "includeMarkedContent", value.asInstanceOf[js.Any])
    
    inline def setIncludeMarkedContentUndefined: Self = StObject.set(x, "includeMarkedContent", js.undefined)
  }
}
