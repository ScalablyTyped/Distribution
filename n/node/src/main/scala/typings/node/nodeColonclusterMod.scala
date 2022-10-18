package typings.node

import org.scalablytyped.runtime.Shortcut
import typings.node.clusterMod.Cluster
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonclusterMod extends Shortcut {
  
  @JSImport("node:cluster", JSImport.Default)
  @js.native
  val default: Cluster = js.native
  
  @JSImport("node:cluster", "Worker")
  @js.native
  open class Worker () extends StObject {
    def this(options: EventEmitterOptions) = this()
  }
  
  type _To = Cluster
  
  /* This means you don't have to write `default`, but can instead just say `nodeColonclusterMod.foo` */
  override def _to: Cluster = default
}
