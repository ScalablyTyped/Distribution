package typings.phosphorDatagrid.jsonmodelMod

import typings.phosphorDatagrid.datamodelMod.DataModel
import typings.phosphorDatagrid.jsonmodelMod.JSONModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/jsonmodel", "JSONModel")
@js.native
class JSONModel_ protected () extends DataModel {
  /**
    * Create a data model with static JSON data.
    *
    * @param options - The options for initializing the data model.
    */
  def this(options: IOptions) = this()
  var _bodyFields: js.Any = js.native
  var _data: js.Any = js.native
  var _headerFields: js.Any = js.native
  var _missingValues: js.Any = js.native
}

