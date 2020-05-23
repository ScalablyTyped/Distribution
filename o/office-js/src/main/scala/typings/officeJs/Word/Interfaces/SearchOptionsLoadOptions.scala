package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the options to be included in a search operation.
  *
  * [Api set: WordApi 1.1]
  */
trait SearchOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether to ignore all punctuation characters between words. Corresponds to the Ignore punctuation check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignorePunct: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether to ignore all whitespace between words. Corresponds to the Ignore whitespace characters check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignoreSpace: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether to perform a case sensitive search. Corresponds to the Match case check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether to match words that begin with the search string. Corresponds to the Match prefix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchPrefix: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether to match words that end with the search string. Corresponds to the Match suffix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchSuffix: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether to find operation only entire words, not text that is part of a larger word. Corresponds to the Find whole words only check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWholeWord: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWildcards: js.UndefOr[Boolean] = js.undefined
}

object SearchOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    ignorePunct: js.UndefOr[Boolean] = js.undefined,
    ignoreSpace: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    matchPrefix: js.UndefOr[Boolean] = js.undefined,
    matchSuffix: js.UndefOr[Boolean] = js.undefined,
    matchWholeWord: js.UndefOr[Boolean] = js.undefined,
    matchWildcards: js.UndefOr[Boolean] = js.undefined
  ): SearchOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePunct)) __obj.updateDynamic("ignorePunct")(ignorePunct.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSpace)) __obj.updateDynamic("ignoreSpace")(ignoreSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchPrefix)) __obj.updateDynamic("matchPrefix")(matchPrefix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchSuffix)) __obj.updateDynamic("matchSuffix")(matchSuffix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWholeWord)) __obj.updateDynamic("matchWholeWord")(matchWholeWord.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchWildcards)) __obj.updateDynamic("matchWildcards")(matchWildcards.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptionsLoadOptions]
  }
}

