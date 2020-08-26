package typings.mongoose.mod

import typings.mongoose.anon.Inline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMapReduceOption[T, Key, Val] extends js.Object {
  /** finalize function */
  @JSName("finalize")
  var finalize_FModelMapReduceOption: js.UndefOr[js.Function2[/* key */ Key, /* val */ Val, Val]] = js.native
  /** it is possible to make the execution stay in JS. Provided in MongoDB > 2.0.X default: false */
  var jsMode: js.UndefOr[Boolean] = js.native
  /** keep temporary data default: false */
  var keeptemp: js.UndefOr[Boolean] = js.native
  /** max number of documents */
  var limit: js.UndefOr[Double] = js.native
  var map: js.Function | String = js.native
  /** sets the output target for the map reduce job. default: {inline: 1} */
  var out: js.UndefOr[Inline] = js.native
  /** query filter object. */
  var query: js.UndefOr[js.Any] = js.native
  var readPreference: js.UndefOr[String] = js.native
  /** scope variables exposed to map/reduce/finalize during execution */
  var scope: js.UndefOr[js.Any] = js.native
  /** sort input objects using this key */
  var sort: js.UndefOr[js.Any] = js.native
  /** provide statistics on job execution time. default: false */
  var verbose: js.UndefOr[Boolean] = js.native
  def reduce(key: Key, vals: js.Array[T]): Val = js.native
}

object ModelMapReduceOption {
  @scala.inline
  def apply[T, Key, Val](map: js.Function | String, reduce: (Key, js.Array[T]) => Val): ModelMapReduceOption[T, Key, Val] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce))
    __obj.asInstanceOf[ModelMapReduceOption[T, Key, Val]]
  }
  @scala.inline
  implicit class ModelMapReduceOptionOps[Self <: ModelMapReduceOption[_, _, _], T, Key, Val] (val x: Self with (ModelMapReduceOption[T, Key, Val])) extends AnyVal {
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
    def setMap(value: js.Function | String): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setReduce(value: (Key, js.Array[T]) => Val): Self = this.set("reduce", js.Any.fromFunction2(value))
    @scala.inline
    def setFinalize(value: (/* key */ Key, /* val */ Val) => Val): Self = this.set("finalize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFinalize: Self = this.set("finalize", js.undefined)
    @scala.inline
    def setJsMode(value: Boolean): Self = this.set("jsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsMode: Self = this.set("jsMode", js.undefined)
    @scala.inline
    def setKeeptemp(value: Boolean): Self = this.set("keeptemp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeeptemp: Self = this.set("keeptemp", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOut(value: Inline): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReadPreference(value: String): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSort(value: js.Any): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

