package typings
package navigoLib.navigoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GenericHooks extends js.Object {
  var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[navigoLib.Params], scala.Unit]] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* done */ js.Function1[/* suppress */ js.UndefOr[scala.Boolean], scala.Unit], 
      /* params */ js.UndefOr[navigoLib.Params], 
      scala.Unit
    ]
  ] = js.undefined
}

