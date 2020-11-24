package typings.mdxJsUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mdx-js/util", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val EMPTY_NEWLINE: String = js.native
  
  def getCommentContents(text: String): String = js.native
  
  def isComment(text: String): Boolean = js.native
  
  def isExport(text: String): Boolean = js.native
  
  def isExportDefault(text: String): Boolean = js.native
  
  def isImport(text: String): Boolean = js.native
  
  def isImportOrExport(text: String): Boolean = js.native
  
  def paramCase(text: String): String = js.native
  
  def startsWithCapitalLetter(text: String): Boolean = js.native
  
  def toTemplateLiteral(text: String): String = js.native
}
