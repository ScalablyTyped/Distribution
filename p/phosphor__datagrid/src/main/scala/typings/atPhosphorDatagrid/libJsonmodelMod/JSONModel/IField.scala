package typings.atPhosphorDatagrid.libJsonmodelMod.JSONModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which describes a column of data in the model.
  *
  * #### Notes
  * This is based on the JSON Table Schema specification:
  * https://specs.frictionlessdata.io/table-schema/
  */
trait IField extends js.Object {
  /**
    * The format of the data in the column.
    */
  val format: js.UndefOr[String] = js.undefined
  /**
    * The name of the column.
    *
    * This is used as the key to extract a value from a data record.
    * It is also used as the column header label, unless the `title`
    * property is provided.
    */
  val name: String
  /**
    * The human readable name for the column.
    *
    * This is used as the label for the column header.
    */
  val title: js.UndefOr[String] = js.undefined
  /**
    * The type of data held in the column.
    */
  val `type`: js.UndefOr[String] = js.undefined
}

object IField {
  @scala.inline
  def apply(name: String, format: String = null, title: String = null, `type`: String = null): IField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
}

