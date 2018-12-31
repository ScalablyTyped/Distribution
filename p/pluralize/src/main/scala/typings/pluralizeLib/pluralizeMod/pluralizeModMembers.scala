package typings
package pluralizeLib.pluralizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pluralize", JSImport.Namespace)
@js.native
object pluralizeModMembers extends js.Object {
  def apply(word: java.lang.String): java.lang.String = js.native
  def apply(word: java.lang.String, count: scala.Double): java.lang.String = js.native
  def apply(word: java.lang.String, count: scala.Double, inclusive: scala.Boolean): java.lang.String = js.native
  /**
    * Add an irregular word definition.
    *
    * @param single
    * @param plural
    */
  def addIrregularRule(single: java.lang.String, plural: java.lang.String): scala.Unit = js.native
  /**
    * Add a pluralization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  def addPluralRule(rule: java.lang.String, replacemant: java.lang.String): scala.Unit = js.native
  def addPluralRule(rule: stdLib.RegExp, replacemant: java.lang.String): scala.Unit = js.native
  /**
    * Add a singularization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  def addSingularRule(rule: java.lang.String, replacemant: java.lang.String): scala.Unit = js.native
  def addSingularRule(rule: stdLib.RegExp, replacemant: java.lang.String): scala.Unit = js.native
  /**
    * Add an uncountable word rule.
    *
    * @param word
    */
  def addUncountableRule(word: java.lang.String): scala.Unit = js.native
  def addUncountableRule(word: stdLib.RegExp): scala.Unit = js.native
  /**
    * Test if provided word is plural.
    *
    * @param word
    */
  def isPlural(word: java.lang.String): scala.Boolean = js.native
  /**
    * Test if provided word is singular.
    *
    * @param word
    */
  def isSingular(word: java.lang.String): scala.Boolean = js.native
  /**
    * Pluralize a word based.
    *
    * @param word
    */
  def plural(word: java.lang.String): java.lang.String = js.native
  /**
    * Singularize a word based.
    *
    * @param word
    */
  def singular(word: java.lang.String): java.lang.String = js.native
}

