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
  var secured: js.UndefOr[meteorDashAstronomyLib.Anon_Insert | scala.Boolean] = js.undefined
}

object ClassModel {
  @scala.inline
  def apply[T](
    fields: Fields[T],
    name: java.lang.String,
    behaviors: js.Object = null,
    collection: meteorLib.MongoNs.Collection[T] = null,
    events: js.Object = null,
    helpers: Helpers[T] = null,
    indexes: js.Object = null,
    meteorMethods: js.Object = null,
    secured: meteorDashAstronomyLib.Anon_Insert | scala.Boolean = null
  ): ClassModel[T] = {
    val __obj = js.Dynamic.literal(fields = fields, name = name)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (events != null) __obj.updateDynamic("events")(events)
    if (helpers != null) __obj.updateDynamic("helpers")(helpers)
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (meteorMethods != null) __obj.updateDynamic("meteorMethods")(meteorMethods)
    if (secured != null) __obj.updateDynamic("secured")(secured.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassModel[T]]
  }
}

