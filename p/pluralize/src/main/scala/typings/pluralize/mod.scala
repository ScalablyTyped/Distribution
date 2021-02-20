package typings.pluralize

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pluralize", JSImport.Namespace)
  @js.native
  def apply(word: String): String = js.native
  @JSImport("pluralize", JSImport.Namespace)
  @js.native
  def apply(word: String, count: js.UndefOr[scala.Nothing], inclusive: Boolean): String = js.native
  @JSImport("pluralize", JSImport.Namespace)
  @js.native
  def apply(word: String, count: Double): String = js.native
  @JSImport("pluralize", JSImport.Namespace)
  @js.native
  def apply(word: String, count: Double, inclusive: Boolean): String = js.native
  
  /**
    * Add an irregular word definition.
    *
    * @param single
    * @param plural
    */
  @JSImport("pluralize", "addIrregularRule")
  @js.native
  def addIrregularRule(single: String, plural: String): Unit = js.native
  
  /**
    * Add a pluralization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  @JSImport("pluralize", "addPluralRule")
  @js.native
  def addPluralRule(rule: String, replacemant: String): Unit = js.native
  @JSImport("pluralize", "addPluralRule")
  @js.native
  def addPluralRule(rule: RegExp, replacemant: String): Unit = js.native
  
  /**
    * Add a singularization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  @JSImport("pluralize", "addSingularRule")
  @js.native
  def addSingularRule(rule: String, replacemant: String): Unit = js.native
  @JSImport("pluralize", "addSingularRule")
  @js.native
  def addSingularRule(rule: RegExp, replacemant: String): Unit = js.native
  
  /**
    * Add an uncountable word rule.
    *
    * @param word
    */
  @JSImport("pluralize", "addUncountableRule")
  @js.native
  def addUncountableRule(word: String): Unit = js.native
  @JSImport("pluralize", "addUncountableRule")
  @js.native
  def addUncountableRule(word: RegExp): Unit = js.native
  
  /**
    * Test if provided word is plural.
    *
    * @param word
    */
  @JSImport("pluralize", "isPlural")
  @js.native
  def isPlural(word: String): Boolean = js.native
  
  /**
    * Test if provided word is singular.
    *
    * @param word
    */
  @JSImport("pluralize", "isSingular")
  @js.native
  def isSingular(word: String): Boolean = js.native
  
  /**
    * Pluralize a word based.
    *
    * @param word
    */
  @JSImport("pluralize", "plural")
  @js.native
  def plural(word: String): String = js.native
  
  /**
    * Singularize a word based.
    *
    * @param word
    */
  @JSImport("pluralize", "singular")
  @js.native
  def singular(word: String): String = js.native
}
