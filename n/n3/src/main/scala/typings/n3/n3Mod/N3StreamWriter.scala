package typings.n3.n3Mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.rdfDashJs.rdfDashJsMod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamWriter[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */]
  extends ReadableStream
     with WritableStream
     with Sink[Q]

