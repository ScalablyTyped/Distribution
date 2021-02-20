package typings.pg.mod

import typings.pgTypes.mod.TypeFormat
import typings.pgTypes.mod.TypeId
import typings.pgTypes.mod.TypesBuiltins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  @JSImport("pg", "types.arrayParser")
  @js.native
  def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, _]): js.Array[_] = js.native
  
  @JSImport("pg", "types.builtins")
  @js.native
  val builtins: TypesBuiltins = js.native
  
  @JSImport("pg", "types.getTypeParser")
  @js.native
  def getTypeParser(id: TypeId): js.Any = js.native
  @JSImport("pg", "types.getTypeParser")
  @js.native
  def getTypeParser(id: TypeId, format: TypeFormat): js.Any = js.native
  
  @JSImport("pg", "types.setTypeParser")
  @js.native
  def setTypeParser(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
  @JSImport("pg", "types.setTypeParser")
  @js.native
  def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, _]): Unit = js.native
}
