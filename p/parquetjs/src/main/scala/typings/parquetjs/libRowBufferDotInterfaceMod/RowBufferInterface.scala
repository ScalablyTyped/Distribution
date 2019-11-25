package typings.parquetjs.libRowBufferDotInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.parquetjs.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowBufferInterface extends js.Object {
  var columnData: StringDictionary[Anon_Count]
  var rowCount: Double
}

object RowBufferInterface {
  @scala.inline
  def apply(columnData: StringDictionary[Anon_Count], rowCount: Double): RowBufferInterface = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowBufferInterface]
  }
}

