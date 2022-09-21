package typings.onflowFlowJsTesting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("@onflow/flow-js-testing/src/manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlockOffset(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockOffset")().asInstanceOf[js.Promise[String]]
  
  inline def getTimestampOffset(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimestampOffset")().asInstanceOf[js.Promise[String]]
  
  inline def setBlockOffset(offset: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBlockOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def setTimestampOffset(offset: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimestampOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
