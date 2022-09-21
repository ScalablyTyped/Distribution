package typings.microsoftteams.microsoftTeams.media

import typings.microsoftteams.microsoftTeams.SdkError
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media object returned by the select Media API
  */
trait Media
  extends StObject
     with File {
  
  /**
    * Gets the media in chunks irrespecitve of size, these chunks are assembled and sent back to the webapp as file/blob
    * @param callback returns blob of media
    */
  def getMedia(callback: js.Function2[/* error */ SdkError, /* blob */ Blob, Unit]): Unit
  
  /* private */ var getMediaViaCallback: Any
  
  /* private */ var getMediaViaHandler: Any
  
  /**
    * A preview of the file which is a lightweight representation.
    * In case of images this will be a thumbnail/compressed image in base64 encoding.
    */
  var preview: String
}
object Media {
  
  inline def apply(
    content: String,
    format: FileFormat,
    getMedia: js.Function2[/* error */ SdkError, /* blob */ Blob, Unit] => Unit,
    getMediaViaCallback: Any,
    getMediaViaHandler: Any,
    mimeType: String,
    preview: String,
    size: Double
  ): Media = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], getMedia = js.Any.fromFunction1(getMedia), getMediaViaCallback = getMediaViaCallback.asInstanceOf[js.Any], getMediaViaHandler = getMediaViaHandler.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  extension [Self <: Media](x: Self) {
    
    inline def setGetMedia(value: js.Function2[/* error */ SdkError, /* blob */ Blob, Unit] => Unit): Self = StObject.set(x, "getMedia", js.Any.fromFunction1(value))
    
    inline def setGetMediaViaCallback(value: Any): Self = StObject.set(x, "getMediaViaCallback", value.asInstanceOf[js.Any])
    
    inline def setGetMediaViaHandler(value: Any): Self = StObject.set(x, "getMediaViaHandler", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
