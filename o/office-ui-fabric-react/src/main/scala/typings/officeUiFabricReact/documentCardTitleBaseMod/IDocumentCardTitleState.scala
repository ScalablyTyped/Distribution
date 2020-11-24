package typings.officeUiFabricReact.documentCardTitleBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardTitleState extends js.Object {
  
  var clientWidth: js.UndefOr[Double] = js.native
  
  /**
    * In measuring, it will render a same style text with whiteSpace: 'nowrap', to get overflow rate.
    * So that the logic can predict truncated text well.
    */
  var needMeasurement: Boolean = js.native
  
  var previousTitle: String = js.native
  
  var truncatedTitleFirstPiece: js.UndefOr[String] = js.native
  
  var truncatedTitleSecondPiece: js.UndefOr[String] = js.native
}
object IDocumentCardTitleState {
  
  @scala.inline
  def apply(needMeasurement: Boolean, previousTitle: String): IDocumentCardTitleState = {
    val __obj = js.Dynamic.literal(needMeasurement = needMeasurement.asInstanceOf[js.Any], previousTitle = previousTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleState]
  }
  
  @scala.inline
  implicit class IDocumentCardTitleStateOps[Self <: IDocumentCardTitleState] (val x: Self) extends AnyVal {
    
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
    def setNeedMeasurement(value: Boolean): Self = this.set("needMeasurement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTitle(value: String): Self = this.set("previousTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientWidth: Self = this.set("clientWidth", js.undefined)
    
    @scala.inline
    def setTruncatedTitleFirstPiece(value: String): Self = this.set("truncatedTitleFirstPiece", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncatedTitleFirstPiece: Self = this.set("truncatedTitleFirstPiece", js.undefined)
    
    @scala.inline
    def setTruncatedTitleSecondPiece(value: String): Self = this.set("truncatedTitleSecondPiece", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncatedTitleSecondPiece: Self = this.set("truncatedTitleSecondPiece", js.undefined)
  }
}
