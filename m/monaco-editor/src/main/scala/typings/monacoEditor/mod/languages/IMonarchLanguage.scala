package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMonarchLanguage extends StObject {
  
  /**
    * for example [['{','}','delimiter.curly']]
    */
  var brackets: js.UndefOr[js.Array[IMonarchLanguageBracket]] = js.native
  
  /**
    * if no match in the tokenizer assign this token class (default 'source')
    */
  var defaultToken: js.UndefOr[String] = js.native
  
  /**
    * is the language case insensitive?
    */
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  /**
    * start symbol in the tokenizer (by default the first entry is used)
    */
  var start: js.UndefOr[String] = js.native
  
  /**
    * attach this to every token class (by default '.' + name)
    */
  var tokenPostfix: js.UndefOr[String] = js.native
  
  /**
    * map from string to ILanguageRule[]
    */
  var tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]] = js.native
  
  /**
    * is the language unicode-aware? (i.e., /\\u{1D306}/)
    */
  var unicode: js.UndefOr[Boolean] = js.native
}
object IMonarchLanguage {
  
  @scala.inline
  def apply(tokenizer: StringDictionary[js.Array[IMonarchLanguageRule]]): IMonarchLanguage = {
    val __obj = js.Dynamic.literal(tokenizer = tokenizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonarchLanguage]
  }
  
  @scala.inline
  implicit class IMonarchLanguageMutableBuilder[Self <: IMonarchLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrackets(value: js.Array[IMonarchLanguageBracket]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    @scala.inline
    def setBracketsVarargs(value: IMonarchLanguageBracket*): Self = StObject.set(x, "brackets", js.Array(value :_*))
    
    @scala.inline
    def setDefaultToken(value: String): Self = StObject.set(x, "defaultToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTokenUndefined: Self = StObject.set(x, "defaultToken", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTokenPostfix(value: String): Self = StObject.set(x, "tokenPostfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenPostfixUndefined: Self = StObject.set(x, "tokenPostfix", js.undefined)
    
    @scala.inline
    def setTokenizer(value: StringDictionary[js.Array[IMonarchLanguageRule]]): Self = StObject.set(x, "tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
  }
}
