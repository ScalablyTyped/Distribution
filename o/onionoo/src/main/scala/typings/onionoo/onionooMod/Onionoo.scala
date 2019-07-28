package typings.onionoo.onionooMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.onionoo.onionooMod.OnionooNs.Endpoints
import typings.onionoo.onionooMod.OnionooNs.Instance
import typings.onionoo.onionooMod.OnionooNs.Options
import typings.onionoo.onionooMod.OnionooNs.OptionsWithEndpoints
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onionoo
  extends Instantiable0[Instance with Endpoints]
     with Instantiable1[
      (/* options */ Options) | (/* options */ OptionsWithEndpoints), 
      (Instance with Endpoints) | (Instance with Partial[Endpoints])
    ]

