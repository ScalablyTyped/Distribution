package typings.meteor.global

import typings.meteor.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NpmModules {
  
  @JSGlobal("NpmModules")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("NpmModules.mongodb")
  @js.native
  def mongodb: Module = js.native
  inline def mongodb_=(x: Module): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mongodb")(x.asInstanceOf[js.Any])
}
