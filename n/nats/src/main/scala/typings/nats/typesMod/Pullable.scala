package typings.nats.typesMod

import typings.nats.anon.PartialPullOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pullable extends StObject {
  
  def pull(): Unit = js.native
  def pull(opts: PartialPullOptions): Unit = js.native
}
