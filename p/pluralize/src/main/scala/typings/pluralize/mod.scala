package typings.pluralize

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pluralize", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(word: String): String = js.native
  def apply(word: String, count: Double): String = js.native
  def apply(word: String, count: Double, inclusive: Boolean): String = js.native
  /**
    * Add an irregular word definition.
    *
    * @param single
    * @param plural
    */
  def addIrregularRule(single: String, plural: String): Unit = js.native
  /**
    * Add a pluralization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  def addPluralRule(rule: String, replacemant: String): Unit = js.native
  def addPluralRule(rule: RegExp, replacemant: String): Unit = js.native
  /**
    * Add a singularization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  def addSingularRule(rule: String, replacemant: String): Unit = js.native
  def addSingularRule(rule: RegExp, replacemant: String): Unit = js.native
  /**
    * Add an uncountable word rule.
    *
    * @param word
    */
  def addUncountableRule(word: String): Unit = js.native
  def addUncountableRule(word: RegExp): Unit = js.native
  /**
    * Test if provided word is plural.
    *
    * @param word
    */
  def isPlural(word: String): Boolean = js.native
  /**
    * Test if provided word is singular.
    *
    * @param word
    */
  def isSingular(word: String): Boolean = js.native
  /**
    * Pluralize a word based.
    *
    * @param word
    */
  def plural(word: String): String = js.native
  /**
    * Singularize a word based.
    *
    * @param word
    */
  def singular(word: String): String = js.native
}

