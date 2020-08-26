package typings.parse.mod.global.Parse.Query

import org.scalablytyped.runtime.StringDictionary
import typings.parse.anon.Dictkey
import typings.parse.anon.SizeNumber
import typings.parse.parseNumbers.`-1`
import typings.parse.parseNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// According to http://docs.parseplatform.org/rest/guide/#aggregate-queries
@js.native
trait AggregationOptions extends js.Object {
  var group: js.UndefOr[Dictkey] = js.native
  var limit: js.UndefOr[Double] = js.native
  var `match`: js.UndefOr[StringDictionary[js.Any]] = js.native
  var project: js.UndefOr[StringDictionary[js.Any]] = js.native
  // Sample documentation: https://docs.mongodb.com/v3.2/reference/operator/aggregation/sample/
  var sample: js.UndefOr[SizeNumber] = js.native
  var skip: js.UndefOr[Double] = js.native
  // Sort documentation https://docs.mongodb.com/v3.2/reference/operator/aggregation/sort/#pipe._S_sort
  var sort: js.UndefOr[StringDictionary[`1` | `-1`]] = js.native
}

object AggregationOptions {
  @scala.inline
  def apply(): AggregationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationOptions]
  }
  @scala.inline
  implicit class AggregationOptionsOps[Self <: AggregationOptions] (val x: Self) extends AnyVal {
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
    def setGroup(value: Dictkey): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMatch(value: StringDictionary[js.Any]): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setProject(value: StringDictionary[js.Any]): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    @scala.inline
    def setSample(value: SizeNumber): Self = this.set("sample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample: Self = this.set("sample", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSort(value: StringDictionary[`1` | `-1`]): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

