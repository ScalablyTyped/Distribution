package typings
package atMicrosoftLoadDashThemedDashStylesLib.loadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@microsoft/load-themed-styles", JSImport.Namespace)
@js.native
object loadDashThemedDashStylesModMembers extends js.Object {
  def clearStyles(): scala.Unit = js.native
  def clearStyles(option: ClearStyleOptions): scala.Unit = js.native
  def configureLoadStyles(): scala.Unit = js.native
  def configureLoadStyles(
    loadStylesFn: js.Function2[
      /* processedStyles */ java.lang.String, 
      /* rawStyles */ js.UndefOr[java.lang.String | ThemableArray], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def configureRunMode(mode: Mode): scala.Unit = js.native
  def detokenize(): js.UndefOr[java.lang.String] = js.native
  def detokenize(styles: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def flush(): scala.Unit = js.native
  def loadStyles(styles: ThemableArray): scala.Unit = js.native
  def loadStyles(styles: ThemableArray, loadAsync: scala.Boolean): scala.Unit = js.native
  def loadStyles(styles: java.lang.String): scala.Unit = js.native
  def loadStyles(styles: java.lang.String, loadAsync: scala.Boolean): scala.Unit = js.native
  def loadTheme(): scala.Unit = js.native
  def loadTheme(theme: ITheme): scala.Unit = js.native
  def splitStyles(styles: java.lang.String): ThemableArray = js.native
}

