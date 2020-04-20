package typings.monacoEditor

import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModel extends js.Object {
  val model: ITextModel
  val oldLanguage: String
}

object AnonModel {
  @scala.inline
  def apply(model: ITextModel, oldLanguage: String): AnonModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModel]
  }
}

