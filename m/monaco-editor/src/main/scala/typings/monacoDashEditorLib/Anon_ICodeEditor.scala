package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ICodeEditor extends js.Object {
  var ICodeEditor: java.lang.String
  var IDiffEditor: java.lang.String
}

object Anon_ICodeEditor {
  @scala.inline
  def apply(ICodeEditor: java.lang.String, IDiffEditor: java.lang.String): Anon_ICodeEditor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ICodeEditor")(ICodeEditor)
    __obj.updateDynamic("IDiffEditor")(IDiffEditor)
    __obj.asInstanceOf[Anon_ICodeEditor]
  }
}

