package typings.officeDashJsDashPreview.Excel

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
  
  /* "AppName" */ val appName: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.appName with String = js.native
  /* "Author" */ val author: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.author with String = js.native
  /* "Category" */ val category: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.category with String = js.native
  /* "Comments" */ val comments: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.comments with String = js.native
  /* "Company" */ val company: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.company with String = js.native
  /* "Creation" */ val creation: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.creation with String = js.native
  /* "Format" */ val format: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.format with String = js.native
  /* "Keywords" */ val keywords: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.keywords with String = js.native
  /* "LastAuth" */ val lastAuth: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.lastAuth with String = js.native
  /* "LastPrint" */ val lastPrint: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.lastPrint with String = js.native
  /* "LastSave" */ val lastSave: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.lastSave with String = js.native
  /* "Manager" */ val manager: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.manager with String = js.native
  /* "Revision" */ val revision: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.revision with String = js.native
  /* "Subject" */ val subject: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.subject with String = js.native
  /* "Template" */ val template: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.template with String = js.native
  /* "Title" */ val title: typings.officeDashJsDashPreview.Excel.DocumentPropertyItem.title with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyItem with String] = js.native
}

