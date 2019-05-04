package typings
package atPhosphorDatagridLib.libJsonmodelMod.JSONModelNs

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
  val format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the column.
    *
    * This is used as the key to extract a value from a data record.
    * It is also used as the column header label, unless the `title`
    * property is provided.
    */
  val name: java.lang.String
  /**
    * The human readable name for the column.
    *
    * This is used as the label for the column header.
    */
  val title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of data held in the column.
    */
  val `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    name: java.lang.String,
    format: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): IField = {
    val __obj = js.Dynamic.literal(name = name)
    if (format != null) __obj.updateDynamic("format")(format)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IField]
  }
}

