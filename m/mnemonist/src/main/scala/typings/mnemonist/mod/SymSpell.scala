package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.symspellMod.SymSpellOptions
import typings.mnemonist.symspellMod.default
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist", "SymSpell")
@js.native
// Constructor
class SymSpell () extends default {
  def this(options: SymSpellOptions) = this()
}

/* static members */
@JSImport("mnemonist", "SymSpell")
@js.native
object SymSpell extends js.Object {
  def from(strings: StringDictionary[String]): typings.mnemonist.symspellMod.SymSpell = js.native
  def from(strings: StringDictionary[String], options: SymSpellOptions): typings.mnemonist.symspellMod.SymSpell = js.native
  // Statics
  def from(strings: Iterable[String]): typings.mnemonist.symspellMod.SymSpell = js.native
  def from(strings: Iterable[String], options: SymSpellOptions): typings.mnemonist.symspellMod.SymSpell = js.native
}

