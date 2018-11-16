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
  var s3: awsDashSdkLib.awsDashSdkMod.S3
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

