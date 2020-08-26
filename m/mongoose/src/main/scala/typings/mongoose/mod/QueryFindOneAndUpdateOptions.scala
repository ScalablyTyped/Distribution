package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFindOneAndUpdateOptions extends QueryFindOneAndRemoveOptions {
  /**
    * Only update elements that match the arrayFilters conditions in the document or documents that match the query conditions.
    */
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /**
    * if set to 'query' and runValidators is on, this will refer to the query in custom validator
    * functions that update validation runs. Does nothing if runValidators is false.
    */
  var context: js.UndefOr[String] = js.native
  /** Field selection. Equivalent to .select(fields).findOneAndUpdate() */
  var fields: js.UndefOr[js.Any | String] = js.native
  /**
    * if truthy, mongoose will return the document as a plain JavaScript object rather than a mongoose document. See Query.lean() and the Mongoose lean tutorial.
    */
  var lean: js.UndefOr[js.Any] = js.native
  /**
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[Boolean] = js.native
  /** if true, return the modified document rather than the original. defaults to false (changed in 4.0) */
  var `new`: js.UndefOr[Boolean] = js.native
  /** If true, delete any properties whose value is undefined when casting an update. In other words,
    if this is set, Mongoose will delete baz from the update in Model.updateOne({}, { foo: 'bar', baz: undefined })
    before sending the update to the server.**/
  var omitUndefined: js.UndefOr[Boolean] = js.native
  /** if true, runs update validators on this command. Update validators validate the update operation against the model's schema. */
  var runValidators: js.UndefOr[Boolean] = js.native
  /**
    * if this and upsert are true, mongoose will apply the defaults specified in the model's schema if a new document
    * is created. This option only works on MongoDB >= 2.4 because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.native
  /**
    * If set to false and schema-level timestamps are enabled, skip timestamps for this update. Note that this allows you to overwrite timestamps.
    * Does nothing if schema-level timestamps are not set.
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  /** creates the object if it doesn't exist. defaults to false. */
  var upsert: js.UndefOr[Boolean] = js.native
  /**
    * True by default. Set to false to make findOneAndUpdate() and findOneAndRemove() use native findOneAndUpdate() rather than findAndModify().
    */
  var useFindAndModify: js.UndefOr[Boolean] = js.native
}

object QueryFindOneAndUpdateOptions {
  @scala.inline
  def apply(): QueryFindOneAndUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFindOneAndUpdateOptions]
  }
  @scala.inline
  implicit class QueryFindOneAndUpdateOptionsOps[Self <: QueryFindOneAndUpdateOptions] (val x: Self) extends AnyVal {
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
    def setArrayFiltersVarargs(value: StringDictionary[js.Any]*): Self = this.set("arrayFilters", js.Array(value :_*))
    @scala.inline
    def setArrayFilters(value: js.Array[StringDictionary[_]]): Self = this.set("arrayFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayFilters: Self = this.set("arrayFilters", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFields(value: js.Any | String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setLean(value: js.Any): Self = this.set("lean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLean: Self = this.set("lean", js.undefined)
    @scala.inline
    def setMultipleCastError(value: Boolean): Self = this.set("multipleCastError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleCastError: Self = this.set("multipleCastError", js.undefined)
    @scala.inline
    def setNew(value: Boolean): Self = this.set("new", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
    @scala.inline
    def setOmitUndefined(value: Boolean): Self = this.set("omitUndefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitUndefined: Self = this.set("omitUndefined", js.undefined)
    @scala.inline
    def setRunValidators(value: Boolean): Self = this.set("runValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunValidators: Self = this.set("runValidators", js.undefined)
    @scala.inline
    def setSetDefaultsOnInsert(value: Boolean): Self = this.set("setDefaultsOnInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetDefaultsOnInsert: Self = this.set("setDefaultsOnInsert", js.undefined)
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
    @scala.inline
    def setUseFindAndModify(value: Boolean): Self = this.set("useFindAndModify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFindAndModify: Self = this.set("useFindAndModify", js.undefined)
  }
  
}

