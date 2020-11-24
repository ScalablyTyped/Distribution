package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojcompositeMod.ViewModelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  var metadata: typings.oracleOraclejet.ojcompositeMod.Metadata = js.native
  
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any = js.native
  
  var view: String = js.native
  
  def viewModel(param0: ViewModelContext): Unit | js.Object = js.native
}
object Metadata {
  
  @scala.inline
  def apply(
    metadata: typings.oracleOraclejet.ojcompositeMod.Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: typings.oracleOraclejet.ojcompositeMod.Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseFunction(value: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any): Self = this.set("parseFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: ViewModelContext => Unit | js.Object): Self = this.set("viewModel", js.Any.fromFunction1(value))
  }
}
