package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisParagraph.toJSON()". */

trait InkAnalysisParagraphData extends js.Object {
  /**
               *
               * Gets the ID of the InkAnalysisParagraph object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Reference to the parent InkAnalysisPage. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var inkAnalysis: js.UndefOr[InkAnalysisData] = js.undefined
  /**
              *
              * Gets the ink analysis lines in this ink analysis paragraph. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var lines: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}

