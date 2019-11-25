package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguage extends js.Object {
  val ID: Double
  var LanguageCode: String
  var Name: String
}

object ILanguage {
  @scala.inline
  def apply(ID: Double, LanguageCode: String, Name: String): ILanguage = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILanguage]
  }
}

