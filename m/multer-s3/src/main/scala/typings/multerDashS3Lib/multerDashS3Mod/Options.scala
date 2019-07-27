package typings
package multerDashS3Lib.multerDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var acl: js.UndefOr[
    (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | java.lang.String
  ] = js.undefined
  var bucket: (js.Function3[
    /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
    /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
    /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ]) | java.lang.String
  var cacheControl: js.UndefOr[
    (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | java.lang.String
  ] = js.undefined
  var contentType: js.UndefOr[
    js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function3[
        /* error */ js.Any, 
        /* mime */ js.UndefOr[java.lang.String], 
        /* stream */ js.UndefOr[nodeLib.NodeJSNs.ReadableStream], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var key: js.UndefOr[
    js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[java.lang.String], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var metadata: js.UndefOr[
    js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var s3: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.S3 */ js.Any
  var serverSideEncryption: js.UndefOr[
    (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[
        /* error */ js.Any, 
        /* serverSideEncryption */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]) | java.lang.String
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bucket: (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* bucket */ js.UndefOr[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | java.lang.String,
    s3: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.S3 */ js.Any,
    acl: (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* acl */ js.UndefOr[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | java.lang.String = null,
    cacheControl: (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[/* error */ js.Any, /* cacheControl */ js.UndefOr[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | java.lang.String = null,
    contentType: (/* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, /* callback */ js.Function3[
      /* error */ js.Any, 
      /* mime */ js.UndefOr[java.lang.String], 
      /* stream */ js.UndefOr[nodeLib.NodeJSNs.ReadableStream], 
      scala.Unit
    ]) => scala.Unit = null,
    key: (/* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, /* callback */ js.Function2[/* error */ js.Any, /* key */ js.UndefOr[java.lang.String], scala.Unit]) => scala.Unit = null,
    metadata: (/* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, /* callback */ js.Function2[/* error */ js.Any, /* metadata */ js.UndefOr[js.Any], scala.Unit]) => scala.Unit = null,
    serverSideEncryption: (js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, 
      /* file */ multerLib.multerMod.Global.ExpressNs.MulterNs.File, 
      /* callback */ js.Function2[
        /* error */ js.Any, 
        /* serverSideEncryption */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]) | java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], s3 = s3)
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(js.Any.fromFunction3(contentType))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction3(key))
    if (metadata != null) __obj.updateDynamic("metadata")(js.Any.fromFunction3(metadata))
    if (serverSideEncryption != null) __obj.updateDynamic("serverSideEncryption")(serverSideEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

