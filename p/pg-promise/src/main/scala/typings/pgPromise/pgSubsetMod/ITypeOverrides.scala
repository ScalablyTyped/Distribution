package typings.pgPromise.pgSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface for TypeOverrides;
// See: https://github.com/brianc/node-postgres/blob/master/packages/pg/lib/type-overrides.js
@js.native
trait ITypeOverrides extends js.Object {
  
  def getTypeParser(id: TypeId): js.Any = js.native
  def getTypeParser(id: TypeId, format: ParserFormat): js.Any = js.native
  
  def setTypeParser(id: TypeId, format: ParserFormat, parseFn: String): Unit = js.native
  def setTypeParser(id: TypeId, format: ParserFormat, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
  def setTypeParser(id: TypeId, parseFn: String): Unit = js.native
  def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
}
