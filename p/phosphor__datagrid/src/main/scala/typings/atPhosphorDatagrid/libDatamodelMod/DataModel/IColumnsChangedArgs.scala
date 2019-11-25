package typings.atPhosphorDatagrid.libDatamodelMod.DataModel

import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`columns-inserted`
import typings.atPhosphorDatagrid.atPhosphorDatagridStrings.`columns-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when columns are inserted or removed.
  */
trait IColumnsChangedArgs extends ChangedArgs {
  /**
    * The index of the first modified column.
    */
  val index: Double
  /**
    * The region which contains the modified columns.
    */
  val region: ColumnRegion
  /**
    * The number of modified columns.
    */
  val span: Double
  /**
    * The discriminated type of the args object.
    */
  val `type`: `columns-inserted` | `columns-removed`
}

object IColumnsChangedArgs {
  @scala.inline
  def apply(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): IColumnsChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnsChangedArgs]
  }
}

