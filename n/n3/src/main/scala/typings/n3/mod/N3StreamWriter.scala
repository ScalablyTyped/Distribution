package typings.n3.mod

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3StreamWriter[Q /* <: typings.rdfJs.mod.BaseQuad */]
  extends ReadableStream
     with WritableStream
     with Sink[Stream[Q], EventEmitter]

