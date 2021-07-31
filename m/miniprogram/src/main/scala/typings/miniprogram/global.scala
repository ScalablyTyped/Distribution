package typings.miniprogram

import typings.miniprogram.anon.Dictkey
import typings.miniprogram.anon.dataanyundefinedonLoadque
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @scala.inline
  def App(obj: Dictkey): Unit = js.Dynamic.global.applyDynamic("App")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def Page(obj: dataanyundefinedonLoadque): Unit = js.Dynamic.global.applyDynamic("Page")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getApp(): js.Any = js.Dynamic.global.applyDynamic("getApp")().asInstanceOf[js.Any]
  
  @scala.inline
  def getCurrentPages(): js.Array[js.Any] = js.Dynamic.global.applyDynamic("getCurrentPages")().asInstanceOf[js.Array[js.Any]]
  
  @JSGlobal("my")
  @js.native
  val my: MiniprogramApi = js.native
}
