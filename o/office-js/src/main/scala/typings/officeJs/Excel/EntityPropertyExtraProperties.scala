package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties used by `CellValueAndPropertyMetadata`. These properties refer to the metadata and not to a `CellValue`.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EntityPropertyExtraProperties extends StObject {
  
  /**
    * Represents metadata about the property.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var propertyMetadata: js.UndefOr[CellValuePropertyMetadata] = js.undefined
}
object EntityPropertyExtraProperties {
  
  inline def apply(): EntityPropertyExtraProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityPropertyExtraProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityPropertyExtraProperties] (val x: Self) extends AnyVal {
    
    inline def setPropertyMetadata(value: CellValuePropertyMetadata): Self = StObject.set(x, "propertyMetadata", value.asInstanceOf[js.Any])
    
    inline def setPropertyMetadataUndefined: Self = StObject.set(x, "propertyMetadata", js.undefined)
  }
}
