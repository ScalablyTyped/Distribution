package typings.pluralsCldr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gets the CLDR cardinal plural forms for numbers in different locales.
  */
/* Inlined plurals-cldr.plurals-cldr.Plural & {  ordinal :plurals-cldr.plurals-cldr.Plural} */
object mod {
  
  @JSImport("plurals-cldr", JSImport.Namespace)
  @js.native
  def apply(locale: String, number: String): Form | Null = js.native
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    *     trailing zeroes.
    */
  @JSImport("plurals-cldr", JSImport.Namespace)
  @js.native
  def apply(locale: String, number: Double): Form | Null = js.native
  
  @JSImport("plurals-cldr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an array of available forms for the given locale. If the
    * locale is not supported, returns `null`.
    *
    * @param locale The locale code.
    */
  @JSImport("plurals-cldr", "forms")
  @js.native
  def forms(locale: String): js.Array[Form] | Null = js.native
  
  @JSImport("plurals-cldr", "indexOf")
  @js.native
  def indexOf(locale: String, number: String): Double = js.native
  /**
    * Returns the index of the form for a given number. If the locale is
    * not supported, returns `-1`.
    *
    * This is convenient for implementing a lookup from a compact, ordered
    * list. The order of forms for all locales is `zero`, `one`, `two`,
    * `few`, `many`, `other`. Remove the forms not used by a locale to get
    * the indices of each.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    *     trailing zeroes.
    */
  @JSImport("plurals-cldr", "indexOf")
  @js.native
  def indexOf(locale: String, number: Double): Double = js.native
  
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  @JSImport("plurals-cldr", "ordinal")
  @js.native
  def ordinal: Plural = js.native
  @JSImport("plurals-cldr", "ordinal")
  @js.native
  def ordinal(locale: String, number: String): Form | Null = js.native
  /**
    * Returns the form name for a given number. If the locale is not
    * supported, returns `null`.
    *
    * @param locale The locale code.
    * @param number The number to check. May be passed as a string to keep
    *     trailing zeroes.
    */
  /**
    * Gets the CLDR ordinal plural forms for numbers in different locales.
    */
  @JSImport("plurals-cldr", "ordinal")
  @js.native
  def ordinal(locale: String, number: Double): Form | Null = js.native
  @scala.inline
  def ordinal_=(x: Plural): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.pluralsCldr.pluralsCldrStrings.zero
    - typings.pluralsCldr.pluralsCldrStrings.one
    - typings.pluralsCldr.pluralsCldrStrings.two
    - typings.pluralsCldr.pluralsCldrStrings.few
    - typings.pluralsCldr.pluralsCldrStrings.many
    - typings.pluralsCldr.pluralsCldrStrings.other
  */
  trait Form extends StObject
  object Form {
    
    @scala.inline
    def few: typings.pluralsCldr.pluralsCldrStrings.few = "few".asInstanceOf[typings.pluralsCldr.pluralsCldrStrings.few]
    
    @scala.inline
    def many: typings.pluralsCldr.pluralsCldrStrings.many = "many".asInstanceOf[typings.pluralsCldr.pluralsCldrStrings.many]
    
    @scala.inline
    def one: typings.pluralsCldr.pluralsCldrStrings.one = "one".asInstanceOf[typings.pluralsCldr.pluralsCldrStrings.one]
    
    @scala.inline
    def other: typings.pluralsCldr.pluralsCldrStrings.other = "other".asInstanceOf[typings.pluralsCldr.pluralsCldrStrings.other]
    
    @scala.inline
    def two: typings.pluralsCldr.pluralsCldrStrings.two = "two".asInstanceOf[typings.pluralsCldr.pluralsCldrStrings.two]
    
    @scala.inline
    def zero: typings.pluralsCldr.pluralsCldrStrings.zero = "zero".asInstanceOf[typings.pluralsCldr.pluralsCldrStrings.zero]
  }
  
  @js.native
  trait Plural extends StObject {
    
    def apply(locale: String, number: String): Form | Null = js.native
    /**
      * Returns the form name for a given number. If the locale is not
      * supported, returns `null`.
      *
      * @param locale The locale code.
      * @param number The number to check. May be passed as a string to keep
      *     trailing zeroes.
      */
    def apply(locale: String, number: Double): Form | Null = js.native
    
    /**
      * Returns an array of available forms for the given locale. If the
      * locale is not supported, returns `null`.
      *
      * @param locale The locale code.
      */
    def forms(locale: String): js.Array[Form] | Null = js.native
    
    def indexOf(locale: String, number: String): Double = js.native
    /**
      * Returns the index of the form for a given number. If the locale is
      * not supported, returns `-1`.
      *
      * This is convenient for implementing a lookup from a compact, ordered
      * list. The order of forms for all locales is `zero`, `one`, `two`,
      * `few`, `many`, `other`. Remove the forms not used by a locale to get
      * the indices of each.
      *
      * @param locale The locale code.
      * @param number The number to check. May be passed as a string to keep
      *     trailing zeroes.
      */
    def indexOf(locale: String, number: Double): Double = js.native
  }
}
