package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a collection of all the Data Connections that are part of the workbook or worksheet.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.DataConnectionCollection")
@js.native
class DataConnectionCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Refreshes all the Data Connections in the collection.
           *
           * [Api set: ExcelApi 1.7]
           */
  def refreshAll(): scala.Unit = js.native
  def toJSON(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
}

