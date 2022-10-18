package typings.officeUiFabricReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesKeytipsKeytipUtilsMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAriaDescribedBy(keySequences: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAriaDescribedBy")(keySequences.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ktpTargetFromId(keytipId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ktpTargetFromId")(keytipId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ktpTargetFromSequences(keySequences: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ktpTargetFromSequences")(keySequences.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverflows")(keySequences.asInstanceOf[js.Any], overflowKeySequences.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def sequencesToID(keySequences: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sequencesToID")(keySequences.asInstanceOf[js.Any]).asInstanceOf[String]
}
