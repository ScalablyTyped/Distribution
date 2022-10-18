package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonprocessMod extends Shortcut {
  
  @JSImport("node:process", JSImport.Namespace)
  @js.native
  val ^ : Process = js.native
  
  type _To = Process
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonprocessMod.foo` */
  override def _to: Process = ^
}
