package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisLine.toJSON()". */

trait InkAnalysisLineData extends js.Object {
  /**
               *
               * Gets the ID of the InkAnalysisLine object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Reference to the parent InkAnalysisParagraph. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var paragraph: js.UndefOr[InkAnalysisParagraphData] = js.undefined
  /**
              *
              * Gets the ink analysis words in this ink analysis line. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var words: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}

