package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/issue-parser/
@JSGlobal("IssueParser")
@js.native
class IssueParser ()
  extends typings.novaEditorNode.IssueParser {
  def this(matcherNames: String) = this()
  def this(matcherNames: js.Array[String]) = this()
}
