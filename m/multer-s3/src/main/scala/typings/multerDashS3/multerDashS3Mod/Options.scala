package typings.multerDashS3.multerDashS3Mod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod._Global_.Express.Request
import typings.multer.multerMod._Global_.Express.Multer.File
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var acl: js.UndefOr[
    (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
      Unit
    ]) | String
  ] = js.undefined
  var bucket: (js.Function3[
    /* req */ Request, 
    /* file */ File, 
    /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[String], Unit], 
    Unit
  ]) | String
  var cacheControl: js.UndefOr[
    (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
      Unit
    ]) | String
  ] = js.undefined
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
  ] = js.undefined
  var key: js.UndefOr[
    js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
  var metadata: js.UndefOr[
    js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  var s3: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.S3 */ js.Any
  var serverSideEncryption: js.UndefOr[
    (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
      Unit
    ]) | String
  ] = js.undefined
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
    s3: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.S3 */ js.Any,
    acl: (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[String], Unit], 
      Unit
    ]) | String = null,
    cacheControl: (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[String], Unit], 
      Unit
    ]) | String = null,
    contentType: (/* req */ Request, /* file */ File, /* callback */ js.Function3[
      /* error */ js.Any, 
      /* mime */ js.UndefOr[String], 
      /* stream */ js.UndefOr[ReadableStream], 
      Unit
    ]) => Unit = null,
    key: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[String], Unit]) => Unit = null,
    metadata: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], Unit]) => Unit = null,
    serverSideEncryption: (js.Function3[
      /* req */ Request, 
      /* file */ File, 
      /* callback */ js.Function2[/* error */ js.Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
      Unit
    ]) | String = null
  ): Options = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(js.Any.fromFunction3(contentType))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction3(key))
    if (metadata != null) __obj.updateDynamic("metadata")(js.Any.fromFunction3(metadata))
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

