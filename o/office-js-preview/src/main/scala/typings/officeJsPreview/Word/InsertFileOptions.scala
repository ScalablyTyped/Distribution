package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the options to determine what to copy when inserting a file.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
trait InsertFileOptions extends StObject {
  
  /**
    * Represents whether the change tracking mode status from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var importChangeTrackingMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether the custom properties from the source document should be imported. Overwrites existing properties with the same name.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importCustomProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether the custom XML parts from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importCustomXmlParts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether the page color and other background information from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var importPageColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether the paragraph spacing from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var importParagraphSpacing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether the styles from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var importStyles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents whether the theme from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var importTheme: js.UndefOr[Boolean] = js.undefined
}
object InsertFileOptions {
  
  inline def apply(): InsertFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertFileOptions] (val x: Self) extends AnyVal {
    
    inline def setImportChangeTrackingMode(value: Boolean): Self = StObject.set(x, "importChangeTrackingMode", value.asInstanceOf[js.Any])
    
    inline def setImportChangeTrackingModeUndefined: Self = StObject.set(x, "importChangeTrackingMode", js.undefined)
    
    inline def setImportCustomProperties(value: Boolean): Self = StObject.set(x, "importCustomProperties", value.asInstanceOf[js.Any])
    
    inline def setImportCustomPropertiesUndefined: Self = StObject.set(x, "importCustomProperties", js.undefined)
    
    inline def setImportCustomXmlParts(value: Boolean): Self = StObject.set(x, "importCustomXmlParts", value.asInstanceOf[js.Any])
    
    inline def setImportCustomXmlPartsUndefined: Self = StObject.set(x, "importCustomXmlParts", js.undefined)
    
    inline def setImportPageColor(value: Boolean): Self = StObject.set(x, "importPageColor", value.asInstanceOf[js.Any])
    
    inline def setImportPageColorUndefined: Self = StObject.set(x, "importPageColor", js.undefined)
    
    inline def setImportParagraphSpacing(value: Boolean): Self = StObject.set(x, "importParagraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setImportParagraphSpacingUndefined: Self = StObject.set(x, "importParagraphSpacing", js.undefined)
    
    inline def setImportStyles(value: Boolean): Self = StObject.set(x, "importStyles", value.asInstanceOf[js.Any])
    
    inline def setImportStylesUndefined: Self = StObject.set(x, "importStyles", js.undefined)
    
    inline def setImportTheme(value: Boolean): Self = StObject.set(x, "importTheme", value.asInstanceOf[js.Any])
    
    inline def setImportThemeUndefined: Self = StObject.set(x, "importTheme", js.undefined)
  }
}
