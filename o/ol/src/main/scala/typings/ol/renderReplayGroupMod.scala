package typings.ol

import typings.ol.renderReplayGroupMod.ReplayGroup
import typings.ol.renderReplayTypeMod.ReplayType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/ReplayGroup", JSImport.Namespace)
@js.native
object renderReplayGroupMod extends js.Object {
  @js.native
  trait ReplayGroup extends js.Object {
    def addDeclutter(group: Boolean): js.Array[_] = js.native
    def getReplay(zIndex: js.UndefOr[scala.Nothing], replayType: ReplayType): typings.ol.renderVectorContextMod.default = js.native
    def getReplay(zIndex: Double, replayType: ReplayType): typings.ol.renderVectorContextMod.default = js.native
    def isEmpty(): Boolean = js.native
  }
  
  @js.native
  class default () extends ReplayGroup
  
}

