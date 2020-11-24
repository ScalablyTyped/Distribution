package typings.nextServer.libUtilsMod

import typings.nextServer.nextServerBooleans.`true`
import typings.nextServer.renderMod.ManifestItem
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-server.next-server/dist/lib/utils.DocumentInitialProps & {  __NEXT_DATA__ :next-server.next-server/dist/lib/utils.NEXT_DATA,   dangerousAsPath :string,   ampPath :string,   inAmpMode :boolean,   hybridAmp :boolean,   staticMarkup :boolean,   devFiles :std.Array<string>,   files :std.Array<string>,   dynamicImports :std.Array<next-server.next-server/dist/server/render.ManifestItem>,   assetPrefix :string | undefined,   canonicalBase :string} */
@js.native
trait DocumentProps extends js.Object {
  
  var __NEXT_DATA__ : NEXT_DATA = js.native
  
  var ampPath: String = js.native
  
  var assetPrefix: js.UndefOr[String] = js.native
  
  var canonicalBase: String = js.native
  
  var dangerousAsPath: String = js.native
  
  var dataOnly: js.UndefOr[`true`] = js.native
  
  var devFiles: js.Array[String] = js.native
  
  var dynamicImports: js.Array[ManifestItem] = js.native
  
  var files: js.Array[String] = js.native
  
  var head: js.UndefOr[js.Array[Element | Null]] = js.native
  
  var html: String = js.native
  
  var hybridAmp: Boolean = js.native
  
  var inAmpMode: Boolean = js.native
  
  var staticMarkup: Boolean = js.native
  
  var styles: js.UndefOr[js.Array[ReactElement] | ReactFragment] = js.native
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
    staticMarkup: Boolean
  ): DocumentProps = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any], ampPath = ampPath.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], devFiles = devFiles.asInstanceOf[js.Any], dynamicImports = dynamicImports.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], hybridAmp = hybridAmp.asInstanceOf[js.Any], inAmpMode = inAmpMode.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentProps]
  }
  
  @scala.inline
  implicit class DocumentPropsOps[Self <: DocumentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__NEXT_DATA__(value: NEXT_DATA): Self = this.set("__NEXT_DATA__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmpPath(value: String): Self = this.set("ampPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalBase(value: String): Self = this.set("canonicalBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerousAsPath(value: String): Self = this.set("dangerousAsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevFilesVarargs(value: String*): Self = this.set("devFiles", js.Array(value :_*))
    
    @scala.inline
    def setDevFiles(value: js.Array[String]): Self = this.set("devFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicImportsVarargs(value: ManifestItem*): Self = this.set("dynamicImports", js.Array(value :_*))
    
    @scala.inline
    def setDynamicImports(value: js.Array[ManifestItem]): Self = this.set("dynamicImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHybridAmp(value: Boolean): Self = this.set("hybridAmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAmpMode(value: Boolean): Self = this.set("inAmpMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticMarkup(value: Boolean): Self = this.set("staticMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    
    @scala.inline
    def setDataOnly(value: `true`): Self = this.set("dataOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataOnly: Self = this.set("dataOnly", js.undefined)
    
    @scala.inline
    def setHeadVarargs(value: (Element | Null)*): Self = this.set("head", js.Array(value :_*))
    
    @scala.inline
    def setHead(value: js.Array[Element | Null]): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: ReactElement*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[ReactElement] | ReactFragment): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
