package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RubricQualitySelectedColumnModel extends StObject {
  
  // ID of the selected level for this quality.
  var columnId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // ID of the associated quality.
  var qualityId: js.UndefOr[NullableOption[String]] = js.undefined
}
object RubricQualitySelectedColumnModel {
  
  inline def apply(): RubricQualitySelectedColumnModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RubricQualitySelectedColumnModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RubricQualitySelectedColumnModel] (val x: Self) extends AnyVal {
    
    inline def setColumnId(value: NullableOption[String]): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setColumnIdNull: Self = StObject.set(x, "columnId", null)
    
    inline def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    inline def setQualityId(value: NullableOption[String]): Self = StObject.set(x, "qualityId", value.asInstanceOf[js.Any])
    
    inline def setQualityIdNull: Self = StObject.set(x, "qualityId", null)
    
    inline def setQualityIdUndefined: Self = StObject.set(x, "qualityId", js.undefined)
  }
}
