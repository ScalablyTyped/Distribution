package typings.next

import typings.next.distNextDashServerLibUtilsMod.NEXT_DATA
import typings.next.distNextDashServerServerRenderMod.ManifestItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AmpPath extends js.Object {
  var __NEXT_DATA__ : NEXT_DATA
  var ampPath: String
  var assetPrefix: js.UndefOr[String] = js.undefined
  var bodyTags: js.Array[_]
  var canonicalBase: String
  var dangerousAsPath: String
  var devFiles: js.Array[String]
  var dynamicImports: js.Array[ManifestItem]
  var files: js.Array[String]
  var hasCssMode: Boolean
  var headTags: js.Array[_]
  var htmlProps: js.Any
  var hybridAmp: Boolean
  var inAmpMode: Boolean
  var isDevelopment: Boolean
  var polyfillFiles: js.Array[String]
  var staticMarkup: Boolean
}

object Anon_AmpPath {
  @scala.inline
  def apply(
    __NEXT_DATA__ : NEXT_DATA,
    ampPath: String,
    bodyTags: js.Array[_],
    canonicalBase: String,
    dangerousAsPath: String,
    devFiles: js.Array[String],
    dynamicImports: js.Array[ManifestItem],
    files: js.Array[String],
    hasCssMode: Boolean,
    headTags: js.Array[_],
    htmlProps: js.Any,
    hybridAmp: Boolean,
    inAmpMode: Boolean,
    isDevelopment: Boolean,
    polyfillFiles: js.Array[String],
    staticMarkup: Boolean,
    assetPrefix: String = null
  ): Anon_AmpPath = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], bodyTags = bodyTags.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], hasCssMode = hasCssMode.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], htmlProps = htmlProps.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any], polyfillFiles = polyfillFiles.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AmpPath]
  }
}

