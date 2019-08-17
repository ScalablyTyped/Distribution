package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaCoinProps extends IPersonaSharedProps {
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[js.Object]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaCoinStyleProps, IPersonaCoinStyles]] = js.undefined
}

object IPersonaCoinProps {
  @scala.inline
  def apply(
    IPersonaSharedProps: IPersonaSharedProps = null,
    className: String = null,
    componentRef: IRefObject[js.Object] = null,
    styles: IStyleFunctionOrObject[IPersonaCoinStyleProps, IPersonaCoinStyles] = null
  ): IPersonaCoinProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPersonaSharedProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaCoinProps]
  }
}

