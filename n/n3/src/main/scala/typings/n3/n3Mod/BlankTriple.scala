package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlankTriple[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */] extends js.Object {
  var `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
  var predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any
}

object BlankTriple {
  @scala.inline
  def apply[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */](
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any
  ): BlankTriple[Q] = {
    val __obj = js.Dynamic.literal(predicate = predicate)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[BlankTriple[Q]]
  }
}

