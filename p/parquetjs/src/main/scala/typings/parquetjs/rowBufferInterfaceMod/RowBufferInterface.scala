package typings.parquetjs.rowBufferInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.parquetjs.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowBufferInterface extends js.Object {
  var columnData: StringDictionary[Count]
  var rowCount: Double
}

object RowBufferInterface {
  @scala.inline
  def apply(columnData: StringDictionary[Count], rowCount: Double): RowBufferInterface = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowBufferInterface]
  }
}

