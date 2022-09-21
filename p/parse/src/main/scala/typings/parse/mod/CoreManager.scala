package typings.parse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use this to set custom headers
  * The headers will be sent with every parse request
  */
object CoreManager {
  
  @JSImport("parse", "CoreManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def set(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
