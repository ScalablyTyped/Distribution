package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.pathMod.PlatformPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonpathPosixMod extends Shortcut {
  
  @JSImport("node:path/posix", JSImport.Namespace)
  @js.native
  val ^ : PlatformPath = js.native
  
  type _To = PlatformPath
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonpathPosixMod.foo` */
  override def _to: PlatformPath = ^
}
