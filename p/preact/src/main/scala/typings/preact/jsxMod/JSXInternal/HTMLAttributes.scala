package typings.preact.jsxMod.JSXInternal

import org.scalablytyped.runtime.StringDictionary
import typings.preact.mod.ClassAttributes
import typings.preact.preactStrings.`lazy`
import typings.preact.preactStrings.auto
import typings.preact.preactStrings.eager
import typings.preact.preactStrings.ltr
import typings.preact.preactStrings.rtl
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAttributes[RefType /* <: EventTarget */]
  extends ClassAttributes[RefType]
     with DOMAttributes[RefType] {
  // RDFa Attributes
  var about: js.UndefOr[String] = js.native
  // Standard HTML Attributes
  var accept: js.UndefOr[String] = js.native
  var acceptCharset: js.UndefOr[String] = js.native
  var accessKey: js.UndefOr[String] = js.native
  var action: js.UndefOr[String] = js.native
  var allowFullScreen: js.UndefOr[Boolean] = js.native
  var allowTransparency: js.UndefOr[Boolean] = js.native
  var alt: js.UndefOr[String] = js.native
  var as: js.UndefOr[String] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoCorrect: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Boolean] = js.native
  var autocomplete: js.UndefOr[String] = js.native
  var autocorrect: js.UndefOr[String] = js.native
  var autofocus: js.UndefOr[Boolean] = js.native
  var capture: js.UndefOr[Boolean] = js.native
  var cellPadding: js.UndefOr[Double | String] = js.native
  var cellSpacing: js.UndefOr[Double | String] = js.native
  var challenge: js.UndefOr[String] = js.native
  var charSet: js.UndefOr[String] = js.native
  var checked: js.UndefOr[Boolean] = js.native
  var `class`: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var colSpan: js.UndefOr[Double] = js.native
  var cols: js.UndefOr[Double] = js.native
  var content: js.UndefOr[String] = js.native
  var contentEditable: js.UndefOr[Boolean] = js.native
  var contextMenu: js.UndefOr[String] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var controlsList: js.UndefOr[String] = js.native
  var coords: js.UndefOr[String] = js.native
  var crossOrigin: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var datatype: js.UndefOr[String] = js.native
  var dateTime: js.UndefOr[String] = js.native
  var default: js.UndefOr[Boolean] = js.native
  var defer: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[auto | rtl | ltr] = js.native
  var disableRemotePlayback: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var download: js.UndefOr[js.Any] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var encType: js.UndefOr[String] = js.native
  var `for`: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var formAction: js.UndefOr[String] = js.native
  var formEncType: js.UndefOr[String] = js.native
  var formMethod: js.UndefOr[String] = js.native
  var formNoValidate: js.UndefOr[Boolean] = js.native
  var formTarget: js.UndefOr[String] = js.native
  var frameBorder: js.UndefOr[Double | String] = js.native
  var headers: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var high: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var hrefLang: js.UndefOr[String] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var httpEquiv: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var inlist: js.UndefOr[js.Any] = js.native
  var inputMode: js.UndefOr[String] = js.native
  var integrity: js.UndefOr[String] = js.native
  var is: js.UndefOr[String] = js.native
  var itemID: js.UndefOr[String] = js.native
  // Microdata Attributes
  var itemProp: js.UndefOr[String] = js.native
  var itemRef: js.UndefOr[String] = js.native
  var itemScope: js.UndefOr[Boolean] = js.native
  var itemType: js.UndefOr[String] = js.native
  var keyParams: js.UndefOr[String] = js.native
  var keyType: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var list: js.UndefOr[String] = js.native
  var loading: js.UndefOr[eager | `lazy`] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var low: js.UndefOr[Double] = js.native
  var manifest: js.UndefOr[String] = js.native
  var marginHeight: js.UndefOr[Double] = js.native
  var marginWidth: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double | String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var media: js.UndefOr[String] = js.native
  var mediaGroup: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var min: js.UndefOr[Double | String] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var nonce: js.UndefOr[String] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var optimum: js.UndefOr[Double] = js.native
  var pattern: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var playsInline: js.UndefOr[Boolean] = js.native
  var poster: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var preload: js.UndefOr[String] = js.native
  var property: js.UndefOr[String] = js.native
  var radioGroup: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var rel: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var resource: js.UndefOr[String] = js.native
  var role: js.UndefOr[String] = js.native
  var rowSpan: js.UndefOr[Double] = js.native
  var rows: js.UndefOr[Double] = js.native
  var sandbox: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var scrolling: js.UndefOr[String] = js.native
  var seamless: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var shape: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var sizes: js.UndefOr[String] = js.native
  var slot: js.UndefOr[String] = js.native
  var span: js.UndefOr[Double] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var src: js.UndefOr[String] = js.native
  var srcDoc: js.UndefOr[String] = js.native
  var srcLang: js.UndefOr[String] = js.native
  var srcSet: js.UndefOr[String] = js.native
  var srcset: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double | String] = js.native
  var style: js.UndefOr[String | (StringDictionary[String | Double])] = js.native
  var summary: js.UndefOr[String] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var typeof: js.UndefOr[String] = js.native
  var useMap: js.UndefOr[String] = js.native
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
  var vocab: js.UndefOr[String] = js.native
  var volume: js.UndefOr[String | Double] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var wmode: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[String] = js.native
}

object HTMLAttributes {
  @scala.inline
  def apply[/* <: typings.std.EventTarget */ RefType](): HTMLAttributes[RefType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[RefType]]
  }
  @scala.inline
  implicit class HTMLAttributesOps[Self <: HTMLAttributes[_], /* <: typings.std.EventTarget */ RefType] (val x: Self with HTMLAttributes[RefType]) extends AnyVal {
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
    def setAbout(value: String): Self = this.set("about", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbout: Self = this.set("about", js.undefined)
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setAcceptCharset(value: String): Self = this.set("acceptCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceptCharset: Self = this.set("acceptCharset", js.undefined)
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAllowFullScreen(value: Boolean): Self = this.set("allowFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFullScreen: Self = this.set("allowFullScreen", js.undefined)
    @scala.inline
    def setAllowTransparency(value: Boolean): Self = this.set("allowTransparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransparency: Self = this.set("allowTransparency", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    @scala.inline
    def setAutoCorrect(value: String): Self = this.set("autoCorrect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCorrect: Self = this.set("autoCorrect", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setCapture(value: Boolean): Self = this.set("capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    @scala.inline
    def setCellPadding(value: Double | String): Self = this.set("cellPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellPadding: Self = this.set("cellPadding", js.undefined)
    @scala.inline
    def setCellSpacing(value: Double | String): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    @scala.inline
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallenge: Self = this.set("challenge", js.undefined)
    @scala.inline
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColSpan(value: Double): Self = this.set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSpan: Self = this.set("colSpan", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentEditable(value: Boolean): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentEditable: Self = this.set("contentEditable", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setControlsList(value: String): Self = this.set("controlsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlsList: Self = this.set("controlsList", js.undefined)
    @scala.inline
    def setCoords(value: String): Self = this.set("coords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDatatype(value: String): Self = this.set("datatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatatype: Self = this.set("datatype", js.undefined)
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    @scala.inline
    def setDir(value: auto | rtl | ltr): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisableRemotePlayback(value: Boolean): Self = this.set("disableRemotePlayback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableRemotePlayback: Self = this.set("disableRemotePlayback", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDownload(value: js.Any): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEncType(value: String): Self = this.set("encType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncType: Self = this.set("encType", js.undefined)
    @scala.inline
    def setFor(value: String): Self = this.set("for", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormAction(value: String): Self = this.set("formAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormAction: Self = this.set("formAction", js.undefined)
    @scala.inline
    def setFormEncType(value: String): Self = this.set("formEncType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormEncType: Self = this.set("formEncType", js.undefined)
    @scala.inline
    def setFormMethod(value: String): Self = this.set("formMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormMethod: Self = this.set("formMethod", js.undefined)
    @scala.inline
    def setFormNoValidate(value: Boolean): Self = this.set("formNoValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormNoValidate: Self = this.set("formNoValidate", js.undefined)
    @scala.inline
    def setFormTarget(value: String): Self = this.set("formTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormTarget: Self = this.set("formTarget", js.undefined)
    @scala.inline
    def setFrameBorder(value: Double | String): Self = this.set("frameBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameBorder: Self = this.set("frameBorder", js.undefined)
    @scala.inline
    def setHeaders(value: String): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefLang(value: String): Self = this.set("hrefLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrefLang: Self = this.set("hrefLang", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setHttpEquiv(value: String): Self = this.set("httpEquiv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEquiv: Self = this.set("httpEquiv", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlist(value: js.Any): Self = this.set("inlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlist: Self = this.set("inlist", js.undefined)
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputMode: Self = this.set("inputMode", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    @scala.inline
    def setItemID(value: String): Self = this.set("itemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemID: Self = this.set("itemID", js.undefined)
    @scala.inline
    def setItemProp(value: String): Self = this.set("itemProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProp: Self = this.set("itemProp", js.undefined)
    @scala.inline
    def setItemRef(value: String): Self = this.set("itemRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    @scala.inline
    def setItemScope(value: Boolean): Self = this.set("itemScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemScope: Self = this.set("itemScope", js.undefined)
    @scala.inline
    def setItemType(value: String): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemType: Self = this.set("itemType", js.undefined)
    @scala.inline
    def setKeyParams(value: String): Self = this.set("keyParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyParams: Self = this.set("keyParams", js.undefined)
    @scala.inline
    def setKeyType(value: String): Self = this.set("keyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setList(value: String): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setLoading(value: eager | `lazy`): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setMarginHeight(value: Double): Self = this.set("marginHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginHeight: Self = this.set("marginHeight", js.undefined)
    @scala.inline
    def setMarginWidth(value: Double): Self = this.set("marginWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginWidth: Self = this.set("marginWidth", js.undefined)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMediaGroup(value: String): Self = this.set("mediaGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaGroup: Self = this.set("mediaGroup", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoValidate(value: Boolean): Self = this.set("noValidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidate: Self = this.set("noValidate", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptimum(value: Double): Self = this.set("optimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimum: Self = this.set("optimum", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreload(value: String): Self = this.set("preload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setRadioGroup(value: String): Self = this.set("radioGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioGroup: Self = this.set("radioGroup", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRel: Self = this.set("rel", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSandbox(value: String): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setScrolling(value: String): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeamless: Self = this.set("seamless", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlot: Self = this.set("slot", js.undefined)
    @scala.inline
    def setSpan(value: Double): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setSrcDoc(value: String): Self = this.set("srcDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcDoc: Self = this.set("srcDoc", js.undefined)
    @scala.inline
    def setSrcLang(value: String): Self = this.set("srcLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcLang: Self = this.set("srcLang", js.undefined)
    @scala.inline
    def setSrcSet(value: String): Self = this.set("srcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrcSet: Self = this.set("srcSet", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStep(value: Double | String): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: String | (StringDictionary[String | Double])): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeof(value: String): Self = this.set("typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeof: Self = this.set("typeof", js.undefined)
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVocab(value: String): Self = this.set("vocab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVocab: Self = this.set("vocab", js.undefined)
    @scala.inline
    def setVolume(value: String | Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

