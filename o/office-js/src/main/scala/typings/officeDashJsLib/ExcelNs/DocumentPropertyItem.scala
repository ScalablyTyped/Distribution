package typings
package officeDashJsLib.ExcelNs

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
  sealed trait appName
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait author
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait category
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait comments
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait company
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait creation
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait format
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait keywords
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait lastAuth
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait lastPrint
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait lastSave
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait manager
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait revision
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait subject
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait template
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  @js.native
  sealed trait title
    extends officeDashJsLib.ExcelNs.DocumentPropertyItem
  
  /* "AppName" */ val appName: appName with java.lang.String = js.native
  /* "Author" */ val author: author with java.lang.String = js.native
  /* "Category" */ val category: category with java.lang.String = js.native
  /* "Comments" */ val comments: comments with java.lang.String = js.native
  /* "Company" */ val company: company with java.lang.String = js.native
  /* "Creation" */ val creation: creation with java.lang.String = js.native
  /* "Format" */ val format: format with java.lang.String = js.native
  /* "Keywords" */ val keywords: keywords with java.lang.String = js.native
  /* "LastAuth" */ val lastAuth: lastAuth with java.lang.String = js.native
  /* "LastPrint" */ val lastPrint: lastPrint with java.lang.String = js.native
  /* "LastSave" */ val lastSave: lastSave with java.lang.String = js.native
  /* "Manager" */ val manager: manager with java.lang.String = js.native
  /* "Revision" */ val revision: revision with java.lang.String = js.native
  /* "Subject" */ val subject: subject with java.lang.String = js.native
  /* "Template" */ val template: template with java.lang.String = js.native
  /* "Title" */ val title: title with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.DocumentPropertyItem with java.lang.String] = js.native
}

