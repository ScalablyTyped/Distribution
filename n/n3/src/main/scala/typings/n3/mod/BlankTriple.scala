package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlankTriple[Q /* <: typings.rdfJs.mod.BaseQuad */] extends js.Object {
  var `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  var predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
}

object BlankTriple {
  @scala.inline
  def apply[Q /* <: typings.rdfJs.mod.BaseQuad */](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
  ): BlankTriple[Q] = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankTriple[Q]]
  }
}

