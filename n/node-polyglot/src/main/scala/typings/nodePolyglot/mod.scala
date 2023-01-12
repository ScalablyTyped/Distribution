package typings.nodePolyglot

import org.scalablytyped.runtime.StringDictionary
import typings.nodePolyglot.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-polyglot", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Polyglot {
    def this(options: PolyglotOptions) = this()
  }
  @JSImport("node-polyglot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformPhrase(phrase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformPhrase")(phrase.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def transformPhrase(phrase: String, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPhrase")(phrase.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformPhrase(phrase: String, options: Double, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPhrase")(phrase.asInstanceOf[js.Any], options.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformPhrase(phrase: String, options: Unit, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPhrase")(phrase.asInstanceOf[js.Any], options.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformPhrase(phrase: String, options: InterpolationOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPhrase")(phrase.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def transformPhrase(phrase: String, options: InterpolationOptions, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPhrase")(phrase.asInstanceOf[js.Any], options.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait InterpolationOptions
    extends StObject
       with /* interpolationKey */ StringDictionary[Any] {
    
    @JSName("_")
    var _underscore: js.UndefOr[String] = js.undefined
    
    var smart_count: js.UndefOr[Double | Length] = js.undefined
  }
  object InterpolationOptions {
    
    inline def apply(): InterpolationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
      
      inline def setSmart_count(value: Double | Length): Self = StObject.set(x, "smart_count", value.asInstanceOf[js.Any])
      
      inline def setSmart_countUndefined: Self = StObject.set(x, "smart_count", js.undefined)
      
      inline def set_underscore(value: String): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
    }
  }
  
  trait InterpolationTokenOptions extends StObject {
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object InterpolationTokenOptions {
    
    inline def apply(): InterpolationTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterpolationTokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterpolationTokenOptions] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait PluralRules extends StObject {
    
    var pluralTypeToLanguages: StringDictionary[js.Array[String]]
    
    var pluralTypes: StringDictionary[js.Function1[/* n */ Double, Double]]
  }
  object PluralRules {
    
    inline def apply(
      pluralTypeToLanguages: StringDictionary[js.Array[String]],
      pluralTypes: StringDictionary[js.Function1[/* n */ Double, Double]]
    ): PluralRules = {
      val __obj = js.Dynamic.literal(pluralTypeToLanguages = pluralTypeToLanguages.asInstanceOf[js.Any], pluralTypes = pluralTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralRules]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluralRules] (val x: Self) extends AnyVal {
      
      inline def setPluralTypeToLanguages(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "pluralTypeToLanguages", value.asInstanceOf[js.Any])
      
      inline def setPluralTypes(value: StringDictionary[js.Function1[/* n */ Double, Double]]): Self = StObject.set(x, "pluralTypes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Polyglot extends StObject {
    
    def clear(): Unit = js.native
    
    def extend(phrases: Any): Unit = js.native
    def extend(phrases: Any, prefix: String): Unit = js.native
    
    def has(phrase: String): Boolean = js.native
    
    def locale(): String = js.native
    def locale(locale: String): String = js.native
    
    def replace(phrases: Any): Unit = js.native
    
    def t(phrase: String): String = js.native
    def t(phrase: String, options: Double): String = js.native
    def t(phrase: String, options: InterpolationOptions): String = js.native
    
    def unset(phrases: Any): Unit = js.native
    def unset(phrases: Any, prefix: String): Unit = js.native
  }
  
  trait PolyglotOptions extends StObject {
    
    var allowMissing: js.UndefOr[Boolean] = js.undefined
    
    var interpolation: js.UndefOr[InterpolationTokenOptions] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var onMissingKey: js.UndefOr[
        js.Function3[/* key */ String, /* options */ InterpolationOptions, /* locale */ String, String]
      ] = js.undefined
    
    var phrases: js.UndefOr[Any] = js.undefined
    
    var pluralRules: js.UndefOr[PluralRules] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  }
  object PolyglotOptions {
    
    inline def apply(): PolyglotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolyglotOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolyglotOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowMissing(value: Boolean): Self = StObject.set(x, "allowMissing", value.asInstanceOf[js.Any])
      
      inline def setAllowMissingUndefined: Self = StObject.set(x, "allowMissing", js.undefined)
      
      inline def setInterpolation(value: InterpolationTokenOptions): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnMissingKey(value: (/* key */ String, /* options */ InterpolationOptions, /* locale */ String) => String): Self = StObject.set(x, "onMissingKey", js.Any.fromFunction3(value))
      
      inline def setOnMissingKeyUndefined: Self = StObject.set(x, "onMissingKey", js.undefined)
      
      inline def setPhrases(value: Any): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
      
      inline def setPhrasesUndefined: Self = StObject.set(x, "phrases", js.undefined)
      
      inline def setPluralRules(value: PluralRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
      
      inline def setPluralRulesUndefined: Self = StObject.set(x, "pluralRules", js.undefined)
      
      inline def setWarn(value: /* message */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
