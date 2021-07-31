package typings.mongodb.mod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Mongos")
@js.native
class Mongos protected () extends EventEmitter {
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: MongosOptions) = this()
  
  def connections(): js.Array[js.Any] = js.native
}
