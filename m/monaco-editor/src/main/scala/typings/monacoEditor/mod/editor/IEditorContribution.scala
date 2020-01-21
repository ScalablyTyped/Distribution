package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorContribution extends js.Object {
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.undefined
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit
  /**
    * Get a unique identifier for this contribution.
    */
  def getId(): String
}

object IEditorContribution {
  @scala.inline
  def apply(
    dispose: () => Unit,
    getId: () => String,
    restoreViewState: /* state */ js.Any => Unit = null,
    saveViewState: () => _ = null
  ): IEditorContribution = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), getId = js.Any.fromFunction0(getId))
    if (restoreViewState != null) __obj.updateDynamic("restoreViewState")(js.Any.fromFunction1(restoreViewState))
    if (saveViewState != null) __obj.updateDynamic("saveViewState")(js.Any.fromFunction0(saveViewState))
    __obj.asInstanceOf[IEditorContribution]
  }
}

