package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Location extends js.Object {
  /**
       * One-based column index of the last character
       */
  var endCol: scala.Double
  /**
       * One-based line index of the last character
       */
  var endLine: scala.Double
  /**
       * Zero-based last character index
       */
  var endOffset: scala.Double
  /**
       * One-based column index of the first character
       */
  var startCol: scala.Double
  /**
       * One-based line index of the first character
       */
  var startLine: scala.Double
  /**
       * Zero-based first character index
       */
  var startOffset: scala.Double
}

