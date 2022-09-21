package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.SdkError
import typings.microsoftteams.microsoftTeams.media.BarCodeConfig
import typings.microsoftteams.microsoftTeams.media.FileFormat
import typings.microsoftteams.microsoftTeams.media.ImageUri
import typings.microsoftteams.microsoftTeams.media.MediaInputs
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  @JSGlobal("microsoftTeams.media")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The modes in which camera can be launched in select Media API
    */
  @JSGlobal("microsoftTeams.media.CameraStartMode")
  @js.native
  object CameraStartMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.media.CameraStartMode & Double] = js.native
    
    /* 4 */ val BusinessCard: typings.microsoftteams.microsoftTeams.media.CameraStartMode.BusinessCard & Double = js.native
    
    /* 2 */ val Document: typings.microsoftteams.microsoftTeams.media.CameraStartMode.Document & Double = js.native
    
    /* 1 */ val Photo: typings.microsoftteams.microsoftTeams.media.CameraStartMode.Photo & Double = js.native
    
    /* 3 */ val Whiteboard: typings.microsoftteams.microsoftTeams.media.CameraStartMode.Whiteboard & Double = js.native
  }
  
  /**
    * File object that can be used to represent image or video or audio
    */
  @JSGlobal("microsoftTeams.media.File")
  @js.native
  open class File ()
    extends StObject
       with typings.microsoftteams.microsoftTeams.media.File {
    
    /**
      * Content of the file. When format is Base64, this is the base64 content
      * When format is ID, this is id mapping to the URI
      * When format is base64 and app needs to use this directly in HTML tags, it should convert this to dataUrl.
      */
    /* CompleteClass */
    var content: String = js.native
    
    /**
      * Format of the content
      */
    /* CompleteClass */
    var format: FileFormat = js.native
    
    /**
      * MIME type. This can be used for constructing a dataUrl, if needed.
      */
    /* CompleteClass */
    var mimeType: String = js.native
    
    /**
      * Size of the file in KB
      */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  /**
    * Enum for file formats supported
    */
  @JSGlobal("microsoftTeams.media.FileFormat")
  @js.native
  object FileFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.microsoftteams.microsoftTeams.media.FileFormat & String] = js.native
    
    /* "base64" */ val Base64: typings.microsoftteams.microsoftTeams.media.FileFormat.Base64 & String = js.native
    
    /* "id" */ val ID: typings.microsoftteams.microsoftTeams.media.FileFormat.ID & String = js.native
  }
  
  /**
    * ID contains a mapping for content uri on platform's side, URL is generic
    */
  @JSGlobal("microsoftTeams.media.ImageUriType")
  @js.native
  object ImageUriType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.media.ImageUriType & Double] = js.native
    
    /* 1 */ val ID: typings.microsoftteams.microsoftTeams.media.ImageUriType.ID & Double = js.native
    
    /* 2 */ val URL: typings.microsoftteams.microsoftTeams.media.ImageUriType.URL & Double = js.native
  }
  
  /**
    * Media object returned by the select Media API
    */
  @JSGlobal("microsoftTeams.media.Media")
  @js.native
  open class Media ()
    extends StObject
       with typings.microsoftteams.microsoftTeams.media.Media {
    def this(that: typings.microsoftteams.microsoftTeams.media.Media) = this()
    
    /**
      * Content of the file. When format is Base64, this is the base64 content
      * When format is ID, this is id mapping to the URI
      * When format is base64 and app needs to use this directly in HTML tags, it should convert this to dataUrl.
      */
    /* CompleteClass */
    var content: String = js.native
    
    /**
      * Format of the content
      */
    /* CompleteClass */
    var format: FileFormat = js.native
    
    /**
      * Gets the media in chunks irrespecitve of size, these chunks are assembled and sent back to the webapp as file/blob
      * @param callback returns blob of media
      */
    /* CompleteClass */
    override def getMedia(callback: js.Function2[/* error */ SdkError, /* blob */ Blob, Unit]): Unit = js.native
    
    /* private */ /* CompleteClass */
    var getMediaViaCallback: Any = js.native
    
    /* private */ /* CompleteClass */
    var getMediaViaHandler: Any = js.native
    
    /**
      * MIME type. This can be used for constructing a dataUrl, if needed.
      */
    /* CompleteClass */
    var mimeType: String = js.native
    
    /**
      * A preview of the file which is a lightweight representation.
      * In case of images this will be a thumbnail/compressed image in base64 encoding.
      */
    /* CompleteClass */
    var preview: String = js.native
    
    /**
      * Size of the file in KB
      */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  /**
    * Specifies the type of Media
    */
  @JSGlobal("microsoftTeams.media.MediaType")
  @js.native
  object MediaType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.media.MediaType & Double] = js.native
    
    /* 4 */ val Audio: typings.microsoftteams.microsoftTeams.media.MediaType.Audio & Double = js.native
    
    /* 1 */ val Image: typings.microsoftteams.microsoftTeams.media.MediaType.Image & Double = js.native
  }
  
  /**
    * Specifies the image source
    */
  @JSGlobal("microsoftTeams.media.Source")
  @js.native
  object Source extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.microsoftteams.microsoftTeams.media.Source & Double] = js.native
    
    /* 1 */ val Camera: typings.microsoftteams.microsoftTeams.media.Source.Camera & Double = js.native
    
    /* 2 */ val Gallery: typings.microsoftteams.microsoftTeams.media.Source.Gallery & Double = js.native
  }
  
  /**
    * Launch camera, capture image or choose image from gallery and return the images as a File[] object to the callback.
    * Callback will be called with an error, if there are any. App should first check the error.
    * If it is present the user can be updated with appropriate error message.
    * If error is null or undefined, then files will have the required result.
    * Note: Currently we support getting one File through this API, i.e. the file arrays size will be one.
    * Note: For desktop, this API is not supported. Callback will be resolved with ErrorCode.NotSupported.
    * @see File
    * @see SdkError
    */
  inline def captureImage(
    callback: js.Function2[
      /* error */ SdkError, 
      /* files */ js.Array[typings.microsoftteams.microsoftTeams.media.File], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureImage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Scan Barcode/QRcode using camera
    * Note: For desktop and web, this API is not supported. Callback will be resolved with ErrorCode.NotSupported.
    * @param callback callback to invoke after scanning the barcode
    * @param config optional input configuration to customize the barcode scanning experience
    */
  inline def scanBarCode(callback: js.Function2[/* error */ SdkError, /* decodedText */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scanBarCode")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scanBarCode(
    callback: js.Function2[/* error */ SdkError, /* decodedText */ String, Unit],
    config: BarCodeConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scanBarCode")(callback.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Select an attachment using camera/gallery
    * @param mediaInputs The input params to customize the media to be selected
    * @param callback The callback to invoke after fetching the media
    */
  inline def selectMedia(
    mediaInputs: MediaInputs,
    callback: js.Function2[
      /* error */ SdkError, 
      /* attachments */ js.Array[typings.microsoftteams.microsoftTeams.media.Media], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectMedia")(mediaInputs.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * View images using native image viewer
    * @param uriList urilist of images to be viewed - can be content uri or server url. supports upto 10 Images in one go
    * @param callback returns back error if encountered, returns null in case of success
    */
  inline def viewImages(uriList: js.Array[ImageUri], callback: js.Function1[/* error */ js.UndefOr[SdkError], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("viewImages")(uriList.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
