package typings.pkgjsParseargs

import typings.pkgjsParseargs.mod.OptionToken
import typings.pkgjsParseargs.mod.ParseArgsConfig
import typings.pkgjsParseargs.mod.ParsedOptionToken
import typings.pkgjsParseargs.mod.ParsedPositionalToken
import typings.pkgjsParseargs.mod.ParsedPositionals
import typings.pkgjsParseargs.mod.ParsedTokens
import typings.pkgjsParseargs.mod.ParsedValues
import typings.pkgjsParseargs.mod.Token
import typings.pkgjsParseargs.pkgjsParseargsStrings.`option-terminator`
import typings.pkgjsParseargs.pkgjsParseargsStrings.option
import typings.pkgjsParseargs.pkgjsParseargsStrings.positional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index
    extends StObject
       with OptionToken {
    
    var index: Double
    
    var inlineValue: Boolean
    
    var kind: option
    
    var name: String
    
    var rawName: String
    
    var value: String
  }
  object Index {
    
    inline def apply(index: Double, inlineValue: Boolean, name: String, rawName: String, value: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineValue(value: Boolean): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
      
      inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
  
  trait InlineValue
    extends StObject
       with OptionToken {
    
    var index: Double
    
    var inlineValue: Unit
    
    var kind: option
    
    var name: String
    
    var rawName: String
    
    var value: Unit
  }
  object InlineValue {
    
    inline def apply(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): InlineValue = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineValue]
    }
    
    extension [Self <: InlineValue](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInlineValue(value: Unit): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
      
      inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
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
      
      inline def setPositionalsVarargs(value: Any*): Self = StObject.set(x, "positionals", js.Array(value*))
      
      inline def setTokens(value: ParsedTokens[T]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: (ParsedOptionToken[T] | ParsedPositionalToken[T] | IndexKind)*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
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
      
      inline def setPositionalsVarargs(value: Any*): Self = StObject.set(x, "positionals", js.Array(value*))
      
      inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
