package typings.nextServer.libUtilsMod

import typings.nextServer.nextServerBooleans.`true`
import typings.nextServer.renderMod.ManifestItem
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined next-server.next-server/dist/lib/utils.DocumentInitialProps & {  __NEXT_DATA__  :next-server.next-server/dist/lib/utils.NEXT_DATA,   dangerousAsPath  :string,   ampPath  :string,   inAmpMode  :boolean,   hybridAmp  :boolean,   staticMarkup  :boolean,   devFiles  :std.Array<string>,   files  :std.Array<string>,   dynamicImports  :std.Array<next-server.next-server/dist/server/render.ManifestItem>,   assetPrefix ? :string,   canonicalBase  :string} */
trait DocumentProps extends js.Object {
  var __NEXT_DATA__ : NEXT_DATA
  var ampPath: String
  var assetPrefix: js.UndefOr[String] = js.undefined
  var canonicalBase: String
  var dangerousAsPath: String
  var dataOnly: js.UndefOr[`true`] = js.undefined
  var devFiles: js.Array[String]
  var dynamicImports: js.Array[ManifestItem]
  var files: js.Array[String]
  var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
  var html: String
  var hybridAmp: Boolean
  var inAmpMode: Boolean
  var staticMarkup: Boolean
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.undefined
}

object DocumentProps {
  @scala.inline
  def apply(
    __NEXT_DATA__ : NEXT_DATA,
    ampPath: String,
    canonicalBase: String,
    dangerousAsPath: String,
    devFiles: js.Array[String],
    dynamicImports: js.Array[ManifestItem],
    files: js.Array[String],
    html: String,
    hybridAmp: Boolean,
    inAmpMode: Boolean,
    staticMarkup: Boolean,
    assetPrefix: String = null,
    dataOnly: `true` = null,
    head: js.Array[Element | Null] = null,
    styles: js.Array[ReactElement] | ReactFragment = null
  ): DocumentProps = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (dataOnly != null) __obj.updateDynamic("dataOnly")(dataOnly.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
}

