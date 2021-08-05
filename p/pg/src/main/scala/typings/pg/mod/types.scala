package typings.pg.mod

import typings.pgTypes.mod.TypeFormat
import typings.pgTypes.mod.TypeId
import typings.pgTypes.mod.TypesBuiltins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  @JSImport("pg", "types")
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayParser(source: String, transform: js.Function1[/* entry */ js.Any, js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayParser")(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @JSImport("pg", "types.builtins")
  @js.native
  val builtins: TypesBuiltins = js.native
  
  inline def getTypeParser(id: TypeId): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getTypeParser(id: TypeId, format: TypeFormat): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def setTypeParser(id: TypeId, format: TypeFormat, parseFn: js.Function1[/* value */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
