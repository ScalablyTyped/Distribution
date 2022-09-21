package typings.nodeJsonDb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("node-json-db/dist/lib/Utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(arrays: KeyValue*): KeyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[KeyValue]
  
  inline def removeTrailingChar(dataPath: String, trailing: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeTrailingChar")(dataPath.asInstanceOf[js.Any], trailing.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type KeyValue = StringDictionary[Any]
}
