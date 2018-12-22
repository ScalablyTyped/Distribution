package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides connection session for a remote workbook.
     */
@JSGlobal("Excel.Session")
@js.native
class Session () extends js.Object {
  def this(workbookUrl: java.lang.String) = this()
  def this(workbookUrl: java.lang.String, requestHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String]) = this()
  def this(workbookUrl: java.lang.String, requestHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String], persisted: scala.Boolean) = this()
  /**
           * Close the session.
           */
  def close(): js.Promise[scala.Unit] = js.native
}

/**
     * Provides connection session for a remote workbook.
     */
@JSGlobal("Excel.Session")
@js.native
object Session extends js.Object {
  var WorkbookSessionIdHeaderName: js.Any = js.native
  var WorkbookSessionIdHeaderNameLower: js.Any = js.native
}

