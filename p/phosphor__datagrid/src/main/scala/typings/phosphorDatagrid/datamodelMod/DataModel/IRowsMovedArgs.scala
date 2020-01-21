package typings.phosphorDatagrid.datamodelMod.DataModel

import typings.phosphorDatagrid.phosphorDatagridStrings.`rows-moved`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when rows are moved.
  */
trait IRowsMovedArgs extends ChangedArgs {
  /**
    * The ending index of the first modified row.
    */
  val destination: Double
  /**
    * The starting index of the first modified row.
    */
  val index: Double
  /**
    * The region which contains the modified rows.
    */
  val region: RowRegion
  /**
    * The number of modified rows.
    */
  val span: Double
  /**
    * The discriminated type of the args object.
    */
  val `type`: `rows-moved`
}

object IRowsMovedArgs {
  @scala.inline
  def apply(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): IRowsMovedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRowsMovedArgs]
  }
}

