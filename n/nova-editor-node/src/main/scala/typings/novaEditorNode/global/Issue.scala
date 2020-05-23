package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/issue/
@JSGlobal("Issue")
@js.native
class Issue ()
  extends typings.novaEditorNode.Issue {
  /* CompleteClass */
  override var code: Double | String = js.native
  /* CompleteClass */
  override var severity: typings.novaEditorNode.IssueSeverity = js.native
  /* CompleteClass */
  override var source: String | Null = js.native
}

