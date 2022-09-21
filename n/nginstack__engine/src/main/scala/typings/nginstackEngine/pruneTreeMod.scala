package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pruneTreeMod {
  
  inline def apply(ds: Any, idField: String, parentField: String, filterFunc: js.Function1[/* arg0 */ Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].apply(ds.asInstanceOf[js.Any], idField.asInstanceOf[js.Any], parentField.asInstanceOf[js.Any], filterFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/pruneTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
