package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs.
  * ------
  */
trait FilePreviewParameters extends StObject {
  
  /**
    * Optional; the base url of the site where the file is hosted
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * An optional description of the file.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Optional; an alternate self-authenticating url used to preview the file in Mobile clients and offer it for download by the user
    */
  var downloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated; prefer using viewerAction instead
    * Optional; indicates whether the file should be opened in edit mode
    */
  var editFile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The developer-defined unique ID for the file.
    */
  var entityId: String
  
  /**
    * Optional; indicates how user prefers to open the file
    */
  var fileOpenPreference: js.UndefOr[FileOpenPreference] = js.undefined
  
  /**
    * A url to the source of the file, used to open the content in the user's default browser
    */
  var objectUrl: String
  
  /**
    * Optional; the developer-defined unique ID for the sub-entity to return to when the file stage closes.
    * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
    */
  var subEntityId: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of the file.
    */
  var title: String
  
  /**
    * The file extension; e.g. pptx, docx, etc.
    */
  var `type`: String
  
  /**
    * Optional; indicates the mode in which file should be opened. Takes precedence over edit mode.
    */
  var viewerAction: js.UndefOr[ViewerActionTypes] = js.undefined
  
  /**
    * Optional; an alternate url that allows editing of the file in Teams web and desktop clients
    */
  var webEditUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Optional; an alternate url optimized for previewing the file in Teams web and desktop clients
    */
  var webPreviewUrl: js.UndefOr[String] = js.undefined
}
object FilePreviewParameters {
  
  inline def apply(entityId: String, objectUrl: String, title: String, `type`: String): FilePreviewParameters = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], objectUrl = objectUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePreviewParameters]
  }
  
  extension [Self <: FilePreviewParameters](x: Self) {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setEditFile(value: Boolean): Self = StObject.set(x, "editFile", value.asInstanceOf[js.Any])
    
    inline def setEditFileUndefined: Self = StObject.set(x, "editFile", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setFileOpenPreference(value: FileOpenPreference): Self = StObject.set(x, "fileOpenPreference", value.asInstanceOf[js.Any])
    
    inline def setFileOpenPreferenceUndefined: Self = StObject.set(x, "fileOpenPreference", js.undefined)
    
    inline def setObjectUrl(value: String): Self = StObject.set(x, "objectUrl", value.asInstanceOf[js.Any])
    
    inline def setSubEntityId(value: String): Self = StObject.set(x, "subEntityId", value.asInstanceOf[js.Any])
    
    inline def setSubEntityIdUndefined: Self = StObject.set(x, "subEntityId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewerAction(value: ViewerActionTypes): Self = StObject.set(x, "viewerAction", value.asInstanceOf[js.Any])
    
    inline def setViewerActionUndefined: Self = StObject.set(x, "viewerAction", js.undefined)
    
    inline def setWebEditUrl(value: String): Self = StObject.set(x, "webEditUrl", value.asInstanceOf[js.Any])
    
    inline def setWebEditUrlUndefined: Self = StObject.set(x, "webEditUrl", js.undefined)
    
    inline def setWebPreviewUrl(value: String): Self = StObject.set(x, "webPreviewUrl", value.asInstanceOf[js.Any])
    
    inline def setWebPreviewUrlUndefined: Self = StObject.set(x, "webPreviewUrl", js.undefined)
  }
}
