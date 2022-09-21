package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties used by `CellValueAndPropertyMetadata`. These properties refer to the metadata and not to a `CellValue`.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait EntityPropertyExtraProperties extends StObject {
  
  /**
    * Represents metadata about the property.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var propertyMetadata: js.UndefOr[CellValuePropertyMetadata] = js.undefined
}
object EntityPropertyExtraProperties {
  
  inline def apply(): EntityPropertyExtraProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityPropertyExtraProperties]
  }
  
  extension [Self <: EntityPropertyExtraProperties](x: Self) {
    
    inline def setPropertyMetadata(value: CellValuePropertyMetadata): Self = StObject.set(x, "propertyMetadata", value.asInstanceOf[js.Any])
    
    inline def setPropertyMetadataUndefined: Self = StObject.set(x, "propertyMetadata", js.undefined)
  }
}
