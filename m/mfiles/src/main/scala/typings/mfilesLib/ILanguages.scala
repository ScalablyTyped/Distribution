package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguages extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): ILanguage
}

object ILanguages {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, ILanguage]): ILanguages = {
    val __obj = js.Dynamic.literal(Count = Count, Item = Item)
  
    __obj.asInstanceOf[ILanguages]
  }
}

