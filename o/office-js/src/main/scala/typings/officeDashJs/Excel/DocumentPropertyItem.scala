package typings.officeDashJs.Excel

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Excel.DocumentPropertyItem.appName
import typings.officeDashJs.Excel.DocumentPropertyItem.author
import typings.officeDashJs.Excel.DocumentPropertyItem.category
import typings.officeDashJs.Excel.DocumentPropertyItem.comments
import typings.officeDashJs.Excel.DocumentPropertyItem.company
import typings.officeDashJs.Excel.DocumentPropertyItem.creation
import typings.officeDashJs.Excel.DocumentPropertyItem.format
import typings.officeDashJs.Excel.DocumentPropertyItem.keywords
import typings.officeDashJs.Excel.DocumentPropertyItem.lastAuth
import typings.officeDashJs.Excel.DocumentPropertyItem.lastPrint
import typings.officeDashJs.Excel.DocumentPropertyItem.lastSave
import typings.officeDashJs.Excel.DocumentPropertyItem.manager
import typings.officeDashJs.Excel.DocumentPropertyItem.revision
import typings.officeDashJs.Excel.DocumentPropertyItem.subject
import typings.officeDashJs.Excel.DocumentPropertyItem.template
import typings.officeDashJs.Excel.DocumentPropertyItem.title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentPropertyItem extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DocumentPropertyItem")
@js.native
object DocumentPropertyItem extends js.Object {
  @js.native
  sealed trait appName extends DocumentPropertyItem
  
  @js.native
  sealed trait author extends DocumentPropertyItem
  
  @js.native
  sealed trait category extends DocumentPropertyItem
  
  @js.native
  sealed trait comments extends DocumentPropertyItem
  
  @js.native
  sealed trait company extends DocumentPropertyItem
  
  @js.native
  sealed trait creation extends DocumentPropertyItem
  
  @js.native
  sealed trait format extends DocumentPropertyItem
  
  @js.native
  sealed trait keywords extends DocumentPropertyItem
  
  @js.native
  sealed trait lastAuth extends DocumentPropertyItem
  
  @js.native
  sealed trait lastPrint extends DocumentPropertyItem
  
  @js.native
  sealed trait lastSave extends DocumentPropertyItem
  
  @js.native
  sealed trait manager extends DocumentPropertyItem
  
  @js.native
  sealed trait revision extends DocumentPropertyItem
  
  @js.native
  sealed trait subject extends DocumentPropertyItem
  
  @js.native
  sealed trait template extends DocumentPropertyItem
  
  @js.native
  sealed trait title extends DocumentPropertyItem
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyItem with String] = js.native
  /* "AppName" */ @js.native
  object appName extends TopLevel[appName with String]
  
  /* "Author" */ @js.native
  object author extends TopLevel[author with String]
  
  /* "Category" */ @js.native
  object category extends TopLevel[category with String]
  
  /* "Comments" */ @js.native
  object comments extends TopLevel[comments with String]
  
  /* "Company" */ @js.native
  object company extends TopLevel[company with String]
  
  /* "Creation" */ @js.native
  object creation extends TopLevel[creation with String]
  
  /* "Format" */ @js.native
  object format extends TopLevel[format with String]
  
  /* "Keywords" */ @js.native
  object keywords extends TopLevel[keywords with String]
  
  /* "LastAuth" */ @js.native
  object lastAuth extends TopLevel[lastAuth with String]
  
  /* "LastPrint" */ @js.native
  object lastPrint extends TopLevel[lastPrint with String]
  
  /* "LastSave" */ @js.native
  object lastSave extends TopLevel[lastSave with String]
  
  /* "Manager" */ @js.native
  object manager extends TopLevel[manager with String]
  
  /* "Revision" */ @js.native
  object revision extends TopLevel[revision with String]
  
  /* "Subject" */ @js.native
  object subject extends TopLevel[subject with String]
  
  /* "Template" */ @js.native
  object template extends TopLevel[template with String]
  
  /* "Title" */ @js.native
  object title extends TopLevel[title with String]
  
}

