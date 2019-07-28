package typings.n3.n3Mod

import typings.node.NodeJSNs.ReadWriteStream
import typings.rdfDashJs.rdfDashJsMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamWriter[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */]
  extends ReadWriteStream
     with Source[Q]

