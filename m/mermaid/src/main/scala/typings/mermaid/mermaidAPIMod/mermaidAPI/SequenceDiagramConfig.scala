package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceDiagramConfig extends js.Object {
  /**
    * **actorMargin** - Margin between actors
    * default: 10
    */
  var actorMargin: js.UndefOr[Double] = js.native
  /**
    * **bottomMarginAdj** - Depending on css styling this might need adjustment.
    * Prolongs the edge of the diagram downwards
    * default: 1
    */
  var bottomMarginAdj: js.UndefOr[Double] = js.native
  /**
    * **boxMargin** - Margin around loop boxes
    * default: 10
    */
  var boxMargin: js.UndefOr[Double] = js.native
  /**
    * **boxTextMargin** - margin around the text in loop/alt/opt boxes
    * default: 5
    */
  var boxTextMargin: js.UndefOr[Double] = js.native
  /**
    * **diagramMarginX** - margin to the right and left of the sequence diagram
    * default: 50
    */
  var diagramMarginX: js.UndefOr[Double] = js.native
  /**
    * **diagramMarginY** - margin to the over and under the sequence diagram
    * default: 10
    */
  var diagramMarginY: js.UndefOr[Double] = js.native
  /**
    * **height** - Height of actor boxes
    * default: 65
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * **messageMargin** - Space between messages
    * default: 35
    */
  var messageMargin: js.UndefOr[Double] = js.native
  /**
    * **mirrorActors** - mirror actors under diagram
    * default: true
    */
  var mirrorActors: js.UndefOr[Boolean] = js.native
  /**
    * **noteMargin** - margin around notes
    * default: 10
    */
  var noteMargin: js.UndefOr[Double] = js.native
  /**
    * **useMaxWidth** - when this flag is set the height and width is set to 100% and is then scaling with the
    * available space if not the absolute space required is used
    * default: true
    */
  var useMaxWidth: js.UndefOr[Boolean] = js.native
  /**
    * **width** - Width of actor boxes
    * default: 150
    */
  var width: js.UndefOr[Double] = js.native
}

object SequenceDiagramConfig {
  @scala.inline
  def apply(): SequenceDiagramConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceDiagramConfig]
  }
  @scala.inline
  implicit class SequenceDiagramConfigOps[Self <: SequenceDiagramConfig] (val x: Self) extends AnyVal {
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
    def setActorMargin(value: Double): Self = this.set("actorMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActorMargin: Self = this.set("actorMargin", js.undefined)
    @scala.inline
    def setBottomMarginAdj(value: Double): Self = this.set("bottomMarginAdj", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomMarginAdj: Self = this.set("bottomMarginAdj", js.undefined)
    @scala.inline
    def setBoxMargin(value: Double): Self = this.set("boxMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxMargin: Self = this.set("boxMargin", js.undefined)
    @scala.inline
    def setBoxTextMargin(value: Double): Self = this.set("boxTextMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxTextMargin: Self = this.set("boxTextMargin", js.undefined)
    @scala.inline
    def setDiagramMarginX(value: Double): Self = this.set("diagramMarginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramMarginX: Self = this.set("diagramMarginX", js.undefined)
    @scala.inline
    def setDiagramMarginY(value: Double): Self = this.set("diagramMarginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramMarginY: Self = this.set("diagramMarginY", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMessageMargin(value: Double): Self = this.set("messageMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageMargin: Self = this.set("messageMargin", js.undefined)
    @scala.inline
    def setMirrorActors(value: Boolean): Self = this.set("mirrorActors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirrorActors: Self = this.set("mirrorActors", js.undefined)
    @scala.inline
    def setNoteMargin(value: Double): Self = this.set("noteMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoteMargin: Self = this.set("noteMargin", js.undefined)
    @scala.inline
    def setUseMaxWidth(value: Boolean): Self = this.set("useMaxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMaxWidth: Self = this.set("useMaxWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

