package typings.osName

import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(platform: Platform, release: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(platform.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String]
}
