package typings.oracleOraclejet.ojdatagridMod.ojDataGrid

import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.oracleOraclejetStrings.column
import typings.oracleOraclejet.oracleOraclejetStrings.columnEnd
import typings.oracleOraclejet.oracleOraclejetStrings.row
import typings.oracleOraclejet.oracleOraclejetStrings.rowEnd
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait HeaderContext[K, D] extends js.Object {
  var axis: column | columnEnd | row | rowEnd = js.native
  var componentElement: Element = js.native
  var data: D = js.native
  var datasource: (DataProvider[K, D]) | Null = js.native
  var depth: Double = js.native
  var extent: Double = js.native
  var index: Double = js.native
  var key: K = js.native
  var level: Double = js.native
  var parentElement: Element = js.native
}

object HeaderContext {
  @scala.inline
  def apply[K, D](
    axis: column | columnEnd | row | rowEnd,
    componentElement: Element,
    data: D,
    depth: Double,
    extent: Double,
    index: Double,
    key: K,
    level: Double,
    parentElement: Element
  ): HeaderContext[K, D] = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderContext[K, D]]
  }
  @scala.inline
  implicit class HeaderContextOps[Self <: HeaderContext[_, _], K, D] (val x: Self with (HeaderContext[K, D])) extends AnyVal {
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
    def setAxis(value: column | columnEnd | row | rowEnd): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentElement(value: Element): Self = this.set("componentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: Double): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentElement(value: Element): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasource(value: DataProvider[K, D]): Self = this.set("datasource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatasourceNull: Self = this.set("datasource", null)
  }
  
}

