package typings.nspell.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes instance of NSpell, which is returned by the default factory function.
  */
@js.native
trait NSpell extends js.Object {
  /**
    * Add word to known words.
    * If no model is given, the word will be marked as correct in the future, and will show up in spelling suggestions.
    * If a model is given, word will be handled the same as model.
    * @returns Operated on instance.
    */
  def add(word: String): NSpell = js.native
  def add(word: String, model: String): NSpell = js.native
  /**
    * Check if word is correctly spelled
    * @returns Whether word is correctly spelled.
    */
  def correct(word: String): Boolean = js.native
  /**
    * Add an extra dictionary to the spellchecker.
    * @returns Operated on instance.
    */
  def dictionary(words: String): NSpell = js.native
  def dictionary(words: Buffer): NSpell = js.native
  /**
    * Add a personal dictionary.
    * @returns Operated on instance.
    */
  def personal(words: String): NSpell = js.native
  def personal(words: Buffer): NSpell = js.native
  /**
    * Remove word from the known words.
    * @returns  Operated on instance.
    */
  def remove(word: String): NSpell = js.native
  /**
    * Get spelling information for word.
    * @returns Object, with the properties correct, forbidden and warn
    */
  def spell(word: String): SpellCheck = js.native
  /**
    * Suggest correctly spelled words close to word.
    * @returns List with zero or more suggestions.
    */
  def suggest(word: String): js.Array[String] = js.native
  /**
    * Get extra word characters defined by the loaded affix file.
    * Most affix files don’t set these, but for example the en-US dictionary sets 0123456789.
    * @returns Defined word characters, if any.
    */
  def wordCharacters(): js.UndefOr[String] = js.native
}

