package typings.officeDashJs.Excel

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
  
  /* "AppName" */ val appName: typings.officeDashJs.Excel.DocumentPropertyItem.appName with String = js.native
  /* "Author" */ val author: typings.officeDashJs.Excel.DocumentPropertyItem.author with String = js.native
  /* "Category" */ val category: typings.officeDashJs.Excel.DocumentPropertyItem.category with String = js.native
  /* "Comments" */ val comments: typings.officeDashJs.Excel.DocumentPropertyItem.comments with String = js.native
  /* "Company" */ val company: typings.officeDashJs.Excel.DocumentPropertyItem.company with String = js.native
  /* "Creation" */ val creation: typings.officeDashJs.Excel.DocumentPropertyItem.creation with String = js.native
  /* "Format" */ val format: typings.officeDashJs.Excel.DocumentPropertyItem.format with String = js.native
  /* "Keywords" */ val keywords: typings.officeDashJs.Excel.DocumentPropertyItem.keywords with String = js.native
  /* "LastAuth" */ val lastAuth: typings.officeDashJs.Excel.DocumentPropertyItem.lastAuth with String = js.native
  /* "LastPrint" */ val lastPrint: typings.officeDashJs.Excel.DocumentPropertyItem.lastPrint with String = js.native
  /* "LastSave" */ val lastSave: typings.officeDashJs.Excel.DocumentPropertyItem.lastSave with String = js.native
  /* "Manager" */ val manager: typings.officeDashJs.Excel.DocumentPropertyItem.manager with String = js.native
  /* "Revision" */ val revision: typings.officeDashJs.Excel.DocumentPropertyItem.revision with String = js.native
  /* "Subject" */ val subject: typings.officeDashJs.Excel.DocumentPropertyItem.subject with String = js.native
  /* "Template" */ val template: typings.officeDashJs.Excel.DocumentPropertyItem.template with String = js.native
  /* "Title" */ val title: typings.officeDashJs.Excel.DocumentPropertyItem.title with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyItem with String] = js.native
}

