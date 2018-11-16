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

