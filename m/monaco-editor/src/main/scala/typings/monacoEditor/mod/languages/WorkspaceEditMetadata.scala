package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Dark
import typings.monacoEditor.anon.Id
import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceEditMetadata extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var iconPath: js.UndefOr[Id | Uri | Dark] = js.undefined
  
  var label: String
  
  var needsConfirmation: Boolean
}
object WorkspaceEditMetadata {
  
  inline def apply(label: String, needsConfirmation: Boolean): WorkspaceEditMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditMetadata]
  }
  
  extension [Self <: WorkspaceEditMetadata](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIconPath(value: Id | Uri | Dark): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNeedsConfirmation(value: Boolean): Self = StObject.set(x, "needsConfirmation", value.asInstanceOf[js.Any])
  }
}
