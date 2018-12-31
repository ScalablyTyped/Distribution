package typings
package meteorDashTypingsLib.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var html: js.UndefOr[
    js.Function2[
      /* user */ meteorDashTypingsLib.MeteorNs.User, 
      /* url */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var subject: js.UndefOr[js.Function1[/* user */ meteorDashTypingsLib.MeteorNs.User, java.lang.String]] = js.undefined
  var text: js.UndefOr[
    js.Function2[
      /* user */ meteorDashTypingsLib.MeteorNs.User, 
      /* url */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

