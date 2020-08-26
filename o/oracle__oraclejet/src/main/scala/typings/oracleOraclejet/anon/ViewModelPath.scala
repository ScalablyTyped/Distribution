package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModelPath extends js.Object {
  var require: js.UndefOr[
    (js.Function1[/* module */ String, _]) | (js.Function3[
      /* modules */ js.Array[String], 
      /* ready */ js.UndefOr[js.Any], 
      /* errback */ js.UndefOr[js.Any], 
      Unit
    ])
  ] = js.native
  var viewModelPath: String = js.native
}

object ViewModelPath {
  @scala.inline
  def apply(viewModelPath: String): ViewModelPath = {
    val __obj = js.Dynamic.literal(viewModelPath = viewModelPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewModelPath]
  }
  @scala.inline
  implicit class ViewModelPathOps[Self <: ViewModelPath] (val x: Self) extends AnyVal {
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
    def setViewModelPath(value: String): Self = this.set("viewModelPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequireFunction1(value: /* module */ String => _): Self = this.set("require", js.Any.fromFunction1(value))
    @scala.inline
    def setRequireFunction3(
      value: (/* modules */ js.Array[String], /* ready */ js.UndefOr[js.Any], /* errback */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("require", js.Any.fromFunction3(value))
    @scala.inline
    def setRequire(
      value: (js.Function1[/* module */ String, _]) | (js.Function3[
          /* modules */ js.Array[String], 
          /* ready */ js.UndefOr[js.Any], 
          /* errback */ js.UndefOr[js.Any], 
          Unit
        ])
    ): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
  }
  
}

