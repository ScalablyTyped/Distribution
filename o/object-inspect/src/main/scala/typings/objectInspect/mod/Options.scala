package typings.objectInspect.mod

import typings.objectInspect.objectInspectStrings.Charactertabulation
import typings.objectInspect.objectInspectStrings.double
import typings.objectInspect.objectInspectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inspection options
  */
@js.native
trait Options extends js.Object {
  
  /**
    * When true, a custom inspect method function will be invoked. Default true.
    */
  var customInspect: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum depth of the inspection. Default: `5`.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * Must be "\t", null, or a positive integer. Default null.
    */
  var indent: js.UndefOr[Double | Charactertabulation | Null] = js.native
  
  /**
    * Must be 0, a positive integer, Infinity, or null, if present. Default Infinity.
    */
  var maxStringLength: js.UndefOr[Double | Null] = js.native
  
  /**
    * Must be "single" or "double", if present.
    */
  var quoteStyle: js.UndefOr[single | double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCustomInspect(value: Boolean): Self = this.set("customInspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomInspect: Self = this.set("customInspect", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setIndent(value: Double | Charactertabulation): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setIndentNull: Self = this.set("indent", null)
    
    @scala.inline
    def setMaxStringLength(value: Double): Self = this.set("maxStringLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStringLength: Self = this.set("maxStringLength", js.undefined)
    
    @scala.inline
    def setMaxStringLengthNull: Self = this.set("maxStringLength", null)
    
    @scala.inline
    def setQuoteStyle(value: single | double): Self = this.set("quoteStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteStyle: Self = this.set("quoteStyle", js.undefined)
  }
}
