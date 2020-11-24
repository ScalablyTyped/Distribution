package typings.mdastUtilToMarkdown.mod

import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Apostrophe
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Asterisk
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Graveaccent
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Plussign
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Quotationmark
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.Tilde
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings._underscore
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.`-_`
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.mixed
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.one
import typings.mdastUtilToMarkdown.mdastUtilToMarkdownStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var bullet: js.UndefOr[`-_` | Asterisk | Plussign] = js.native
  
  var closeAtx: js.UndefOr[Boolean] = js.native
  
  var emphasis: js.UndefOr[_underscore | Asterisk] = js.native
  
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  
  var fence: js.UndefOr[Tilde | Graveaccent] = js.native
  
  var fences: js.UndefOr[Boolean] = js.native
  
  var handlers: js.UndefOr[Handlers] = js.native
  
  var incrementListMarker: js.UndefOr[Boolean] = js.native
  
  var join: js.UndefOr[js.Array[Join]] = js.native
  
  var listItemIndent: js.UndefOr[tab | one | mixed] = js.native
  
  var quote: js.UndefOr[Quotationmark | Apostrophe] = js.native
  
  var rule: js.UndefOr[`-_` | _underscore | Asterisk] = js.native
  
  var ruleRepeat: js.UndefOr[Double] = js.native
  
  var ruleSpaces: js.UndefOr[Boolean] = js.native
  
  var setext: js.UndefOr[Boolean] = js.native
  
  var strong: js.UndefOr[_underscore | Asterisk] = js.native
  
  var tightDefinitions: js.UndefOr[Boolean] = js.native
  
  var unsafe: js.UndefOr[js.Array[Unsafe]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBullet(value: `-_` | Asterisk | Plussign): Self = this.set("bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    
    @scala.inline
    def setCloseAtx(value: Boolean): Self = this.set("closeAtx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseAtx: Self = this.set("closeAtx", js.undefined)
    
    @scala.inline
    def setEmphasis(value: _underscore | Asterisk): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[Extension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setFence(value: Tilde | Graveaccent): Self = this.set("fence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFence: Self = this.set("fence", js.undefined)
    
    @scala.inline
    def setFences(value: Boolean): Self = this.set("fences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFences: Self = this.set("fences", js.undefined)
    
    @scala.inline
    def setHandlers(value: Handlers): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setIncrementListMarker(value: Boolean): Self = this.set("incrementListMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementListMarker: Self = this.set("incrementListMarker", js.undefined)
    
    @scala.inline
    def setJoinVarargs(value: Join*): Self = this.set("join", js.Array(value :_*))
    
    @scala.inline
    def setJoin(value: js.Array[Join]): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    
    @scala.inline
    def setListItemIndent(value: tab | one | mixed): Self = this.set("listItemIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemIndent: Self = this.set("listItemIndent", js.undefined)
    
    @scala.inline
    def setQuote(value: Quotationmark | Apostrophe): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setRule(value: `-_` | _underscore | Asterisk): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    
    @scala.inline
    def setRuleRepeat(value: Double): Self = this.set("ruleRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleRepeat: Self = this.set("ruleRepeat", js.undefined)
    
    @scala.inline
    def setRuleSpaces(value: Boolean): Self = this.set("ruleSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleSpaces: Self = this.set("ruleSpaces", js.undefined)
    
    @scala.inline
    def setSetext(value: Boolean): Self = this.set("setext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetext: Self = this.set("setext", js.undefined)
    
    @scala.inline
    def setStrong(value: _underscore | Asterisk): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    
    @scala.inline
    def setTightDefinitions(value: Boolean): Self = this.set("tightDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTightDefinitions: Self = this.set("tightDefinitions", js.undefined)
    
    @scala.inline
    def setUnsafeVarargs(value: Unsafe*): Self = this.set("unsafe", js.Array(value :_*))
    
    @scala.inline
    def setUnsafe(value: js.Array[Unsafe]): Self = this.set("unsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafe: Self = this.set("unsafe", js.undefined)
  }
}
