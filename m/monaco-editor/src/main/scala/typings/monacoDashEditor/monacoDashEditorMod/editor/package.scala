package typings.monacoDashEditor.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object editor {
  import org.scalablytyped.runtime.StringDictionary
  import typings.monacoDashEditor.monacoDashEditorMod.Selection

  type ICodeActionsOnSaveOptions = StringDictionary[Boolean]
  type IColors = StringDictionary[String]
  type ICommandHandler = js.Function1[/* repeated */ js.Any, Unit]
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[IIdentifiedSingleEditOperation], 
    js.Array[Selection] | Null
  ]
  type IEditorOverrideServices = StringDictionary[js.Any]
  type IModel = ITextModel
  type IReadOnlyModel = ITextModel
}
