package typings
package parquetjsLib.libRowBufferDotInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowBufferInterface extends js.Object {
  var columnData: org.scalablytyped.runtime.StringDictionary[parquetjsLib.Anon_Count]
  var rowCount: scala.Double
}

object RowBufferInterface {
  @scala.inline
  def apply(
    columnData: org.scalablytyped.runtime.StringDictionary[parquetjsLib.Anon_Count],
    rowCount: scala.Double
  ): RowBufferInterface = {
    val __obj = js.Dynamic.literal(columnData = columnData, rowCount = rowCount)
  
    __obj.asInstanceOf[RowBufferInterface]
  }
}

