package typings.next.buildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/build", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(dir: String): js.Promise[Unit] = js.native
  def apply(
    dir: String,
    conf: js.UndefOr[scala.Nothing],
    reactProductionProfiling: js.UndefOr[scala.Nothing],
    debugOutput: Boolean
  ): js.Promise[Unit] = js.native
  def apply(dir: String, conf: js.UndefOr[scala.Nothing], reactProductionProfiling: Boolean): js.Promise[Unit] = js.native
  def apply(
    dir: String,
    conf: js.UndefOr[scala.Nothing],
    reactProductionProfiling: Boolean,
    debugOutput: Boolean
  ): js.Promise[Unit] = js.native
  def apply(dir: String, conf: Null, reactProductionProfiling: js.UndefOr[scala.Nothing], debugOutput: Boolean): js.Promise[Unit] = js.native
  def apply(dir: String, conf: Null, reactProductionProfiling: Boolean): js.Promise[Unit] = js.native
  def apply(dir: String, conf: Null, reactProductionProfiling: Boolean, debugOutput: Boolean): js.Promise[Unit] = js.native
}
