package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the options to determine what to copy when inserting a file.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait InsertFileOptions extends StObject {
  
  /**
    * Represents whether the change tracking mode status from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importChangeTrackingMode: Boolean
  
  /**
    * Represents whether the page color and other background information from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importPageColor: Boolean
  
  /**
    * Represents whether the paragraph spacing from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importParagraphSpacing: Boolean
  
  /**
    * Represents whether the styles from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importStyles: Boolean
  
  /**
    * Represents whether the theme from the source document should be imported.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var importTheme: Boolean
}
object InsertFileOptions {
  
  inline def apply(
    importChangeTrackingMode: Boolean,
    importPageColor: Boolean,
    importParagraphSpacing: Boolean,
    importStyles: Boolean,
    importTheme: Boolean
  ): InsertFileOptions = {
    val __obj = js.Dynamic.literal(importChangeTrackingMode = importChangeTrackingMode.asInstanceOf[js.Any], importPageColor = importPageColor.asInstanceOf[js.Any], importParagraphSpacing = importParagraphSpacing.asInstanceOf[js.Any], importStyles = importStyles.asInstanceOf[js.Any], importTheme = importTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertFileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertFileOptions] (val x: Self) extends AnyVal {
    
    inline def setImportChangeTrackingMode(value: Boolean): Self = StObject.set(x, "importChangeTrackingMode", value.asInstanceOf[js.Any])
    
    inline def setImportPageColor(value: Boolean): Self = StObject.set(x, "importPageColor", value.asInstanceOf[js.Any])
    
    inline def setImportParagraphSpacing(value: Boolean): Self = StObject.set(x, "importParagraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setImportStyles(value: Boolean): Self = StObject.set(x, "importStyles", value.asInstanceOf[js.Any])
    
    inline def setImportTheme(value: Boolean): Self = StObject.set(x, "importTheme", value.asInstanceOf[js.Any])
  }
}
