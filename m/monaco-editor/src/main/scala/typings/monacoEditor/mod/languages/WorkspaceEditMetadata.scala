package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Dark
import typings.monacoEditor.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceEditMetadata extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var iconPath: js.UndefOr[Id | Dark] = js.undefined
  var label: String
  var needsConfirmation: Boolean
}

object WorkspaceEditMetadata {
  @scala.inline
  def apply(label: String, needsConfirmation: Boolean, description: String = null, iconPath: Id | Dark = null): WorkspaceEditMetadata = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], needsConfirmation = needsConfirmation.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iconPath != null) __obj.updateDynamic("iconPath")(iconPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceEditMetadata]
  }
}

