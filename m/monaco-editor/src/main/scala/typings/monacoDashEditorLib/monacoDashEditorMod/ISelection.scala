package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISelection extends js.Object {
  /**
       * The column on `positionLineNumber` where the selection has ended.
       */
  val positionColumn: scala.Double
  /**
       * The line number on which the selection has ended.
       */
  val positionLineNumber: scala.Double
  /**
       * The column on `selectionStartLineNumber` where the selection has started.
       */
  val selectionStartColumn: scala.Double
  /**
       * The line number on which the selection has started.
       */
  val selectionStartLineNumber: scala.Double
}

