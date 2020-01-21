package typings.murmurhashJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("murmurhash-js", JSImport.Namespace)
@js.native
object mod
  extends TopLevel[
      (js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]) with AnonMurmur2
    ]

