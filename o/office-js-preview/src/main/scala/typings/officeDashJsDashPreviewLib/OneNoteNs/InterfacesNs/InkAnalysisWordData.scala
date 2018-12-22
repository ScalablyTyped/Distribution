package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisWord.toJSON()". */

trait InkAnalysisWordData extends js.Object {
  /**
               *
               * Gets the ID of the InkAnalysisWord object. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The id of the recognized language in this inkAnalysisWord. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var languageId: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Reference to the parent InkAnalysisLine. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var line: js.UndefOr[InkAnalysisLineData] = js.undefined
  /**
               *
               * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var strokePointers: js.UndefOr[js.Array[officeDashJsDashPreviewLib.OneNoteNs.InkStrokePointer]] = js.undefined
  /**
               *
               * The words that were recognized in this ink word, in order of likelihood. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var wordAlternates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

