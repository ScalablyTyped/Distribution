package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelName extends StObject {
  
  /** @description An alternate short description of the asset. Used in place of the filename. */
  var label: js.UndefOr[String] = js.undefined
  
  /** @description The file name of the asset. */
  var name: js.UndefOr[String] = js.undefined
  
  /** @example "uploaded" */
  var state: js.UndefOr[String] = js.undefined
}
object LabelName {
  
  inline def apply(): LabelName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelName]
  }
  
  extension [Self <: LabelName](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
