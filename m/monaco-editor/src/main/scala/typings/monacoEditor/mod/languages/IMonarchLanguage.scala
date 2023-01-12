package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMonarchLanguage
  extends StObject
     with /**
  * Other keys that can be referred to by the tokenizer.
  */
/* key */ StringDictionary[Any] {
  
  /**
    * for example [['{','}','delimiter.curly']]
    */
  var brackets: js.UndefOr[js.Array[IMonarchLanguageBracket]] = js.undefined
  
  /**
    * if no match in the tokenizer assign this token class (default 'source')
    */
  var defaultToken: js.UndefOr[String] = js.undefined
  
  /**
    * is the language case insensitive?
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * include line feeds (in the form of a \n character) at the end of lines
    * Defaults to false
    */
  var includeLF: js.UndefOr[Boolean] = js.undefined
  
  /**
    * start symbol in the tokenizer (by default the first entry is used)
    */
  var start: js.UndefOr[String] = js.undefined
  
  /**
    * attach this to every token class (by default '.' + name)
    */
  var tokenPostfix: js.UndefOr[String] = js.undefined
  
  /**
    * map from string to ILanguageRule[]
    */
  var tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]]
  
  /**
    * is the language unicode-aware? (i.e., /\\u{1D306}/)
    */
  var unicode: js.UndefOr[Boolean] = js.undefined
}
object IMonarchLanguage {
  
  inline def apply(tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]]): IMonarchLanguage = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonarchLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMonarchLanguage] (val x: Self) extends AnyVal {
    
    inline def setBrackets(value: js.Array[IMonarchLanguageBracket]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    inline def setBracketsVarargs(value: IMonarchLanguageBracket*): Self = StObject.set(x, "brackets", js.Array(value*))
    
    inline def setDefaultToken(value: String): Self = StObject.set(x, "defaultToken", value.asInstanceOf[js.Any])
    
    inline def setDefaultTokenUndefined: Self = StObject.set(x, "defaultToken", js.undefined)
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    inline def setIncludeLF(value: Boolean): Self = StObject.set(x, "includeLF", value.asInstanceOf[js.Any])
    
    inline def setIncludeLFUndefined: Self = StObject.set(x, "includeLF", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTokenPostfix(value: String): Self = StObject.set(x, "tokenPostfix", value.asInstanceOf[js.Any])
    
    inline def setTokenPostfixUndefined: Self = StObject.set(x, "tokenPostfix", js.undefined)
    
    inline def setTokenizer(value: StringDictionary[js.Array[IMonarchLanguageRule]]): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}
