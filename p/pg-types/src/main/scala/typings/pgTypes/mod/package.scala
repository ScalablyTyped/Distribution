package typings.pgTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def arrayParser(source: java.lang.String, transform: js.Function1[/* entry */ js.Any, _]): js.Array[_] = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("arrayParser")(source.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def builtins: typings.pgTypes.mod.TypesBuiltins = typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].selectDynamic("builtins").asInstanceOf[typings.pgTypes.mod.TypesBuiltins]
  
  @scala.inline
  def getTypeParser(id: typings.pgTypes.mod.TypeId): js.Any = typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getTypeParser(id: typings.pgTypes.mod.TypeId, format: typings.pgTypes.mod.TypeFormat): js.Any = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def setTypeParser(
    id: typings.pgTypes.mod.TypeId,
    format: typings.pgTypes.mod.TypeFormat,
    parseFn: js.Function1[/* value */ java.lang.String, _]
  ): scala.Unit = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], format.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def setTypeParser(id: typings.pgTypes.mod.TypeId, parseFn: js.Function1[/* value */ java.lang.String, _]): scala.Unit = (typings.pgTypes.mod.^.asInstanceOf[js.Dynamic].applyDynamic("setTypeParser")(id.asInstanceOf[js.Any], parseFn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
}
