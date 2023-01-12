package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * File object that can be used to represent image or video or audio
  */
trait File extends StObject {
  
  /**
    * Content of the file. When format is Base64, this is the base64 content
    * When format is ID, this is id mapping to the URI
    * When format is base64 and app needs to use this directly in HTML tags, it should convert this to dataUrl.
    */
  var content: String
  
  /**
    * Format of the content
    */
  var format: FileFormat
  
  /**
    * MIME type. This can be used for constructing a dataUrl, if needed.
    */
  var mimeType: String
  
  /**
    * Optional: Name of the file
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Size of the file in KB
    */
  var size: Double
}
object File {
  
  inline def apply(content: String, format: FileFormat, mimeType: String, size: Double): File = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: FileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
