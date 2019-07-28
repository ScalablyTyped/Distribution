package typings.openui5.sapNs.uiNs.modelNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.type.DateTime")
@js.native
class DateTime protected () extends Date {
  /**
    * Constructor for a DateTime type.
    * @param oFormatOptions options used to create a DateFormat for formatting / parsing to/from external
    * values and          optionally for a second DateFormat to convert between the data source format
    * (Model) and the internally used JavaScript Date.format.          For both DateFormat objects, the
    * same options are supported as for {@link sap.ui.core.format.DateFormat.getDateTimeInstance
    * DateFormat.getDateTimeInstance}.          Note that this differs from the base type.
    * @param oConstraints value constraints. Supports the same kind of constraints as its base type Date,
    * but note the different format options (Date vs. DateTime)
    */
  def this(oFormatOptions: js.Any) = this()
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
}

