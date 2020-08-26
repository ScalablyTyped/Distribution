package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection session for a remote workbook.
  */
@JSGlobal("Excel.Session")
@js.native
class Session ()
  extends typings.officeJsPreview.Excel.Session {
  def this(workbookUrl: String) = this()
  def this(workbookUrl: js.UndefOr[scala.Nothing], requestHeaders: StringDictionary[String]) = this()
  def this(workbookUrl: String, requestHeaders: StringDictionary[String]) = this()
  def this(
    workbookUrl: js.UndefOr[scala.Nothing],
    requestHeaders: js.UndefOr[scala.Nothing],
    persisted: Boolean
  ) = this()
  def this(
    workbookUrl: js.UndefOr[scala.Nothing],
    requestHeaders: StringDictionary[String],
    persisted: Boolean
  ) = this()
  def this(workbookUrl: String, requestHeaders: js.UndefOr[scala.Nothing], persisted: Boolean) = this()
  def this(workbookUrl: String, requestHeaders: StringDictionary[String], persisted: Boolean) = this()
}

/* static members */
@JSGlobal("Excel.Session")
@js.native
object Session extends js.Object {
  var WorkbookSessionIdHeaderName: js.Any = js.native
  var WorkbookSessionIdHeaderNameLower: js.Any = js.native
}

