package typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConversionList extends js.Object {
  
  /** The conversions being requested. */
  var conversion: js.UndefOr[js.Array[Conversion]] = js.native
  
  /** Identifies this as a ConversionList resource. Value: the fixed string doubleclicksearch#conversionList. */
  var kind: js.UndefOr[String] = js.native
}
object ConversionList {
  
  @scala.inline
  def apply(): ConversionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionList]
  }
  
  @scala.inline
  implicit class ConversionListOps[Self <: ConversionList] (val x: Self) extends AnyVal {
    
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
    def setConversionVarargs(value: Conversion*): Self = this.set("conversion", js.Array(value :_*))
    
    @scala.inline
    def setConversion(value: js.Array[Conversion]): Self = this.set("conversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversion: Self = this.set("conversion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
