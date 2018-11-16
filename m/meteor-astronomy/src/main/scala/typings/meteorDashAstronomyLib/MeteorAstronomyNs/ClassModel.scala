package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClassModel[T] extends js.Object {
  var behaviors: js.UndefOr[js.Object] = js.undefined
  var collection: js.UndefOr[meteorLib.MongoNs.Collection[T]] = js.undefined
  var events: js.UndefOr[js.Object] = js.undefined
  var fields: Fields[T]
  var helpers: js.UndefOr[Helpers[T]] = js.undefined
  var indexes: js.UndefOr[js.Object] = js.undefined
  var meteorMethods: js.UndefOr[js.Object] = js.undefined
  var name: java.lang.String
  var secured: js.UndefOr[meteorDashAstronomyLib.Anon_Update | scala.Boolean] = js.undefined
}

