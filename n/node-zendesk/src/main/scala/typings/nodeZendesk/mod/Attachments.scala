package typings.nodeZendesk.mod

import typings.node.fsMod.PathLike
import typings.nodeZendesk.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Attachments {
  
  @js.native
  trait Methods extends StObject {
    
    def request(httpMethod: String, fields: js.Any, config: js.Any): js.Promise[_] = js.native
    def request(httpMethod: String, fields: js.Any, config: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
    
    def upload(file: PathLike, fileOptions: Filename): js.Promise[Unit] = js.native
    def upload(file: PathLike, fileOptions: Filename, cb: ZendeskCallback[_, _]): Unit = js.native
  }
  
  @js.native
  trait Model extends Photo {
    
    var thumbnails: js.Array[Photo] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(
      content_type: String,
      content_url: String,
      file_name: String,
      height: Double,
      id: ZendeskID,
      `inline`: Boolean,
      size: Double,
      thumbnails: js.Array[Photo],
      url: String,
      width: Double
    ): Model = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnails = thumbnails.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThumbnails(value: js.Array[Photo]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailsVarargs(value: Photo*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Photo extends PersistableModel {
    
    var content_type: String = js.native
    
    var content_url: String = js.native
    
    var file_name: String = js.native
    
    var height: Double = js.native
    
    var `inline`: Boolean = js.native
    
    var size: Double = js.native
    
    var url: String = js.native
    
    var width: Double = js.native
  }
  object Photo {
    
    @scala.inline
    def apply(
      content_type: String,
      content_url: String,
      file_name: String,
      height: Double,
      id: ZendeskID,
      `inline`: Boolean,
      size: Double,
      url: String,
      width: Double
    ): Photo = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], content_url = content_url.asInstanceOf[js.Any], file_name = file_name.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Photo]
    }
    
    @scala.inline
    implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent_url(value: String): Self = StObject.set(x, "content_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
