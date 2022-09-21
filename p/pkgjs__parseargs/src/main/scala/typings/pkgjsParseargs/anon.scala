package typings.pkgjsParseargs

import org.scalablytyped.runtime.StringDictionary
import typings.pkgjsParseargs.mod.OptionToken
import typings.pkgjsParseargs.mod.ParseArgsConfig
import typings.pkgjsParseargs.mod.ParsedOptionToken
import typings.pkgjsParseargs.mod.ParsedPositionalToken
import typings.pkgjsParseargs.mod.ParsedPositionals
import typings.pkgjsParseargs.mod.ParsedTokens
import typings.pkgjsParseargs.mod.ParsedValues
import typings.pkgjsParseargs.mod.Token
import typings.pkgjsParseargs.mod._PreciseTokenForOptions
import typings.pkgjsParseargs.pkgjsParseargsStrings.`option-terminator`
import typings.pkgjsParseargs.pkgjsParseargsStrings.option
import typings.pkgjsParseargs.pkgjsParseargsStrings.positional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index[K /* <: String */]
    extends StObject
       with _PreciseTokenForOptions[K, Any] {
    
    var index: Double
    
    var inlineValue: Boolean
    
    var kind: option
    
    var name: K
    
    var rawName: String
    
    var value: String
  }
  object Index {
    
    inline def apply[K /* <: String */](index: Double, inlineValue: Boolean, name: K, rawName: String, value: String): Index[K] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[K]]
    }
    
    extension [Self <: Index[?], K /* <: String */](x: Self & Index[K]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineValue(value: Boolean): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
      
      inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndexKind
    extends StObject
       with Token {
    
    var index: Double
    
    var kind: `option-terminator`
  }
  object IndexKind {
    
    inline def apply(index: Double): IndexKind = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "option-terminator")
      __obj.asInstanceOf[IndexKind]
    }
    
    extension [Self <: IndexKind](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKind(value: `option-terminator`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait InlineValue[K /* <: String */]
    extends StObject
       with _PreciseTokenForOptions[K, Any] {
    
    var index: Double
    
    var inlineValue: Unit
    
    var kind: option
    
    var name: K
    
    var rawName: String
    
    var value: Unit
  }
  object InlineValue {
    
    inline def apply[K /* <: String */](index: Double, inlineValue: Unit, name: K, rawName: String, value: Unit): InlineValue[K] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineValue[K]]
    }
    
    extension [Self <: InlineValue[?], K /* <: String */](x: Self & InlineValue[K]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineValue(value: Unit): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
      
      inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kind
    extends StObject
       with Token {
    
    var index: Double
    
    var kind: positional
    
    var value: String
  }
  object Kind {
    
    inline def apply(index: Double, value: String): Kind = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "positional", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    extension [Self <: Kind](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKind(value: positional): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[K /* <: String */] extends StObject {
    
    var name: K
  }
  object Name {
    
    inline def apply[K /* <: String */](name: K): Name[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[K]]
    }
    
    extension [Self <: Name[?], K /* <: String */](x: Self & Name[K]) {
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Positionals[T /* <: ParseArgsConfig */] extends StObject {
    
    var positionals: ParsedPositionals[T]
    
    var tokens: ParsedTokens[T]
    
    var values: ParsedValues[T]
  }
  object Positionals {
    
    inline def apply[T /* <: ParseArgsConfig */](positionals: ParsedPositionals[T], tokens: ParsedTokens[T], values: ParsedValues[T]): Positionals[T] = {
      val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Positionals[T]]
    }
    
    extension [Self <: Positionals[?], T /* <: ParseArgsConfig */](x: Self & Positionals[T]) {
      
      inline def setPositionals(value: ParsedPositionals[T]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
      
      inline def setPositionalsVarargs(value: (Any | String)*): Self = StObject.set(x, "positionals", js.Array(value*))
      
      inline def setTokens(value: ParsedTokens[T]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: (ParsedOptionToken[T] | ParsedPositionalToken[T] | IndexKind)*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawName
    extends StObject
       with OptionToken {
    
    var index: Double
    
    var inlineValue: Boolean
    
    var kind: option
    
    var name: String
    
    var rawName: String
    
    var value: String
  }
  object RawName {
    
    inline def apply(index: Double, inlineValue: Boolean, name: String, rawName: String, value: String): RawName = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawName]
    }
    
    extension [Self <: RawName](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineValue(value: Boolean): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
      
      inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tokens extends StObject {
    
    var positionals: js.Array[String]
    
    var tokens: js.UndefOr[js.Array[Token]] = js.undefined
    
    var values: StringDictionary[js.UndefOr[String | Boolean | (js.Array[String | Boolean])]]
  }
  object Tokens {
    
    inline def apply(
      positionals: js.Array[String],
      values: StringDictionary[js.UndefOr[String | Boolean | (js.Array[String | Boolean])]]
    ): Tokens = {
      val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tokens]
    }
    
    extension [Self <: Tokens](x: Self) {
      
      inline def setPositionals(value: js.Array[String]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
      
      inline def setPositionalsVarargs(value: String*): Self = StObject.set(x, "positionals", js.Array(value*))
      
      inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setValues(value: StringDictionary[js.UndefOr[String | Boolean | (js.Array[String | Boolean])]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value
    extends StObject
       with OptionToken {
    
    var index: Double
    
    var inlineValue: Unit
    
    var kind: option
    
    var name: String
    
    var rawName: String
    
    var value: Unit
  }
  object Value {
    
    inline def apply(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): Value = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineValue(value: Unit): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
      
      inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Values[T /* <: ParseArgsConfig */] extends StObject {
    
    var positionals: ParsedPositionals[T]
    
    var values: ParsedValues[T]
  }
  object Values {
    
    inline def apply[T /* <: ParseArgsConfig */](positionals: ParsedPositionals[T], values: ParsedValues[T]): Values[T] = {
      val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values[T]]
    }
    
    extension [Self <: Values[?], T /* <: ParseArgsConfig */](x: Self & Values[T]) {
      
      inline def setPositionals(value: ParsedPositionals[T]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
      
      inline def setPositionalsVarargs(value: (Any | String)*): Self = StObject.set(x, "positionals", js.Array(value*))
      
      inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
