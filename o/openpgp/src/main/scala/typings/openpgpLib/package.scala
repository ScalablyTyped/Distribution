package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openpgpLib {
  type Infinity = js.Any
  type Integer = scala.Double
  // Declare to fix type issue
  type NodeStream = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify stream */ js.Any
  type ReadableStream[T] = js.Any
}
