package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModelLanguageChangedEvent extends js.Object {
  /**
    * New language
    */
  val newLanguage: String
  /**
    * Previous language
    */
  val oldLanguage: String
}

object IModelLanguageChangedEvent {
  @scala.inline
  def apply(newLanguage: String, oldLanguage: String): IModelLanguageChangedEvent = {
    val __obj = js.Dynamic.literal(newLanguage = newLanguage.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IModelLanguageChangedEvent]
  }
}

