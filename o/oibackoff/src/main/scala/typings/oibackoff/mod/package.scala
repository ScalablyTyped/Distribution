package typings.oibackoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BackoffIntermediate[A] = js.Function3[/* err */ A, /* tries */ scala.Double, /* delay */ scala.Double, scala.Boolean]
}
