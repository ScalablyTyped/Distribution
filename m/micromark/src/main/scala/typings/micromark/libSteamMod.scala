package typings.micromark

import typings.micromark.libSharedTypesMod.Options
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSteamMod {
  
  @JSImport("micromark/lib/steam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventEmitter]
  @scala.inline
  def default(options: Options): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
}
