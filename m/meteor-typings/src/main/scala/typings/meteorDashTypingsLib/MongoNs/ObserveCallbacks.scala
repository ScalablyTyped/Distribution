package typings
package meteorDashTypingsLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveCallbacks extends js.Object {
  var added: js.UndefOr[js.Function1[/* document */ js.Object, scala.Unit]] = js.undefined
  var addedAt: js.UndefOr[
    js.Function3[
      /* document */ js.Object, 
      /* atIndex */ scala.Double, 
      /* before */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var changed: js.UndefOr[
    js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, scala.Unit]
  ] = js.undefined
  var changedAt: js.UndefOr[
    js.Function3[
      /* newDocument */ js.Object, 
      /* oldDocument */ js.Object, 
      /* indexAt */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ js.Object, 
      /* fromIndex */ scala.Double, 
      /* toIndex */ scala.Double, 
      /* before */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, scala.Unit]] = js.undefined
  var removedAt: js.UndefOr[
    js.Function2[/* oldDocument */ js.Object, /* atIndex */ scala.Double, scala.Unit]
  ] = js.undefined
}

