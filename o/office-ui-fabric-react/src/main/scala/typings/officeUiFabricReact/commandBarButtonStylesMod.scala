package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarButtonStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/CommandBarButton/CommandBarButton.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(theme: ITheme): IButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: Unit, focusInset: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], focusInset.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: Unit, focusInset: String, focusColor: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], focusInset.asInstanceOf[js.Any], focusColor.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: Unit, focusInset: Unit, focusColor: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], focusInset.asInstanceOf[js.Any], focusColor.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: IButtonStyles): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: IButtonStyles, focusInset: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], focusInset.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: IButtonStyles, focusInset: String, focusColor: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], focusInset.asInstanceOf[js.Any], focusColor.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  @scala.inline
  def getStyles(theme: ITheme, customStyles: IButtonStyles, focusInset: Unit, focusColor: String): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any], focusInset.asInstanceOf[js.Any], focusColor.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
}
