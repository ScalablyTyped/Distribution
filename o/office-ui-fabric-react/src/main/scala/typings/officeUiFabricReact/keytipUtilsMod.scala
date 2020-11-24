package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipUtils", JSImport.Namespace)
@js.native
object keytipUtilsMod extends js.Object {
  
  def getAriaDescribedBy(keySequences: js.Array[String]): String = js.native
  
  def ktpTargetFromId(keytipId: String): String = js.native
  
  def ktpTargetFromSequences(keySequences: js.Array[String]): String = js.native
  
  def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = js.native
  
  def sequencesToID(keySequences: js.Array[String]): String = js.native
}
