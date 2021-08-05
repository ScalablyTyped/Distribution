package typings.officeUiFabricReact

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupedListUtilityMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/groupedList/GroupedListUtility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetGroupCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetGroupCount")().asInstanceOf[Double]
  inline def GetGroupCount(groups: js.Array[IGroup]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetGroupCount")(groups.asInstanceOf[js.Any]).asInstanceOf[Double]
}
