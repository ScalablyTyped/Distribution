package typings.pkgjsParseargs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.pkgjsParseargs.anon.IndexKind
import typings.pkgjsParseargs.anon.Kind
import typings.pkgjsParseargs.anon.Name
import typings.pkgjsParseargs.anon.Positionals
import typings.pkgjsParseargs.anon.Tokens
import typings.pkgjsParseargs.anon.Values
import typings.pkgjsParseargs.pkgjsParseargsStrings.boolean
import typings.pkgjsParseargs.pkgjsParseargsStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pkgjs/parseargs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseArgs[T /* <: ParseArgsConfig */](config: T): ParsedResults[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(config.asInstanceOf[js.Any]).asInstanceOf[ParsedResults[T]]
  
  type ExtractOptionValue[T /* <: ParseArgsConfig */, O /* <: ParseArgsOptionConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    String | Boolean, 
    String | Boolean
  ]
  
  // we put the `extends false` condition first here because `undefined` compares like `any` when `strictNullChecks: false`
  type IfDefaultsFalse[T, IfTrue, IfFalse] = IfFalse | IfTrue
  
  /*
  IfDefaultsTrue and IfDefaultsFalse are helpers to handle default values for missing boolean properties.
  TypeScript does not have exact types for objects: https://github.com/microsoft/TypeScript/issues/12936
  This means it is impossible to distinguish between "field X is definitely not present" and "field X may or may not be present".
  But we expect users to generally provide their config inline or `as const`, which means TS will always know whether a given field is present.
  So this helper treats "not definitely present" (i.e., not `extends boolean`) as being "definitely not present", i.e. it should have its default value.
  This is technically incorrect but is a much nicer UX for the common case.
  The IfDefaultsTrue version is for things which default to true; the IfDefaultsFalse version is for things which default to false.
  */
  type IfDefaultsTrue[T, IfTrue, IfFalse] = IfTrue | IfFalse
  
  /* Rewritten from type alias, can be one of: 
    - typings.pkgjsParseargs.anon.RawName
    - typings.pkgjsParseargs.anon.Value
  */
  trait OptionToken
    extends StObject
       with Token
  object OptionToken {
    
    inline def RawName(index: Double, inlineValue: Boolean, name: String, rawName: String, value: String): typings.pkgjsParseargs.anon.RawName = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.RawName]
    }
    
    inline def Value(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): typings.pkgjsParseargs.anon.Value = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.Value]
    }
  }
  
  trait ParseArgsConfig extends StObject {
    
    var allowPositionals: js.UndefOr[Boolean] = js.undefined
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var options: js.UndefOr[ParseArgsOptionsConfig] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ParseArgsConfig {
    
    inline def apply(): ParseArgsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseArgsConfig]
    }
    
    extension [Self <: ParseArgsConfig](x: Self) {
      
      inline def setAllowPositionals(value: Boolean): Self = StObject.set(x, "allowPositionals", value.asInstanceOf[js.Any])
      
      inline def setAllowPositionalsUndefined: Self = StObject.set(x, "allowPositionals", js.undefined)
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setOptions(value: ParseArgsOptionsConfig): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  trait ParseArgsOptionConfig extends StObject {
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var short: js.UndefOr[String] = js.undefined
    
    var `type`: string | boolean
  }
  object ParseArgsOptionConfig {
    
    inline def apply(`type`: string | boolean): ParseArgsOptionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseArgsOptionConfig]
    }
    
    extension [Self <: ParseArgsOptionConfig](x: Self) {
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
      
      inline def setType(value: string | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseArgsOptionsConfig = StringDictionary[ParseArgsOptionConfig]
  
  type ParsedOptionToken[T /* <: ParseArgsConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    TokenForOptions[
      T, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof T['options'] */ js.Any
    ], 
    OptionToken
  ]
  
  type ParsedPositionalToken[T /* <: ParseArgsConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    IfDefaultsFalse[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      Kind, 
      scala.Nothing
    ], 
    IfDefaultsTrue[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      Kind, 
      scala.Nothing
    ]
  ]
  
  type ParsedPositionals[T /* <: ParseArgsConfig */] = IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    IfDefaultsFalse[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      js.Array[String], 
      js.Array[Any]
    ], 
    IfDefaultsTrue[
      /* import warning: importer.ImportType#apply Failed type conversion: T['allowPositionals'] */ js.Any, 
      js.Array[String], 
      js.Array[Any]
    ]
  ]
  
  // If ParseArgsConfig extends T, then the user passed config constructed elsewhere.
  // So we can't rely on the `"not definitely present" implies "definitely not present"` assumption mentioned above.
  type ParsedResults[T /* <: ParseArgsConfig */] = PreciseParsedResults[T] | Tokens
  
  type ParsedTokens[T /* <: ParseArgsConfig */] = js.Array[ParsedOptionToken[T] | ParsedPositionalToken[T] | IndexKind]
  
  type ParsedValues[T /* <: ParseArgsConfig */] = (IfDefaultsTrue[
    /* import warning: importer.ImportType#apply Failed type conversion: T['strict'] */ js.Any, 
    Any, 
    StringDictionary[js.UndefOr[String | Boolean]]
  ]) & (js.Object | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ LongOption in keyof T['options'] ]: @pkgjs/parseargs.@pkgjs/parseargs.IfDefaultsFalse<T['options'][LongOption]['multiple'], undefined | std.Array<@pkgjs/parseargs.@pkgjs/parseargs.ExtractOptionValue<T, T['options'][LongOption]>>, undefined | @pkgjs/parseargs.@pkgjs/parseargs.ExtractOptionValue<T, T['options'][LongOption]>>}
    */ typings.pkgjsParseargs.pkgjsParseargsStrings.ParsedValues & TopLevel[Any]))
  
  type PreciseParsedResults[T /* <: ParseArgsConfig */] = IfDefaultsFalse[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tokens'] */ js.Any, 
    Positionals[T], 
    Values[T]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pkgjsParseargs.mod.OptionToken & typings.pkgjsParseargs.anon.Name[K]
    - typings.pkgjsParseargs.anon.InlineValue[K]
    - typings.pkgjsParseargs.anon.Index[K]
  */
  type PreciseTokenForOptions[K /* <: String */, O /* <: ParseArgsOptionConfig */] = (_PreciseTokenForOptions[K, O]) | (OptionToken & Name[K])
  
  /* Rewritten from type alias, can be one of: 
    - typings.pkgjsParseargs.mod.OptionToken
    - typings.pkgjsParseargs.anon.Kind
    - typings.pkgjsParseargs.anon.IndexKind
  */
  trait Token extends StObject
  object Token {
    
    inline def IndexKind(index: Double): typings.pkgjsParseargs.anon.IndexKind = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "option-terminator")
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.IndexKind]
    }
    
    inline def Kind(index: Double, value: String): typings.pkgjsParseargs.anon.Kind = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "positional", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.Kind]
    }
    
    inline def RawName(index: Double, inlineValue: Boolean, name: String, rawName: String, value: String): typings.pkgjsParseargs.anon.RawName = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.RawName]
    }
    
    inline def Value(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): typings.pkgjsParseargs.anon.Value = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.Value]
    }
  }
  
  type TokenForOptions[T /* <: ParseArgsConfig */, K /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['options'] */ js.Any */] = OptionToken | (PreciseTokenForOptions[
    K & String, 
    /* import warning: importer.ImportType#apply Failed type conversion: T['options'][K] */ js.Any
  ])
  
  trait _PreciseTokenForOptions[K /* <: String */, O /* <: ParseArgsOptionConfig */] extends StObject
  object _PreciseTokenForOptions {
    
    inline def Index[K /* <: String */](index: Double, inlineValue: Boolean, name: K, rawName: String, value: String): typings.pkgjsParseargs.anon.Index[K] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.Index[K]]
    }
    
    inline def InlineValue[K /* <: String */](index: Double, inlineValue: Unit, name: K, rawName: String, value: Unit): typings.pkgjsParseargs.anon.InlineValue[K] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pkgjsParseargs.anon.InlineValue[K]]
    }
  }
}
