package typings.nodeJsonDb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("node-json-db/dist/lib/Utils", "merge")
  @js.native
  def merge(arrays: KeyValue*): KeyValue = js.native
  
  @JSImport("node-json-db/dist/lib/Utils", "removeTrailingChar")
  @js.native
  def removeTrailingChar(dataPath: String, trailing: String): String = js.native
  
  type KeyValue = StringDictionary[js.Any]
}
