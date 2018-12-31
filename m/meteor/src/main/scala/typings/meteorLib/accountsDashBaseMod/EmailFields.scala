package typings
package meteorLib.accountsDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var html: js.UndefOr[
    js.Function2[/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
  var subject: js.UndefOr[js.Function1[/* user */ meteorLib.MeteorNs.User, java.lang.String]] = js.undefined
  var text: js.UndefOr[
    js.Function2[/* user */ meteorLib.MeteorNs.User, /* url */ java.lang.String, java.lang.String]
  ] = js.undefined
}

