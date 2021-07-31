package typings.mdxJsUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mdx-js/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mdx-js/util", "EMPTY_NEWLINE")
  @js.native
  val EMPTY_NEWLINE: String = js.native
  
  @scala.inline
  def getCommentContents(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommentContents")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isComment(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComment")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExport(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExport")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isExportDefault(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDefault")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isImport(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImport")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isImportOrExport(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExport")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def paramCase(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paramCase")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def startsWithCapitalLetter(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWithCapitalLetter")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def toTemplateLiteral(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTemplateLiteral")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
