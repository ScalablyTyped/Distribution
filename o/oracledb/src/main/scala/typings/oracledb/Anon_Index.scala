package typings.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  /**
    * Name of the index on the last-modified column.
    *
    * The value of this component is the name of a nonunique index on the last-modified time-stamp column.
    * The index is created if a name is specified. This index can improve the performance of read and write
    * operations that are driven by last-modified time stamps.
    *
    * Only SODA for REST provides such an operation (operation GET collection with time-stamp parameters since
    * and until). Other implementations do not use this component, since they do not provide any read or write
    * operations that are driven by last-modified time stamps. Even for SODA for REST, it is typically better
    * not to set this component if you are sure that your application does not use any read or write operations
    * that are driven by time stamps, because creating and maintaining an index carries a cost.
    */
  var index: js.UndefOr[String] = js.undefined
  /**
    * Name of the column that stores the last-modified time stamp of the document.
    *
    * @default LAST_MODIFIED
    */
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(index: String = null, name: String = null): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index]
  }
}

