package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parallelDashTransformLib {
  type OnTransform = js.Function2[
    /* chunk */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TransformCallback */ /* callback */ js.Any, 
    scala.Unit
  ]
}
