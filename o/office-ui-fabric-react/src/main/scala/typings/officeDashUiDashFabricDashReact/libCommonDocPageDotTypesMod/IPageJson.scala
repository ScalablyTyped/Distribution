package typings.officeDashUiDashFabricDashReact.libCommonDocPageDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageJson extends js.Object {
  var name: String
  var tables: js.Array[ITableJson]
}

object IPageJson {
  @scala.inline
  def apply(name: String, tables: js.Array[ITableJson]): IPageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPageJson]
  }
}

