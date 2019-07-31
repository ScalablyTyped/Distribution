package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Seed extends js.Object {
  var seed: js.UndefOr[NativeBuffer | String] = js.undefined
}

object Anon_Seed {
  @scala.inline
  def apply(seed: NativeBuffer | String = null): Anon_Seed = {
    val __obj = js.Dynamic.literal()
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Seed]
  }
}

