package typings.node.clusterMod

import typings.node.nodeStrings.listening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cluster", "prependListener")
@js.native
object prependListener_listening extends js.Object {
  def apply(event: listening, listener: js.Function2[/* worker */ Worker_, /* address */ Address, Unit]): Cluster = js.native
}

