package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

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
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether to ignore all punctuation characters between words. Corresponds to the Ignore punctuation check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var ignorePunct: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether to ignore all whitespace between words. Corresponds to the Ignore whitespace characters check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var ignoreSpace: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether to perform a case sensitive search. Corresponds to the Match case check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether to match words that begin with the search string. Corresponds to the Match prefix check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var matchPrefix: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether to match words that end with the search string. Corresponds to the Match suffix check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var matchSuffix: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether to find operation only entire words, not text that is part of a larger word. Corresponds to the Find whole words only check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var matchWholeWord: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
               *
               * [Api set: WordApi 1.1]
               */
  var matchWildcards: js.UndefOr[scala.Boolean] = js.undefined
}

