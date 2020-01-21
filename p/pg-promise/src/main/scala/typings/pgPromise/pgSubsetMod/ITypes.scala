package typings.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interface of 'pg-types' module;
// See: https://github.com/brianc/node-pg-types
@js.native
trait ITypes extends js.Object {
  var builtins: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TypeId */ js.Any = js.native
  def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, _]): js.Array[_] = js.native
  def getTypeParser(id: TypeId): js.Any = js.native
  def getTypeParser(id: TypeId, format: String): js.Any = js.native
  def setTypeParser(id: TypeId, format: String): Unit = js.native
  def setTypeParser(id: TypeId, format: js.Function1[/* value */ String, _]): Unit = js.native
}

