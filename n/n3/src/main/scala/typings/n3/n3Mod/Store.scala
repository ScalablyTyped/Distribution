package typings.n3.n3Mod

import typings.node.eventsMod.EventEmitter
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Store")
@js.native
class Store[Q_RDF /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */] () extends N3Store[Q_RDF, Q_N3] {
  def this(triples: js.Array[Q_RDF]) = this()
  def this(triples: js.Array[Q_RDF], options: StoreOptions) = this()
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  /* CompleteClass */
  override def `import`(stream: Stream[Q_RDF]): EventEmitter = js.native
}

