package typings.nodePolyglot

import org.scalablytyped.runtime.StringDictionary
import typings.nodePolyglot.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-polyglot", JSImport.Namespace)
  @js.native
  class ^ () extends Polyglot {
    def this(options: PolyglotOptions) = this()
  }
  
  @JSImport("node-polyglot", "transformPhrase")
  @js.native
  def transformPhrase(phrase: String): String = js.native
  @JSImport("node-polyglot", "transformPhrase")
  @js.native
  def transformPhrase(phrase: String, options: js.UndefOr[scala.Nothing], locale: String): String = js.native
  @JSImport("node-polyglot", "transformPhrase")
  @js.native
  def transformPhrase(phrase: String, options: Double): String = js.native
  @JSImport("node-polyglot", "transformPhrase")
  @js.native
  def transformPhrase(phrase: String, options: Double, locale: String): String = js.native
  @JSImport("node-polyglot", "transformPhrase")
  @js.native
  def transformPhrase(phrase: String, options: InterpolationOptions): String = js.native
  @JSImport("node-polyglot", "transformPhrase")
  @js.native
  def transformPhrase(phrase: String, options: InterpolationOptions, locale: String): String = js.native
  
  @js.native
  trait InterpolationOptions
    extends /* interpolationKey */ StringDictionary[js.Any] {
    
    @JSName("_")
    var _underscore: js.UndefOr[String] = js.native
    
    var smart_count: js.UndefOr[Double | Length] = js.native
  }
  object InterpolationOptions {
    
    @scala.inline
    def apply(): InterpolationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolationOptions]
    }
    
    @scala.inline
    implicit class InterpolationOptionsMutableBuilder[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmart_count(value: Double | Length): Self = StObject.set(x, "smart_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmart_countUndefined: Self = StObject.set(x, "smart_count", js.undefined)
      
      @scala.inline
      def set_underscore(value: String): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
    }
  }
  
  @js.native
  trait InterpolationTokenOptions extends StObject {
    
    var prefix: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object InterpolationTokenOptions {
    
    @scala.inline
    def apply(): InterpolationTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolationTokenOptions]
    }
    
    @scala.inline
    implicit class InterpolationTokenOptionsMutableBuilder[Self <: InterpolationTokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait PluralRules extends StObject {
    
    var pluralTypeToLanguages: StringDictionary[js.Array[String]] = js.native
    
    var pluralTypes: StringDictionary[js.Function1[/* n */ Double, Double]] = js.native
  }
  object PluralRules {
    
    @scala.inline
    def apply(
      pluralTypeToLanguages: StringDictionary[js.Array[String]],
      pluralTypes: StringDictionary[js.Function1[/* n */ Double, Double]]
    ): PluralRules = {
      val __obj = js.Dynamic.literal(pluralTypeToLanguages = pluralTypeToLanguages.asInstanceOf[js.Any], pluralTypes = pluralTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralRules]
    }
    
    @scala.inline
    implicit class PluralRulesMutableBuilder[Self <: PluralRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPluralTypeToLanguages(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "pluralTypeToLanguages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralTypes(value: StringDictionary[js.Function1[/* n */ Double, Double]]): Self = StObject.set(x, "pluralTypes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Polyglot extends StObject {
    
    def clear(): Unit = js.native
    
    def extend(phrases: js.Any): Unit = js.native
    def extend(phrases: js.Any, prefix: String): Unit = js.native
    
    def has(phrase: String): Boolean = js.native
    
    def locale(): String = js.native
    def locale(locale: String): String = js.native
    
    def replace(phrases: js.Any): Unit = js.native
    
    def t(phrase: String): String = js.native
    def t(phrase: String, options: Double): String = js.native
    def t(phrase: String, options: InterpolationOptions): String = js.native
    
    def unset(phrases: js.Any): Unit = js.native
    def unset(phrases: js.Any, prefix: String): Unit = js.native
  }
  
  @js.native
  trait PolyglotOptions extends StObject {
    
    var allowMissing: js.UndefOr[Boolean] = js.native
    
    var interpolation: js.UndefOr[InterpolationTokenOptions] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var onMissingKey: js.UndefOr[
        js.Function3[/* key */ String, /* options */ InterpolationOptions, /* locale */ String, String]
      ] = js.native
    
    var phrases: js.UndefOr[js.Any] = js.native
    
    var pluralRules: js.UndefOr[PluralRules] = js.native
    
    var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  }
  object PolyglotOptions {
    
    @scala.inline
    def apply(): PolyglotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolyglotOptions]
    }
    
    @scala.inline
    implicit class PolyglotOptionsMutableBuilder[Self <: PolyglotOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
      
      @scala.inline
      def setInterpolation(value: InterpolationTokenOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnMissingKey(value: (/* key */ String, /* options */ InterpolationOptions, /* locale */ String) => String): Self = StObject.set(x, "onMissingKey", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMissingKeyUndefined: Self = StObject.set(x, "onMissingKey", js.undefined)
      
      @scala.inline
      def setPhrases(value: js.Any): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
      
      @scala.inline
      def setPluralRules(value: PluralRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralRulesUndefined: Self = StObject.set(x, "pluralRules", js.undefined)
      
      @scala.inline
      def setWarn(value: /* message */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
