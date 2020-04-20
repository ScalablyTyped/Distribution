package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguages extends js.Object {
  val Count: Double
  def Item(Index: Double): ILanguage
}

object ILanguages {
  @scala.inline
  def apply(Count: Double, Item: Double => ILanguage): ILanguages = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[ILanguages]
  }
}

