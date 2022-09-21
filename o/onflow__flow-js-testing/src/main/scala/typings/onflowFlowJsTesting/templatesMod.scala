package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.accountMod.AddressMap
import typings.onflowFlowJsTesting.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesMod {
  
  @JSImport("@onflow/flow-js-testing/src/templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContractCode(props: Name): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getContractCode")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getScriptCode(props: Name): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScriptCode")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getTemplate(file: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getTemplate(file: String, addressMap: Unit, byAddress: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any], addressMap.asInstanceOf[js.Any], byAddress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getTemplate(file: String, addressMap: AddressMap): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any], addressMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getTemplate(file: String, addressMap: AddressMap, byAddress: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTemplate")(file.asInstanceOf[js.Any], addressMap.asInstanceOf[js.Any], byAddress.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getTransactionCode(props: Name): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransactionCode")(props.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
