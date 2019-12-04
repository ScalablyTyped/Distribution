package typings.officeDashUiDashFabricDashReact.libComponentsPickersExamplesPickerDotCustomResultDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActionsDotTypesMod.IDocumentCardActionsProps
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardActivityDotTypesMod.IDocumentCardActivityProps
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDotTypesMod.IDocumentCardProps
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardPreviewDotTypesMod.IDocumentCardPreviewProps
import typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardTitleDotTypesMod.IDocumentCardTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFullDocumentCardProps extends js.Object {
  var documentActionsProps: js.UndefOr[IDocumentCardActionsProps] = js.undefined
  var documentActivityProps: js.UndefOr[IDocumentCardActivityProps] = js.undefined
  var documentCardProps: js.UndefOr[IDocumentCardProps] = js.undefined
  var documentPreviewProps: js.UndefOr[IDocumentCardPreviewProps] = js.undefined
  var documentTitleProps: js.UndefOr[IDocumentCardTitleProps] = js.undefined
}

object IFullDocumentCardProps {
  @scala.inline
  def apply(
    documentActionsProps: IDocumentCardActionsProps = null,
    documentActivityProps: IDocumentCardActivityProps = null,
    documentCardProps: IDocumentCardProps = null,
    documentPreviewProps: IDocumentCardPreviewProps = null,
    documentTitleProps: IDocumentCardTitleProps = null
  ): IFullDocumentCardProps = {
    val __obj = js.Dynamic.literal()
    if (documentActionsProps != null) __obj.updateDynamic("documentActionsProps")(documentActionsProps.asInstanceOf[js.Any])
    if (documentActivityProps != null) __obj.updateDynamic("documentActivityProps")(documentActivityProps.asInstanceOf[js.Any])
    if (documentCardProps != null) __obj.updateDynamic("documentCardProps")(documentCardProps.asInstanceOf[js.Any])
    if (documentPreviewProps != null) __obj.updateDynamic("documentPreviewProps")(documentPreviewProps.asInstanceOf[js.Any])
    if (documentTitleProps != null) __obj.updateDynamic("documentTitleProps")(documentTitleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFullDocumentCardProps]
  }
}

