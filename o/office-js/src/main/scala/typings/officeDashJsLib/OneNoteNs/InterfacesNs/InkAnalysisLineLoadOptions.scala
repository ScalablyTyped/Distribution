package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents ink analysis data for an identified text line formed by ink strokes.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait InkAnalysisLineLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the ID of the InkAnalysisLine object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Reference to the parent InkAnalysisParagraph.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var paragraph: js.UndefOr[InkAnalysisParagraphLoadOptions] = js.undefined
  /**
              *
              * Gets the ink analysis words in this ink analysis line.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var words: js.UndefOr[InkAnalysisWordCollectionLoadOptions] = js.undefined
}

