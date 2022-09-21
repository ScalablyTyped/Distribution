package typings.packageNameConflict

import typings.packageNameConflict.packageNameConflictBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("package-name-conflict/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conflicts(nameA: String, nameB: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("conflicts")(nameA.asInstanceOf[js.Any], nameB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def conflictsAny(name: String, names: js.Array[String]): String | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("conflictsAny")(name.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[String | `false`]
  
  inline def transform(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
