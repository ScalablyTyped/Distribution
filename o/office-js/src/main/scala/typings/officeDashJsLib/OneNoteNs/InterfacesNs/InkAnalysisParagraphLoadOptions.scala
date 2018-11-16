package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents ink analysis data for an identified paragraph formed by ink strokes.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait InkAnalysisParagraphLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the ID of the InkAnalysisParagraph object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Reference to the parent InkAnalysisPage.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var inkAnalysis: js.UndefOr[InkAnalysisLoadOptions] = js.undefined
  /**
              *
              * Gets the ink analysis lines in this ink analysis paragraph.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var lines: js.UndefOr[InkAnalysisLineCollectionLoadOptions] = js.undefined
}

