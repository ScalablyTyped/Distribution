package typings.moji.mojiMod

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
    toString: () => String,
    trim: () => Moji
  ): Moji = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction2(convert), filter = js.Any.fromFunction1(filter), reject = js.Any.fromFunction1(reject), toString = js.Any.fromFunction0(toString), trim = js.Any.fromFunction0(trim))
  
    __obj.asInstanceOf[Moji]
  }
}

