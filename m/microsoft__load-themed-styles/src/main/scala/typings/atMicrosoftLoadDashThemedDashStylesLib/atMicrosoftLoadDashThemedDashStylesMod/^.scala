package typings
package atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@microsoft/load-themed-styles", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearStyles(): scala.Unit = js.native
  def clearStyles(
    option: atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ClearStyleOptions
  ): scala.Unit = js.native
  def configureLoadStyles(): scala.Unit = js.native
  def configureLoadStyles(
    loadStylesFn: js.Function2[
      /* processedStyles */ java.lang.String, 
      /* rawStyles */ js.UndefOr[
        java.lang.String | atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ThemableArray
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def configureRunMode(mode: atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.Mode): scala.Unit = js.native
  def detokenize(): js.UndefOr[java.lang.String] = js.native
  def detokenize(styles: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def flush(): scala.Unit = js.native
  def loadStyles(
    styles: atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ThemableArray
  ): scala.Unit = js.native
  def loadStyles(
    styles: atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ThemableArray,
    loadAsync: scala.Boolean
  ): scala.Unit = js.native
  def loadStyles(styles: java.lang.String): scala.Unit = js.native
  def loadStyles(styles: java.lang.String, loadAsync: scala.Boolean): scala.Unit = js.native
  def loadTheme(): scala.Unit = js.native
  def loadTheme(theme: atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ITheme): scala.Unit = js.native
  def splitStyles(styles: java.lang.String): atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ThemableArray = js.native
}

