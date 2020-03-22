package typings.meteorAstronomy.MeteorAstronomy

import typings.meteor.Mongo.Collection
import typings.meteorAstronomy.AnonInsert
import typings.meteorAstronomy.meteorAstronomyStrings._id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassModel[T] extends js.Object {
  var behaviors: js.UndefOr[js.Object] = js.undefined
  var collection: js.UndefOr[Collection[T]] = js.undefined
  var events: js.UndefOr[js.Object] = js.undefined
  var fields: Fields[Omit[T, _id]]
  var helpers: js.UndefOr[Helpers[T]] = js.undefined
  var indexes: js.UndefOr[js.Object] = js.undefined
  var meteorMethods: js.UndefOr[js.Object] = js.undefined
  var name: String
  var secured: js.UndefOr[AnonInsert | Boolean] = js.undefined
}

object ClassModel {
  @scala.inline
  def apply[T](
    fields: Fields[Omit[T, _id]],
    name: String,
    behaviors: js.Object = null,
    collection: Collection[T] = null,
    events: js.Object = null,
    helpers: Helpers[T] = null,
    indexes: js.Object = null,
    meteorMethods: js.Object = null,
    secured: AnonInsert | Boolean = null
  ): ClassModel[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (helpers != null) __obj.updateDynamic("helpers")(helpers.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (meteorMethods != null) __obj.updateDynamic("meteorMethods")(meteorMethods.asInstanceOf[js.Any])
    if (secured != null) __obj.updateDynamic("secured")(secured.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassModel[T]]
  }
}

