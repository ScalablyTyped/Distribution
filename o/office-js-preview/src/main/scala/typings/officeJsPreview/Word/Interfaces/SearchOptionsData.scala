package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `searchOptions.toJSON()`. */
@js.native
trait SearchOptionsData extends js.Object {
  
  /**
    *
    * Gets or sets a value that indicates whether to ignore all punctuation characters between words. Corresponds to the Ignore punctuation check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignorePunct: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether to ignore all whitespace between words. Corresponds to the Ignore whitespace characters check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignoreSpace: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether to perform a case sensitive search. Corresponds to the Match case check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether to match words that begin with the search string. Corresponds to the Match prefix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchPrefix: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether to match words that end with the search string. Corresponds to the Match suffix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchSuffix: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether to find operation only entire words, not text that is part of a larger word. Corresponds to the Find whole words only check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWholeWord: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWildcards: js.UndefOr[Boolean] = js.native
}
object SearchOptionsData {
  
  @scala.inline
  def apply(): SearchOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptionsData]
  }
  
  @scala.inline
  implicit class SearchOptionsDataOps[Self <: SearchOptionsData] (val x: Self) extends AnyVal {
    
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
    def setIgnorePunct(value: Boolean): Self = this.set("ignorePunct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePunct: Self = this.set("ignorePunct", js.undefined)
    
    @scala.inline
    def setIgnoreSpace(value: Boolean): Self = this.set("ignoreSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSpace: Self = this.set("ignoreSpace", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = this.set("matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCase: Self = this.set("matchCase", js.undefined)
    
    @scala.inline
    def setMatchPrefix(value: Boolean): Self = this.set("matchPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchPrefix: Self = this.set("matchPrefix", js.undefined)
    
    @scala.inline
    def setMatchSuffix(value: Boolean): Self = this.set("matchSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchSuffix: Self = this.set("matchSuffix", js.undefined)
    
    @scala.inline
    def setMatchWholeWord(value: Boolean): Self = this.set("matchWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWholeWord: Self = this.set("matchWholeWord", js.undefined)
    
    @scala.inline
    def setMatchWildcards(value: Boolean): Self = this.set("matchWildcards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchWildcards: Self = this.set("matchWildcards", js.undefined)
  }
}
