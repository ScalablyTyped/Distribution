package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Token extends js.Object {
  /**
       * The column where the match begins, starting from 1.
       */
  var col: scala.Double
  /**
       * The line number of the beginning of the match, starting from 1.
       */
  var line: scala.Double
  /**
       * The number of line breaks found in the match. (Always zero if this rule has lineBreaks: false.)
       */
  var lineBreaks: scala.Double
  /**
       * The number of bytes from the start of the buffer where the match starts.
       */
  var offset: scala.Double
  /**
       * The complete match.
       */
  var text: java.lang.String
  /**
       * The name of the group, as passed to compile.
       */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The match contents.
       */
  var value: java.lang.String
}

