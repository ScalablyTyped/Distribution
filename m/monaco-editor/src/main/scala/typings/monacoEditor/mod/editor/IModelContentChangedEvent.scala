package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelContentChangedEvent extends js.Object {
  val changes: js.Array[IModelContentChange] = js.native
  /**
    * The (new) end-of-line character.
    */
  val eol: String = js.native
  /**
    * Flag that indicates that all decorations were lost with this edit.
    * The model has been reset to a new value.
    */
  val isFlush: Boolean = js.native
  /**
    * Flag that indicates that this event was generated while redoing.
    */
  val isRedoing: Boolean = js.native
  /**
    * Flag that indicates that this event was generated while undoing.
    */
  val isUndoing: Boolean = js.native
  /**
    * The new version id the model has transitioned to.
    */
  val versionId: Double = js.native
}

object IModelContentChangedEvent {
  @scala.inline
  def apply(
    changes: js.Array[IModelContentChange],
    eol: String,
    isFlush: Boolean,
    isRedoing: Boolean,
    isUndoing: Boolean,
    versionId: Double
  ): IModelContentChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], eol = eol.asInstanceOf[js.Any], isFlush = isFlush.asInstanceOf[js.Any], isRedoing = isRedoing.asInstanceOf[js.Any], isUndoing = isUndoing.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelContentChangedEvent]
  }
  @scala.inline
  implicit class IModelContentChangedEventOps[Self <: IModelContentChangedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangesVarargs(value: IModelContentChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[IModelContentChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEol(value: String): Self = this.set("eol", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFlush(value: Boolean): Self = this.set("isFlush", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRedoing(value: Boolean): Self = this.set("isRedoing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUndoing(value: Boolean): Self = this.set("isUndoing", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionId(value: Double): Self = this.set("versionId", value.asInstanceOf[js.Any])
  }
  
}

