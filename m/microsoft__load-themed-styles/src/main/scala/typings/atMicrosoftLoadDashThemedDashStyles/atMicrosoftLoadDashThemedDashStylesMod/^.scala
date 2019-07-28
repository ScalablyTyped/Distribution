package typings.atMicrosoftLoadDashThemedDashStyles.atMicrosoftLoadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@microsoft/load-themed-styles", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clearStyles(): Unit = js.native
  def clearStyles(option: ClearStyleOptions): Unit = js.native
  def configureLoadStyles(): Unit = js.native
  def configureLoadStyles(
    loadStylesFn: js.Function2[
      /* processedStyles */ String, 
      /* rawStyles */ js.UndefOr[String | ThemableArray], 
      Unit
    ]
  ): Unit = js.native
  def configureRunMode(mode: Mode): Unit = js.native
  def detokenize(): js.UndefOr[String] = js.native
  def detokenize(styles: String): js.UndefOr[String] = js.native
  def flush(): Unit = js.native
  def loadStyles(styles: String): Unit = js.native
  def loadStyles(styles: String, loadAsync: Boolean): Unit = js.native
  def loadStyles(styles: ThemableArray): Unit = js.native
  def loadStyles(styles: ThemableArray, loadAsync: Boolean): Unit = js.native
  def loadTheme(): Unit = js.native
  def loadTheme(theme: ITheme): Unit = js.native
  def splitStyles(styles: String): ThemableArray = js.native
}

