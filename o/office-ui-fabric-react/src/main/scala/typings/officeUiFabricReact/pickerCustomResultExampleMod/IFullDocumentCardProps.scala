package typings.officeUiFabricReact.pickerCustomResultExampleMod

import typings.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps
import typings.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityProps
import typings.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewProps
import typings.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleProps
import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFullDocumentCardProps extends js.Object {
  var documentActionsProps: js.UndefOr[IDocumentCardActionsProps] = js.native
  var documentActivityProps: js.UndefOr[IDocumentCardActivityProps] = js.native
  var documentCardProps: js.UndefOr[IDocumentCardProps] = js.native
  var documentPreviewProps: js.UndefOr[IDocumentCardPreviewProps] = js.native
  var documentTitleProps: js.UndefOr[IDocumentCardTitleProps] = js.native
}

object IFullDocumentCardProps {
  @scala.inline
  def apply(): IFullDocumentCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullDocumentCardProps]
  }
  @scala.inline
  implicit class IFullDocumentCardPropsOps[Self <: IFullDocumentCardProps] (val x: Self) extends AnyVal {
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
    def setDocumentActionsProps(value: IDocumentCardActionsProps): Self = this.set("documentActionsProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentActionsProps: Self = this.set("documentActionsProps", js.undefined)
    @scala.inline
    def setDocumentActivityProps(value: IDocumentCardActivityProps): Self = this.set("documentActivityProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentActivityProps: Self = this.set("documentActivityProps", js.undefined)
    @scala.inline
    def setDocumentCardProps(value: IDocumentCardProps): Self = this.set("documentCardProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentCardProps: Self = this.set("documentCardProps", js.undefined)
    @scala.inline
    def setDocumentPreviewProps(value: IDocumentCardPreviewProps): Self = this.set("documentPreviewProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentPreviewProps: Self = this.set("documentPreviewProps", js.undefined)
    @scala.inline
    def setDocumentTitleProps(value: IDocumentCardTitleProps): Self = this.set("documentTitleProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentTitleProps: Self = this.set("documentTitleProps", js.undefined)
  }
  
}

