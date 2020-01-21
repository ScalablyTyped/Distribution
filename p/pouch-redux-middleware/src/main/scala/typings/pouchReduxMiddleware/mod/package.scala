package typings.pouchReduxMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Document[T] = typings.pouchdbCore.PouchDB.Core.IdMeta with T
}
