package typings.nodeRal.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ral", "RalModule")
@js.native
abstract class RalModule () extends js.Object {
  
  def getCategory(): String = js.native
  
  def getName(): String = js.native
}
/* static members */
@JSImport("node-ral", "RalModule")
@js.native
object RalModule extends js.Object {
  
  def clearCache(): Unit = js.native
  
  def load(pathOrModule: String): Unit = js.native
  def load(pathOrModule: RalModule): Unit = js.native
  
  var modules: StringDictionary[RalModule] = js.native
}
