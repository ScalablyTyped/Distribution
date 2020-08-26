package typings.popmotion

import typings.popmotion.anon.Delta
import typings.popmotion.typesMod.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/framesync/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  def getFrameData(): Delta = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(cancelSync) */ @js.native
  object default extends js.Object {
    def fixedUpdate(process: Process): Process = js.native
    def fixedUpdate(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def fixedUpdate(process: Process, keepAlive: Boolean): Process = js.native
    def fixedUpdate(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def postRender(process: Process): Process = js.native
    def postRender(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean): Process = js.native
    def postRender(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def read(process: Process): Process = js.native
    def read(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean): Process = js.native
    def read(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def render(process: Process): Process = js.native
    def render(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean): Process = js.native
    def render(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
    def update(process: Process): Process = js.native
    def update(process: Process, keepAlive: js.UndefOr[scala.Nothing], immediate: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean): Process = js.native
    def update(process: Process, keepAlive: Boolean, immediate: Boolean): Process = js.native
  }
  
}

