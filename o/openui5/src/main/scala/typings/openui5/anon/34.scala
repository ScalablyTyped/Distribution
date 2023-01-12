package typings.openui5.anon

import typings.openui5.sapUiModelOdataV2OdataannotationsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  /**
    * The annotations object
    */
  var annotations: js.UndefOr[default] = js.undefined
}
object `34` {
  
  inline def apply(): `34` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`34`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `34`] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: default): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
  }
}
