package typings.multerS3.mod

import typings.awsSdk.mod.S3
import typings.expressServeStaticCore.mod.global.Express.Request
import typings.multer.mod.global.Express.Multer.File
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("bucket", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBucket(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3(value: S3): Self = this.set("s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("acl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAcl(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setCacheControlFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("cacheControl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCacheControl(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    
    @scala.inline
    def setContentType(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function3[
          /* error */ js.Any, 
          /* mime */ js.UndefOr[String], 
          /* stream */ js.UndefOr[ReadableStream], 
          Unit
        ]) => Unit
    ): Self = this.set("contentType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setKey(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("key", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("metadata", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionFunction3(
      value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("serverSideEncryption", js.Any.fromFunction3(value))
    
    @scala.inline
    def setServerSideEncryption(
      value: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
    ): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
  }
}
