package typings.nodeDashForge

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Seed extends js.Object {
  var seed: js.UndefOr[Buffer | Uint8Array | String] = js.undefined
}

object Anon_Seed {
  @scala.inline
  def apply(seed: Buffer | Uint8Array | String = null): Anon_Seed = {
    val __obj = js.Dynamic.literal()
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Seed]
  }
}

