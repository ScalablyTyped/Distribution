package typings.moji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moji extends js.Object {
  def convert(beforeType: Mojisyu, afterType: Mojisyu): Moji
  def filter(`type`: Mojisyu): Moji
  def reject(`type`: Mojisyu): Moji
  def trim(): Moji
}

object Moji {
  @scala.inline
  def apply(
    convert: (Mojisyu, Mojisyu) => Moji,
    filter: Mojisyu => Moji,
    reject: Mojisyu => Moji,
    trim: () => Moji
  ): Moji = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), filter = js.Any.fromFunction1(filter), reject = js.Any.fromFunction1(reject), trim = js.Any.fromFunction0(trim))
    __obj.asInstanceOf[Moji]
  }
}

