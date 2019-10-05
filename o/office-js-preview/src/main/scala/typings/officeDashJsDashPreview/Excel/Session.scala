package typings.officeDashJsDashPreview.Excel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection session for a remote workbook.
  */
@JSGlobal("Excel.Session")
@js.native
class Session () extends js.Object {
  def this(workbookUrl: String) = this()
  def this(workbookUrl: String, requestHeaders: StringDictionary[String]) = this()
  def this(workbookUrl: String, requestHeaders: StringDictionary[String], persisted: Boolean) = this()
  /**
    * Close the session.
    */
  def close(): js.Promise[Unit] = js.native
}

/* static members */
@JSGlobal("Excel.Session")
@js.native
object Session extends js.Object {
  var WorkbookSessionIdHeaderName: js.Any = js.native
  var WorkbookSessionIdHeaderNameLower: js.Any = js.native
}

