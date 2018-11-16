package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObserveChangesCallbacks extends js.Object {
  var added: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
  var addedBefore: js.UndefOr[
    js.Function3[/* id */ java.lang.String, /* fields */ js.Object, /* before */ js.Object, scala.Unit]
  ] = js.undefined
  var changed: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
  var movedBefore: js.UndefOr[js.Function2[/* id */ java.lang.String, /* before */ js.Object, scala.Unit]] = js.undefined
  var removed: js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.undefined
}

