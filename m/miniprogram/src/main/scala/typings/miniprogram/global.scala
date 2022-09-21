package typings.miniprogram

import typings.miniprogram.anon.Dictkey
import typings.miniprogram.anon.dataanyundefinedonLoadque
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def App(obj: Dictkey): Unit = js.Dynamic.global.applyDynamic("App")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Page(obj: dataanyundefinedonLoadque): Unit = js.Dynamic.global.applyDynamic("Page")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getApp(): Any = js.Dynamic.global.applyDynamic("getApp")().asInstanceOf[Any]
  
  inline def getCurrentPages(): js.Array[Any] = js.Dynamic.global.applyDynamic("getCurrentPages")().asInstanceOf[js.Array[Any]]
  
  @JSGlobal("my")
  @js.native
  val my: MiniprogramApi = js.native
}
