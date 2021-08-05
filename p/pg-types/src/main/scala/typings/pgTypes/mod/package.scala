package typings.pgTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def arrayParser(source: java.lang.String, transform: js.Function1[/* entry */ js.Any, js.Any]): js.Array[js.Any] = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("arrayParser")(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]

inline def builtins: typings.pgTypes.mod.TypesBuiltins = typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].selectDynamic("builtins").asInstanceOf[typings.pgTypes.mod.TypesBuiltins]

inline def getTypeParser(id: typings.pgTypes.mod.TypeId): js.Any = typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
inline def getTypeParser(id: typings.pgTypes.mod.TypeId, format: typings.pgTypes.mod.TypeFormat): js.Any = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def setTypeParser(
  id: typings.pgTypes.mod.TypeId,
  format: typings.pgTypes.mod.TypeFormat,
  parseFn: js.Function1[/* value */ java.lang.String, js.Any]
): scala.Unit = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def setTypeParser(id: typings.pgTypes.mod.TypeId, parseFn: js.Function1[/* value */ java.lang.String, js.Any]): scala.Unit = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
