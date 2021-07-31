package typings.pluralize

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(word: String): String = ^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(word: String, count: Double, inclusive: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(word: String, count: Unit, inclusive: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pluralize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add an irregular word definition.
    *
    * @param single
    * @param plural
    */
  @scala.inline
  def addIrregularRule(single: String, plural: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIrregularRule")(single.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Add a pluralization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  @scala.inline
  def addPluralRule(rule: String, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPluralRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addPluralRule(rule: RegExp, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPluralRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Add a singularization rule to the collection.
    *
    * @param rule
    * @param replacement
    */
  @scala.inline
  def addSingularRule(rule: String, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingularRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addSingularRule(rule: RegExp, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingularRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Add an uncountable word rule.
    *
    * @param word
    */
  @scala.inline
  def addUncountableRule(word: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUncountableRule")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def addUncountableRule(word: RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUncountableRule")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Test if provided word is plural.
    *
    * @param word
    */
  @scala.inline
  def isPlural(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlural")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Test if provided word is singular.
    *
    * @param word
    */
  @scala.inline
  def isSingular(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingular")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Pluralize a word based.
    *
    * @param word
    */
  @scala.inline
  def plural(word: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")(word.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Singularize a word based.
    *
    * @param word
    */
  @scala.inline
  def singular(word: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("singular")(word.asInstanceOf[js.Any]).asInstanceOf[String]
}
