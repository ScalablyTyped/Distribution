package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguage extends js.Object {
  val ID: scala.Double
  var LanguageCode: java.lang.String
  var Name: java.lang.String
}

object ILanguage {
  @scala.inline
  def apply(ID: scala.Double, LanguageCode: java.lang.String, Name: java.lang.String): ILanguage = {
    val __obj = js.Dynamic.literal(ID = ID, LanguageCode = LanguageCode, Name = Name)
  
    __obj.asInstanceOf[ILanguage]
  }
}

