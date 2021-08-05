package typings.micromark

import typings.micromark.sharedTypesMod.Options
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("micromark/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EventEmitter]
  inline def default(options: Options): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
}
