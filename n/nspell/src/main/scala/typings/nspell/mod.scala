package typings.nspell

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(aff: String): NSpell = ^.asInstanceOf[js.Dynamic].apply(aff.asInstanceOf[js.Any]).asInstanceOf[NSpell]
  @scala.inline
  def apply(aff: String, dic: String): NSpell = (^.asInstanceOf[js.Dynamic].apply(aff.asInstanceOf[js.Any], dic.asInstanceOf[js.Any])).asInstanceOf[NSpell]
  @scala.inline
  def apply(aff: String, dic: Buffer): NSpell = (^.asInstanceOf[js.Dynamic].apply(aff.asInstanceOf[js.Any], dic.asInstanceOf[js.Any])).asInstanceOf[NSpell]
  @scala.inline
  def apply(aff: Buffer): NSpell = ^.asInstanceOf[js.Dynamic].apply(aff.asInstanceOf[js.Any]).asInstanceOf[NSpell]
  @scala.inline
  def apply(aff: Buffer, dic: String): NSpell = (^.asInstanceOf[js.Dynamic].apply(aff.asInstanceOf[js.Any], dic.asInstanceOf[js.Any])).asInstanceOf[NSpell]
  @scala.inline
  def apply(aff: Buffer, dic: Buffer): NSpell = (^.asInstanceOf[js.Dynamic].apply(aff.asInstanceOf[js.Any], dic.asInstanceOf[js.Any])).asInstanceOf[NSpell]
  @scala.inline
  def apply(dictionary: js.Array[Dictionary]): NSpell = ^.asInstanceOf[js.Dynamic].apply(dictionary.asInstanceOf[js.Any]).asInstanceOf[NSpell]
  @scala.inline
  def apply(dictionary: Dictionary): NSpell = ^.asInstanceOf[js.Dynamic].apply(dictionary.asInstanceOf[js.Any]).asInstanceOf[NSpell]
  
  /**
    * Describes instance of NSpell, which is returned by the default factory function.
    */
  @JSImport("nspell", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with NSpell {
    def this(aff: String) = this()
    def this(aff: Buffer) = this()
    def this(dictionary: js.Array[Dictionary]) = this()
    def this(dictionary: Dictionary) = this()
    def this(aff: String, dic: String) = this()
    def this(aff: String, dic: Buffer) = this()
    def this(aff: Buffer, dic: String) = this()
    def this(aff: Buffer, dic: Buffer) = this()
  }
  @JSImport("nspell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Dictionary extends StObject {
    
    var aff: Buffer | String
    
    var dic: js.UndefOr[Buffer | String] = js.undefined
  }
  object Dictionary {
    
    @scala.inline
    def apply(aff: Buffer | String): Dictionary = {
      val __obj = js.Dynamic.literal(aff = aff.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictionary]
    }
    
    @scala.inline
    implicit class DictionaryMutableBuilder[Self <: Dictionary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAff(value: Buffer | String): Self = StObject.set(x, "aff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDic(value: Buffer | String): Self = StObject.set(x, "dic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDicUndefined: Self = StObject.set(x, "dic", js.undefined)
    }
  }
  
  /**
    * Describes instance of NSpell, which is returned by the default factory function.
    */
  @js.native
  trait NSpell extends StObject {
    
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
  
  /**
    * Returned by NSpell.spell with the following properties:
    * @param correct - Whether word is correctly spelled
    * @param - forbidden - Whether word is actually correct, but forbidden from showing up as such (often by the users wish)
    * @param warn - Whether word is correct, but should trigger a warning (rarely used in dictionaries)
    */
  trait SpellCheck extends StObject {
    
    var correct: Boolean
    
    var forbidden: Boolean
    
    var warn: Boolean
  }
  object SpellCheck {
    
    @scala.inline
    def apply(correct: Boolean, forbidden: Boolean, warn: Boolean): SpellCheck = {
      val __obj = js.Dynamic.literal(correct = correct.asInstanceOf[js.Any], forbidden = forbidden.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpellCheck]
    }
    
    @scala.inline
    implicit class SpellCheckMutableBuilder[Self <: SpellCheck] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorrect(value: Boolean): Self = StObject.set(x, "correct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForbidden(value: Boolean): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
