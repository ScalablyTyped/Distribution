package typings
package mojiLib.mojiMod.mojiNs

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
    convert: js.Function2[Mojisyu, Mojisyu, Moji],
    filter: js.Function1[Mojisyu, Moji],
    reject: js.Function1[Mojisyu, Moji],
    toString: js.Function0[java.lang.String],
    trim: js.Function0[Moji]
  ): Moji = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(convert)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[Moji]
  }
}

