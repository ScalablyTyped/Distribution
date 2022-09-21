package typings.nodeZendesk.mod

import typings.node.fsMod.PathLike
import typings.nodeZendesk.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Attachments {
  
  /**
    * @see {@link https://developer.zendesk.com/rest_api/docs/support/attachments#json-format}
    */
  trait Attachment
    extends StObject
       with PersistableModel {
    
    val content_type: js.UndefOr[String] = js.undefined
    
    val content_url: js.UndefOr[String] = js.undefined
    
    val deleted: js.UndefOr[Boolean] = js.undefined
    
    val file_name: js.UndefOr[String] = js.undefined
    
    val `inline`: js.UndefOr[Boolean] = js.undefined
    
    val mapped_content_url: js.UndefOr[String] = js.undefined
    
    val size: js.UndefOr[Double] = js.undefined
    
    val url: js.UndefOr[String] = js.undefined
  }
  object Attachment {
    
    inline def apply(id: ZendeskID): Attachment = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    extension [Self <: Attachment](x: Self) {
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      inline def setContent_url(value: String): Self = StObject.set(x, "content_url", value.asInstanceOf[js.Any])
      
      inline def setContent_urlUndefined: Self = StObject.set(x, "content_url", js.undefined)
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
      
      inline def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
      
      inline def setFile_nameUndefined: Self = StObject.set(x, "file_name", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setMapped_content_url(value: String): Self = StObject.set(x, "mapped_content_url", value.asInstanceOf[js.Any])
      
      inline def setMapped_content_urlUndefined: Self = StObject.set(x, "mapped_content_url", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    def request(httpMethod: String, fields: Any, config: Any): js.Promise[Any] = js.native
    def request(httpMethod: String, fields: Any, config: Any, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def show(attachmentId: Double): js.Promise[ShowResponseModel] = js.native
    def show(attachmentId: Double, cb: ZendeskCallback[Any, ShowResponseModel]): Any = js.native
    
    def upload(file: PathLike, fileOptions: Filename): js.Promise[UploadResponseModel] = js.native
    def upload(file: PathLike, fileOptions: Filename, cb: ZendeskCallback[Any, UploadResponseModel]): Unit = js.native
  }
  
  trait Model
    extends StObject
       with Attachment {
    
    var thumbnails: js.UndefOr[js.Array[Attachment]] = js.undefined
  }
  object Model {
    
    inline def apply(id: ZendeskID): Model = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Model]
    }
    
    extension [Self <: Model](x: Self) {
      
      inline def setThumbnails(value: js.Array[Attachment]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
      
      inline def setThumbnailsVarargs(value: Attachment*): Self = StObject.set(x, "thumbnails", js.Array(value*))
    }
  }
  
  trait ShowResponseModel extends StObject {
    
    var attachment: Attachment
  }
  object ShowResponseModel {
    
    inline def apply(attachment: Attachment): ShowResponseModel = {
      val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowResponseModel]
    }
    
    extension [Self <: ShowResponseModel](x: Self) {
      
      inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadResponseModel extends StObject {
    
    var upload: typings.nodeZendesk.anon.Attachment
  }
  object UploadResponseModel {
    
    inline def apply(upload: typings.nodeZendesk.anon.Attachment): UploadResponseModel = {
      val __obj = js.Dynamic.literal(upload = upload.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadResponseModel]
    }
    
    extension [Self <: UploadResponseModel](x: Self) {
      
      inline def setUpload(value: typings.nodeZendesk.anon.Attachment): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    }
  }
}
