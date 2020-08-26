package typings.oracleOraclejet.ojlistviewMod.ojListView

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemContext[K, D] extends js.Object {
  var data: D = js.native
  var datasource: DataProvider[K, D] = js.native
  var depth: js.UndefOr[Double] = js.native
  var index: Double = js.native
  var key: K = js.native
  var leaf: js.UndefOr[Boolean] = js.native
  var parentElement: Element = js.native
  var parentKey: js.UndefOr[K] = js.native
}

object ItemContext {
  @scala.inline
  def apply[K, D](data: D, datasource: DataProvider[K, D], index: Double, key: K, parentElement: Element): ItemContext[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], datasource = datasource.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext[K, D]]
  }
  @scala.inline
  implicit class ItemContextOps[Self <: ItemContext[_, _], K, D] (val x: Self with (ItemContext[K, D])) extends AnyVal {
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = this.set("datasource", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setLeaf(value: Boolean): Self = this.set("leaf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaf: Self = this.set("leaf", js.undefined)
    @scala.inline
    def setParentKey(value: K): Self = this.set("parentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentKey: Self = this.set("parentKey", js.undefined)
  }
  
}

