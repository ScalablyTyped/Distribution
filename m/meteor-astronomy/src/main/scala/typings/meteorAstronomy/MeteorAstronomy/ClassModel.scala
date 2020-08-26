package typings.meteorAstronomy.MeteorAstronomy

import typings.meteor.Mongo.Collection
import typings.meteorAstronomy.anon.Insert
import typings.meteorAstronomy.meteorAstronomyStrings._id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassModel[T] extends js.Object {
  var behaviors: js.UndefOr[js.Object] = js.native
  var collection: js.UndefOr[Collection[T]] = js.native
  var events: js.UndefOr[js.Object] = js.native
  var fields: Fields[Omit[T, _id]] = js.native
  var helpers: js.UndefOr[Helpers[T]] = js.native
  var indexes: js.UndefOr[js.Object] = js.native
  var meteorMethods: js.UndefOr[js.Object] = js.native
  var name: String = js.native
  var secured: js.UndefOr[Insert | Boolean] = js.native
}

object ClassModel {
  @scala.inline
  def apply[T](fields: Fields[Omit[T, _id]], name: String): ClassModel[T] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassModel[T]]
  }
  @scala.inline
  implicit class ClassModelOps[Self <: ClassModel[_], T] (val x: Self with ClassModel[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFields(value: Fields[Omit[T, _id]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBehaviors(value: js.Object): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    @scala.inline
    def setCollection(value: Collection[T]): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setEvents(value: js.Object): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setHelpers(value: Helpers[T]): Self = this.set("helpers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelpers: Self = this.set("helpers", js.undefined)
    @scala.inline
    def setIndexes(value: js.Object): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    @scala.inline
    def setMeteorMethods(value: js.Object): Self = this.set("meteorMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeteorMethods: Self = this.set("meteorMethods", js.undefined)
    @scala.inline
    def setSecured(value: Insert | Boolean): Self = this.set("secured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecured: Self = this.set("secured", js.undefined)
  }
  
}

