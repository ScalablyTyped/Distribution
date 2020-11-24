package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMonarchLanguage extends js.Object {
  
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
  implicit class IMonarchLanguageOps[Self <: IMonarchLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTokenizer(value: StringDictionary[js.Array[IMonarchLanguageRule]]): Self = this.set("tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketsVarargs(value: IMonarchLanguageBracket*): Self = this.set("brackets", js.Array(value :_*))
    
    @scala.inline
    def setBrackets(value: js.Array[IMonarchLanguageBracket]): Self = this.set("brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrackets: Self = this.set("brackets", js.undefined)
    
    @scala.inline
    def setDefaultToken(value: String): Self = this.set("defaultToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultToken: Self = this.set("defaultToken", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTokenPostfix(value: String): Self = this.set("tokenPostfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenPostfix: Self = this.set("tokenPostfix", js.undefined)
    
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
  }
}
