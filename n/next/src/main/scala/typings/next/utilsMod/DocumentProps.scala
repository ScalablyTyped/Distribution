package typings.next.utilsMod

import typings.next.loadComponentsMod.ManifestItem
import typings.next.nextBooleans.`false`
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next.next/dist/next-server/lib/utils.DocumentInitialProps & {  __NEXT_DATA__  :next.next/dist/next-server/lib/utils.NEXT_DATA,   dangerousAsPath  :string,   ampPath  :string,   inAmpMode  :boolean,   hybridAmp  :boolean,   staticMarkup  :boolean,   isDevelopment  :boolean,   devFiles  :std.Array<string>,   files  :std.Array<string>,   lowPriorityFiles  :std.Array<string>,   polyfillFiles  :std.Array<string>,   dynamicImports  :std.Array<next.next/dist/next-server/server/load-components.ManifestItem>,   assetPrefix ? :string,   canonicalBase  :string,   htmlProps  :any,   bodyTags  :std.Array<any>,   headTags  :std.Array<any>,   unstable_runtimeJS ? :false} */
trait DocumentProps extends js.Object {
  var __NEXT_DATA__ : NEXT_DATA
  var ampPath: String
  var assetPrefix: js.UndefOr[String] = js.undefined
  var bodyTags: js.Array[_]
  var canonicalBase: String
  var dangerousAsPath: String
  var devFiles: js.Array[String]
  var dynamicImports: js.Array[ManifestItem]
  var files: js.Array[String]
  var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
  var headTags: js.Array[_]
  var html: String
  var htmlProps: js.Any
  var hybridAmp: Boolean
  var inAmpMode: Boolean
  var isDevelopment: Boolean
  var lowPriorityFiles: js.Array[String]
  var polyfillFiles: js.Array[String]
  var staticMarkup: Boolean
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.undefined
  var unstable_runtimeJS: js.UndefOr[`false`] = js.undefined
}

object DocumentProps {
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
    headTags: js.Array[_],
    html: String,
    htmlProps: js.Any,
    hybridAmp: Boolean,
    inAmpMode: Boolean,
    isDevelopment: Boolean,
    lowPriorityFiles: js.Array[String],
    polyfillFiles: js.Array[String],
    staticMarkup: Boolean,
    assetPrefix: String = null,
    head: js.Array[Element | Null] = null,
    styles: js.Array[ReactElement] | ReactFragment = null,
    unstable_runtimeJS: `false` = null
  ): DocumentProps = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], bodyTags = bodyTags.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], htmlProps = htmlProps.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any], lowPriorityFiles = lowPriorityFiles.asInstanceOf[js.Any], polyfillFiles = polyfillFiles.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (unstable_runtimeJS != null) __obj.updateDynamic("unstable_runtimeJS")(unstable_runtimeJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
}

