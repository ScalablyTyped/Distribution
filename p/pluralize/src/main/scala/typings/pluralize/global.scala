package typings.pluralize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pluralize {
    
    inline def apply(word: String): String = ^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(word: String, count: Double, inclusive: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(word: String, count: Unit, inclusive: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("pluralize")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add an irregular word definition.
      *
      * @param single
      * @param plural
      */
    inline def addIrregularRule(single: String, plural: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addIrregularRule")(single.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a pluralization rule to the collection.
      *
      * @param rule
      * @param replacement
      */
    inline def addPluralRule(rule: String, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPluralRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addPluralRule(rule: js.RegExp, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPluralRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add a singularization rule to the collection.
      *
      * @param rule
      * @param replacement
      */
    inline def addSingularRule(rule: String, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingularRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addSingularRule(rule: js.RegExp, replacemant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingularRule")(rule.asInstanceOf[js.Any], replacemant.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Add an uncountable word rule.
      *
      * @param word
      */
    inline def addUncountableRule(word: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUncountableRule")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addUncountableRule(word: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addUncountableRule")(word.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Test if provided word is plural.
      *
      * @param word
      */
    inline def isPlural(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlural")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Test if provided word is singular.
      *
      * @param word
      */
    inline def isSingular(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingular")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Pluralize a word based.
      *
      * @param word
      */
    inline def plural(word: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plural")(word.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Singularize a word based.
      *
      * @param word
      */
    inline def singular(word: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("singular")(word.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
