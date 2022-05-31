package typings.mondaySdkJs

import typings.mondaySdkJs.anon.PartialclientIdstringapiT
import typings.mondaySdkJs.anon.Partialtokenstring
import typings.mondaySdkJs.mod.MondayClientSdk
import typings.mondaySdkJs.mod.MondayServerSdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def mondaySdk(): MondayClientSdk = js.Dynamic.global.applyDynamic("mondaySdk")().asInstanceOf[MondayClientSdk]
  inline def mondaySdk(config: PartialclientIdstringapiT): MondayClientSdk = js.Dynamic.global.applyDynamic("mondaySdk")(config.asInstanceOf[js.Any]).asInstanceOf[MondayClientSdk]
  inline def mondaySdk(config: Partialtokenstring): MondayServerSdk = js.Dynamic.global.applyDynamic("mondaySdk")(config.asInstanceOf[js.Any]).asInstanceOf[MondayServerSdk]
  
  inline def mondaySdk_MondayServerSdk(): MondayServerSdk = js.Dynamic.global.applyDynamic("mondaySdk")().asInstanceOf[MondayServerSdk]
}
