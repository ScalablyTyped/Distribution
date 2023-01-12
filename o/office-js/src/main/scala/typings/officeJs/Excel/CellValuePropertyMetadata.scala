package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata about a property in `EntityCellValue.properties`.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CellValuePropertyMetadata extends StObject {
  
  /**
    * Represents attribution information to describe the source and license requirements for using this property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var attribution: js.UndefOr[js.Array[CellValueAttributionAttributes]] = js.undefined
  
  /**
    * Represents which features this property is excluded from.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var excludeFrom: js.UndefOr[CellValuePropertyMetadataExclusions] = js.undefined
  
  /**
    * Represents the sublabel for this property shown in card view.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var sublabel: js.UndefOr[String] = js.undefined
}
object CellValuePropertyMetadata {
  
  inline def apply(): CellValuePropertyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellValuePropertyMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CellValuePropertyMetadata] (val x: Self) extends AnyVal {
    
    inline def setAttribution(value: js.Array[CellValueAttributionAttributes]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setAttributionVarargs(value: CellValueAttributionAttributes*): Self = StObject.set(x, "attribution", js.Array(value*))
    
    inline def setExcludeFrom(value: CellValuePropertyMetadataExclusions): Self = StObject.set(x, "excludeFrom", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromUndefined: Self = StObject.set(x, "excludeFrom", js.undefined)
    
    inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    inline def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
  }
}
