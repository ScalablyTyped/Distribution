package typings.mdv.anon

import typings.mdv.mdvBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mdv.mdv.Options & {  warnings :true} */
@js.native
trait Optionswarningstrue extends js.Object {
  
  /**
    * save intermediary html
    * @default false
    */
  var save: js.UndefOr[Boolean] = js.native
  
  /**
    * markdown document path
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * enable warnings
    * @default false
    */
  var warnings: js.UndefOr[Boolean] with `true` = js.native
}
object Optionswarningstrue {
  
  @scala.inline
  def apply(warnings: js.UndefOr[Boolean] with `true`): Optionswarningstrue = {
    val __obj = js.Dynamic.literal(warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionswarningstrue]
  }
  
  @scala.inline
  implicit class OptionswarningstrueOps[Self <: Optionswarningstrue] (val x: Self) extends AnyVal {
    
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
    def setWarnings(value: js.UndefOr[Boolean] with `true`): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: Boolean): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
