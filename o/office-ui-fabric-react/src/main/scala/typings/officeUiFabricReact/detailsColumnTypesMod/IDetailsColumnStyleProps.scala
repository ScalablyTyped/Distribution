package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.officeUiFabricReact.detailsRowTypesMod.ICellStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsColumn.types.IDetailsColumnProps, 'theme' | 'cellStyleProps'>> & {  headerClassName ? :string,   isActionable ? :boolean,   isEmpty ? :boolean,   isIconVisible ? :boolean,   isPadded ? :boolean,   isIconOnly ? :boolean,   iconClassName ? :string,   transitionDurationDrag ? :number,   transitionDurationDrop ? :number} */
trait IDetailsColumnStyleProps extends js.Object {
  var cellStyleProps: ICellStyleProps
  /**
    * Classname to provide for header region.
    */
  var headerClassName: js.UndefOr[String] = js.undefined
  /**
    * Classname to provide for the header's icon region.
    */
  var iconClassName: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the column is actionable.
    */
  var isActionable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the column contains contents.
    */
  var isEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the column has icon only content/
    */
  var isIconOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the column has a visible icon.
    */
  var isIconVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the column is padded.
    */
  var isPadded: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
  /**
    * CSS transition duration on drag event.
    */
  var transitionDurationDrag: js.UndefOr[Double] = js.undefined
  /**
    * CSS transition duration on drop event.
    */
  var transitionDurationDrop: js.UndefOr[Double] = js.undefined
}

object IDetailsColumnStyleProps {
  @scala.inline
  def apply(
    cellStyleProps: ICellStyleProps,
    theme: ITheme,
    headerClassName: String = null,
    iconClassName: String = null,
    isActionable: js.UndefOr[Boolean] = js.undefined,
    isEmpty: js.UndefOr[Boolean] = js.undefined,
    isIconOnly: js.UndefOr[Boolean] = js.undefined,
    isIconVisible: js.UndefOr[Boolean] = js.undefined,
    isPadded: js.UndefOr[Boolean] = js.undefined,
    transitionDurationDrag: Int | Double = null,
    transitionDurationDrop: Int | Double = null
  ): IDetailsColumnStyleProps = {
    val __obj = js.Dynamic.literal(cellStyleProps = cellStyleProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isActionable)) __obj.updateDynamic("isActionable")(isActionable.asInstanceOf[js.Any])
    if (!js.isUndefined(isEmpty)) __obj.updateDynamic("isEmpty")(isEmpty.asInstanceOf[js.Any])
    if (!js.isUndefined(isIconOnly)) __obj.updateDynamic("isIconOnly")(isIconOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(isIconVisible)) __obj.updateDynamic("isIconVisible")(isIconVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isPadded)) __obj.updateDynamic("isPadded")(isPadded.asInstanceOf[js.Any])
    if (transitionDurationDrag != null) __obj.updateDynamic("transitionDurationDrag")(transitionDurationDrag.asInstanceOf[js.Any])
    if (transitionDurationDrop != null) __obj.updateDynamic("transitionDurationDrop")(transitionDurationDrop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsColumnStyleProps]
  }
}

