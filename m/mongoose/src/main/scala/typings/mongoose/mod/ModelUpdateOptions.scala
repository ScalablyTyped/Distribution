package typings.mongoose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mongooseStrings.`throw`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelUpdateOptions
  extends ModelOptions
     with /** other options */
/* other */ StringDictionary[js.Any] {
  /**
    * Only update elements that match the arrayFilters conditions in the document or documents that match the query conditions.
    */
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  /** whether multiple documents should be updated (false) */
  var multi: js.UndefOr[Boolean] = js.native
  /**
    *  by default, mongoose only returns the first error that occurred in casting the query.
    *  Turn on this option to aggregate all the cast errors.
    */
  var multipleCastError: js.UndefOr[Boolean] = js.native
  /** disables update-only mode, allowing you to overwrite the doc (false) */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * If true, runs update validators on this command. Update validators validate
    * the update operation against the model's schema.
    */
  var runValidators: js.UndefOr[Boolean] = js.native
  /** safe mode (defaults to value set in schema (true)) */
  var safe: js.UndefOr[Boolean] = js.native
  /**
    * If this and upsert are true, mongoose will apply the defaults specified in the
    * model's schema if a new document is created. This option only works on MongoDB >= 2.4
    * because it relies on MongoDB's $setOnInsert operator.
    */
  var setDefaultsOnInsert: js.UndefOr[Boolean] = js.native
  /** overrides the strict option for this update */
  var strict: js.UndefOr[Boolean | `throw`] = js.native
  /** whether to create the doc if it doesn't match (false) */
  var upsert: js.UndefOr[Boolean] = js.native
}

object ModelUpdateOptions {
  @scala.inline
  def apply(): ModelUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelUpdateOptions]
  }
  @scala.inline
  implicit class ModelUpdateOptionsOps[Self <: ModelUpdateOptions] (val x: Self) extends AnyVal {
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
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setMultipleCastError(value: Boolean): Self = this.set("multipleCastError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleCastError: Self = this.set("multipleCastError", js.undefined)
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setRunValidators(value: Boolean): Self = this.set("runValidators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunValidators: Self = this.set("runValidators", js.undefined)
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    @scala.inline
    def setSetDefaultsOnInsert(value: Boolean): Self = this.set("setDefaultsOnInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetDefaultsOnInsert: Self = this.set("setDefaultsOnInsert", js.undefined)
    @scala.inline
    def setStrict(value: Boolean | `throw`): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

