package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seed extends js.Object {
  var seed: js.UndefOr[NativeBuffer | String] = js.undefined
}

object Seed {
  @scala.inline
  def apply(seed: NativeBuffer | String = null): Seed = {
    val __obj = js.Dynamic.literal()
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Seed]
  }
}

