package typings.murmurhashJs

import org.scalablytyped.runtime.TopLevel
import typings.murmurhashJs.anon.Murmur2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("murmurhash-js", JSImport.Namespace)
@js.native
object mod
  extends TopLevel[
      (js.Function2[/* str */ String, /* seed */ js.UndefOr[Double], Double]) with Murmur2
    ]

