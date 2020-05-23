package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIButtonStyles
import typings.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typings.officeUiFabricReact.anon.PartialIComboBoxStyles
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.styles", JSImport.Namespace)
@js.native
object comboBoxStylesMod extends js.Object {
  def getCaretDownButtonStyles(theme: ITheme): IButtonStyles = js.native
  def getCaretDownButtonStyles(theme: ITheme, customStyles: PartialIButtonStyles): IButtonStyles = js.native
  def getOptionStyles(theme: ITheme): PartialIComboBoxOptionSty = js.native
  def getOptionStyles(theme: ITheme, customStylesForAllOptions: PartialIComboBoxOptionSty): PartialIComboBoxOptionSty = js.native
  def getOptionStyles(
    theme: ITheme,
    customStylesForAllOptions: PartialIComboBoxOptionSty,
    customOptionStylesForCurrentOption: PartialIComboBoxOptionSty
  ): PartialIComboBoxOptionSty = js.native
  def getOptionStyles(
    theme: ITheme,
    customStylesForAllOptions: PartialIComboBoxOptionSty,
    customOptionStylesForCurrentOption: PartialIComboBoxOptionSty,
    isPending: Boolean
  ): PartialIComboBoxOptionSty = js.native
  def getOptionStyles(
    theme: ITheme,
    customStylesForAllOptions: PartialIComboBoxOptionSty,
    customOptionStylesForCurrentOption: PartialIComboBoxOptionSty,
    isPending: Boolean,
    isHidden: Boolean
  ): PartialIComboBoxOptionSty = js.native
  def getStyles(theme: ITheme): PartialIComboBoxStyles = js.native
  def getStyles(theme: ITheme, customStyles: PartialIComboBoxStyles): PartialIComboBoxStyles = js.native
  def getStyles(theme: ITheme, customStyles: PartialIComboBoxStyles, comboBoxOptionWidth: String): PartialIComboBoxStyles = js.native
}

