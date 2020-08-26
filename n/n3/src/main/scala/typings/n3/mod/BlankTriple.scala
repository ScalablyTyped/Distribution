package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlankTriple[Q /* <: typings.rdfJs.mod.BaseQuad */] extends js.Object {
  var `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any = js.native
  var predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any = js.native
}

object BlankTriple {
  @scala.inline
  def apply[/* <: typings.rdfJs.mod.BaseQuad */ Q](
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
  ): BlankTriple[Q] = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlankTriple[Q]]
  }
  @scala.inline
  implicit class BlankTripleOps[Self <: BlankTriple[_], /* <: typings.rdfJs.mod.BaseQuad */ Q] (val x: Self with BlankTriple[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObject(value: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
    ): Self = this.set("predicate", value.asInstanceOf[js.Any])
  }
  
}

