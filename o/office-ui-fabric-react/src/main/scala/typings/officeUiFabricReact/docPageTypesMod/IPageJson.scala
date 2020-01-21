package typings.officeUiFabricReact.docPageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageJson extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var name: String
  var tables: js.Array[ITableJson]
}

object IPageJson {
  @scala.inline
  def apply(name: String, tables: js.Array[ITableJson], group: String = null): IPageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageJson]
  }
}

