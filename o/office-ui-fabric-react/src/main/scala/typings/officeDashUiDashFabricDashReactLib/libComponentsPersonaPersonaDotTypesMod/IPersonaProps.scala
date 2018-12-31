package typings
package officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaProps extends IPersonaSharedProps {
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IPersona]] = js.undefined
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IPersonaProps]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]
  ] = js.undefined
}

