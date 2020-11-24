package typings.nodeJsonDb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-json-db/dist/lib/Utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def merge(arrays: KeyValue*): KeyValue = js.native
  
  def removeTrailingChar(dataPath: String, trailing: String): String = js.native
  
  type KeyValue = StringDictionary[js.Any]
}
