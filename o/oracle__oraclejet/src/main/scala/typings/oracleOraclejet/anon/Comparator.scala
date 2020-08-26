package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comparator
  extends /* key */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[
    Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
  ] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.native
  var model: js.UndefOr[Model] = js.native
  var modelLimit: js.UndefOr[Double] = js.native
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var url: js.UndefOr[String] = js.native
}

object Comparator {
  @scala.inline
  def apply(): Comparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comparator]
  }
  @scala.inline
  implicit class ComparatorOps[Self <: Comparator] (val x: Self) extends AnyVal {
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
    def setComparatorFunction2(value: (/* model1 */ Model, /* model2 */ js.UndefOr[Model]) => Double): Self = this.set("comparator", js.Any.fromFunction2(value))
    @scala.inline
    def setComparator(value: String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setComparatorNull: Self = this.set("comparator", null)
    @scala.inline
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchSize: Self = this.set("fetchSize", js.undefined)
    @scala.inline
    def setInitialize(value: (/* models */ js.Array[Model], /* options */ js.Object) => Unit): Self = this.set("initialize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setModelLimit(value: Double): Self = this.set("modelLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelLimit: Self = this.set("modelLimit", js.undefined)
    @scala.inline
    def setParse(value: /* data */ js.Any => _): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

