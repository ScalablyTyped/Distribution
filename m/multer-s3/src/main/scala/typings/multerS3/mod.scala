package typings.multerS3

import org.scalablytyped.runtime.Shortcut
import typings.awsSdk.mod.S3
import typings.expressServeStaticCore.mod.global.Express.Request
import typings.multer.mod.StorageEngine
import typings.multer.mod.global.Express.Multer.File
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("multer-s3", JSImport.Namespace)
  @js.native
  val ^ : S3Storage = js.native
  
  @js.native
  trait Options extends StObject {
    
    var acl: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.native
    
    var bucket: (js.Function3[
        /* req */ Request, 
        /* file */ File, 
        /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
        Unit
      ]) | String = js.native
    
    var cacheControl: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.native
    
    var contentType: js.UndefOr[
        js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function3[
            /* error */ js.Any, 
            /* mime */ js.UndefOr[String], 
            /* stream */ js.UndefOr[ReadableStream], 
            Unit
          ], 
          Unit
        ]
      ] = js.native
    
    var key: js.UndefOr[
        js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit], 
          Unit
        ]
      ] = js.native
    
    var metadata: js.UndefOr[
        js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit], 
          Unit
        ]
      ] = js.native
    
    var s3: S3 = js.native
    
    var serverSideEncryption: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      bucket: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
          Unit
        ]) | String,
      s3: S3
    ): Options = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcl(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAclFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "acl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      @scala.inline
      def setBucket(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "bucket", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCacheControl(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheControlFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "cacheControl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      @scala.inline
      def setContentType(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function3[
              /* error */ js.Any, 
              /* mime */ js.UndefOr[String], 
              /* stream */ js.UndefOr[ReadableStream], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "contentType", js.Any.fromFunction3(value))
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setKey(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "key", js.Any.fromFunction3(value))
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMetadata(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit]) => Unit
      ): Self = StObject.set(x, "metadata", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setS3(value: S3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryption(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSideEncryptionFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "serverSideEncryption", js.Any.fromFunction3(value))
      
      @scala.inline
      def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    }
  }
  
  @js.native
  trait S3Storage extends StObject {
    
    def apply(): StorageEngine = js.native
    def apply(options: Options): StorageEngine = js.native
    
    def AUTO_CONTENT_TYPE(
      req: Request,
      file: File,
      callback: js.Function3[
          /* error */ js.Any, 
          /* mime */ js.UndefOr[String], 
          /* stream */ js.UndefOr[ReadableStream], 
          Unit
        ]
    ): Unit = js.native
    
    def DEFAULT_CONTENT_TYPE(
      req: Request,
      file: File,
      callback: js.Function2[/* error */ js.Any, /* mime */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  type _To = S3Storage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: S3Storage = ^
  
  object global {
    
    object Express {
      
      object MulterS3 {
        
        @js.native
        trait File
          extends typings.multer.mod.global.Express.Multer.File {
          
          var acl: String = js.native
          
          var bucket: String = js.native
          
          var contentDisposition: Null = js.native
          
          var contentType: String = js.native
          
          var etag: String = js.native
          
          var key: String = js.native
          
          var location: String = js.native
          
          var metadata: js.Any = js.native
          
          var serverSideEncryption: Null = js.native
          
          var storageClass: String = js.native
        }
        object File {
          
          @scala.inline
          def apply(
            acl: String,
            bucket: String,
            buffer: Buffer,
            contentDisposition: Null,
            contentType: String,
            destination: String,
            encoding: String,
            etag: String,
            fieldname: String,
            filename: String,
            key: String,
            location: String,
            metadata: js.Any,
            mimetype: String,
            originalname: String,
            path: String,
            serverSideEncryption: Null,
            size: Double,
            storageClass: String,
            stream: Readable
          ): typings.multerS3.mod.global.Express.MulterS3.File = {
            val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
            __obj.asInstanceOf[typings.multerS3.mod.global.Express.MulterS3.File]
          }
          
          @scala.inline
          implicit class FileMutableBuilder[Self <: typings.multerS3.mod.global.Express.MulterS3.File] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setContentDisposition(value: Null): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setServerSideEncryption(value: Null): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
