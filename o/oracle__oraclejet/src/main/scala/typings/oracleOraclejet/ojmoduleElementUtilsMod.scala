package typings.oracleOraclejet

import typings.oracleOraclejet.anon.Require
import typings.oracleOraclejet.anon.ViewModelPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojmoduleElementUtilsMod {
  
  @JSImport("@oracle/oraclejet/ojmodule-element-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createView(options: Require): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def createViewModel(options: ViewModelPath): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createViewModel")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
