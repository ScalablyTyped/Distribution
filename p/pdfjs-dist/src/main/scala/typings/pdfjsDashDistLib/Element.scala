package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends ChildNode
     with ParentNode
     with NonDocumentTypeChildNode
     with Slotable
     with Animatable {
  val attributes: NamedNodeMap = js.native
  /**
    * Allows for manipulation of element's class content attribute as a
    * set of whitespace-separated tokens through a DOMTokenList object.
    */
  val classList: DOMTokenList = js.native
  /**
    * Returns the value of element's class content attribute. Can be set
    * to change it.
    */
  var className: java.lang.String = js.native
  val clientHeight: scala.Double = js.native
  val clientLeft: scala.Double = js.native
  val clientTop: scala.Double = js.native
  val clientWidth: scala.Double = js.native
  /**
    * Returns the value of element's id content attribute. Can be set to
    * change it.
    */
  var id: java.lang.String = js.native
  var innerHTML: java.lang.String = js.native
  /**
    * Returns the local name.
    */
  val localName: java.lang.String = js.native
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var outerHTML: java.lang.String = js.native
  /**
    * Returns the namespace prefix.
    */
  val prefix: java.lang.String | scala.Null = js.native
  val scrollHeight: scala.Double = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  val scrollWidth: scala.Double = js.native
  /**
    * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
    */
  val shadowRoot: ShadowRoot | scala.Null = js.native
  /**
    * Returns the value of element's slot content attribute. Can be set to
    * change it.
    */
  var slot: java.lang.String = js.native
  /**
    * Returns the HTML-uppercased qualified name.
    */
  val tagName: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Creates a shadow root for element and returns it.
    */
  def attachShadow(shadowRootInitDict: ShadowRootInit): ShadowRoot = js.native
  def closest(selector: java.lang.String): Element | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_a(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_abbr(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_address(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.address): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_applet(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_area(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_article(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.article): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_aside(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_audio(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_b(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.b): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_base(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_basefont(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_bdo(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_blockquote(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_body(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_br(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_button(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_canvas(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_caption(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("closest")
  def closest_circle(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_cite(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_clipPath(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_code(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.code): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_col(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_colgroup(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_data(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_datalist(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dd(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_defs(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_del(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("closest")
  def closest_desc(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_details(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dfn(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dialog(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dir(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_div(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dl(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dt(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_ellipse(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_em(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.em): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_embed(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("closest")
  def closest_feBlend(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("closest")
  def closest_feColorMatrix(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComponentTransfer(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComposite(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feConvolveMatrix(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDiffuseLighting(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDisplacementMap(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDistantLight(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFlood(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncA(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncB(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncG(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncR(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("closest")
  def closest_feGaussianBlur(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("closest")
  def closest_feImage(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMerge(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMergeNode(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMorphology(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("closest")
  def closest_feOffset(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("closest")
  def closest_fePointLight(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpecularLighting(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpotLight(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTile(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTurbulence(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_fieldset(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_figcaption(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_figure(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_filter(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_font(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_footer(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_foreignObject(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_form(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_frame(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_frameset(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("closest")
  def closest_g(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.g): SVGGElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h1(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h2(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h3(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h4(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h5(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h6(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_head(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_header(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.header): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_hgroup(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_hr(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_html(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_i(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.i): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_iframe(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("closest")
  def closest_image(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_img(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_input(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ins(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_kbd(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_label(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_legend(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_li(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("closest")
  def closest_line(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("closest")
  def closest_linearGradient(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_link(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_map(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_mark(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_marker(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_marquee(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("closest")
  def closest_mask(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_menu(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_meta(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("closest")
  def closest_metadata(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_meter(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_nav(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_noscript(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_object(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ol(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_optgroup(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_option(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_output(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_p(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_param(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("closest")
  def closest_path(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("closest")
  def closest_pattern(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_picture(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("closest")
  def closest_polygon(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("closest")
  def closest_polyline(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_pre(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_progress(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_q(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("closest")
  def closest_radialGradient(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("closest")
  def closest_rect(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_rt(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ruby(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_s(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.s): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_samp(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_script(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_section(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.section): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_select(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_slot(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_small(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.small): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_source(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_span(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("closest")
  def closest_stop(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_strong(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_style(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_sub(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_sup(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_svg(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("closest")
  def closest_switch(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("closest")
  def closest_symbol(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_table(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_tbody(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_td(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_template(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("closest")
  def closest_text(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("closest")
  def closest_textPath(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_textarea(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_tfoot(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_th(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_thead(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_time(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_title(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_tr(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_track(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("closest")
  def closest_tspan(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_u(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.u): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ul(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("closest")
  def closest_use(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_var(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_video(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("closest")
  def closest_view(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_wbr(selector: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr): HTMLElement | scala.Null = js.native
  /**
    * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
    */
  def getAttribute(qualifiedName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is
    * no such attribute otherwise.
    */
  def getAttributeNS(namespace: java.lang.String, localName: java.lang.String): java.lang.String | scala.Null = js.native
  def getAttributeNS(namespace: scala.Null, localName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Returns the qualified names of all element's attributes.
    * Can contain duplicates.
    */
  def getAttributeNames(): js.Array[java.lang.String] = js.native
  def getAttributeNode(name: java.lang.String): Attr | scala.Null = js.native
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr | scala.Null = js.native
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
  def getClientRects(): ClientRectList | DOMRectList = js.native
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    localName: java.lang.String
  ): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(
    namespaceURI: pdfjsDashDistLib.pdfjsDashDistLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    localName: java.lang.String
  ): HTMLCollectionOf[SVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_embed(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feBlend(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feColorMatrix(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComponentTransfer(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComposite(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feConvolveMatrix(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDiffuseLighting(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDisplacementMap(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDistantLight(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFlood(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncA(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncB(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncG(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncR(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feGaussianBlur(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feImage(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMerge(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMergeNode(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMorphology(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feOffset(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fePointLight(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpecularLighting(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpotLight(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTile(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTile): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTurbulence(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
    */
  def hasAttribute(qualifiedName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if element has an attribute whose namespace is namespace and local name is localName.
    */
  def hasAttributeNS(namespace: java.lang.String, localName: java.lang.String): scala.Boolean = js.native
  def hasAttributeNS(namespace: scala.Null, localName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if element has attributes, and false otherwise.
    */
  def hasAttributes(): scala.Boolean = js.native
  def hasPointerCapture(pointerId: scala.Double): scala.Boolean = js.native
  def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | scala.Null = js.native
  def insertAdjacentHTML(where: InsertPosition, html: java.lang.String): scala.Unit = js.native
  def insertAdjacentText(where: InsertPosition, text: java.lang.String): scala.Unit = js.native
  /**
    * Returns true if matching selectors against element's root yields element, and false otherwise.
    */
  def matches(selectors: java.lang.String): scala.Boolean = js.native
  def msGetRegionContent(): js.Any = js.native
  def releasePointerCapture(pointerId: scala.Double): scala.Unit = js.native
  /**
    * Removes element's first attribute whose qualified name is qualifiedName.
    */
  def removeAttribute(qualifiedName: java.lang.String): scala.Unit = js.native
  /**
    * Removes element's attribute whose namespace is namespace and local name is localName.
    */
  def removeAttributeNS(namespace: java.lang.String, localName: java.lang.String): scala.Unit = js.native
  def removeAttributeNS(namespace: scala.Null, localName: java.lang.String): scala.Unit = js.native
  def removeAttributeNode(attr: Attr): Attr = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Displays element fullscreen and resolves promise when done.
    */
  def requestFullscreen(): js.Promise[scala.Unit] = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(arg: ScrollIntoViewOptions): scala.Unit = js.native
  def scrollIntoView(arg: scala.Boolean): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(options: ScrollToOptions): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
    */
  def setAttribute(qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
    */
  def setAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNS(namespace: scala.Null, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNode(attr: Attr): Attr | scala.Null = js.native
  def setAttributeNodeNS(attr: Attr): Attr | scala.Null = js.native
  def setPointerCapture(pointerId: scala.Double): scala.Unit = js.native
  /**
    * If force is not given, "toggles" qualifiedName, removing it if it is
    * present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
    * Returns true if qualifiedName is now present, and false otherwise.
    */
  def toggleAttribute(qualifiedName: java.lang.String): scala.Boolean = js.native
  def toggleAttribute(qualifiedName: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
  def webkitMatchesSelector(selectors: java.lang.String): scala.Boolean = js.native
}

@JSGlobal("Element")
@js.native
object Element
  extends org.scalablytyped.runtime.Instantiable0[Element]

