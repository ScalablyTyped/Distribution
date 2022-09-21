package typings.orientjs.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "LiveQuery")
@js.native
open class LiveQuery () extends Readable {
  def this(opts: ReadableOptions) = this()
  
  def unsubscribe(): js.Promise[Any] = js.native
}
