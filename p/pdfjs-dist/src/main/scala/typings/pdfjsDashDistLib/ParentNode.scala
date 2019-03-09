package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentNode extends js.Object {
  val childElementCount: scala.Double = js.native
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection = js.native
  /**
    * Returns the first child that is an element, and null otherwise.
    */
  val firstElementChild: Element | scala.Null = js.native
  /**
    * Returns the last child that is an element, and null otherwise.
    */
  val lastElementChild: Element | scala.Null = js.native
  /**
    * Inserts nodes after the last child of node, while replacing
    * strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def append(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  /**
    * Inserts nodes before the first child of node, while
    * replacing strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def prepend(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  def querySelector[E /* <: Element */](selectors: java.lang.String): E | scala.Null = js.native
  def querySelectorAll[E /* <: Element */](selectors: java.lang.String): NodeListOf[E] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_a(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.a): NodeListOf[HTMLAnchorElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_abbr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_address(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.address): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_applet(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet): NodeListOf[HTMLAppletElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_area(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.area): NodeListOf[HTMLAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_article(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.article): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_aside(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_audio(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio): NodeListOf[HTMLAudioElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_b(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.b): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_base(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.base): NodeListOf[HTMLBaseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_basefont(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont): NodeListOf[HTMLBaseFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_bdo(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_blockquote(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote): NodeListOf[HTMLQuoteElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_body(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.body): NodeListOf[HTMLBodyElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_br(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.br): NodeListOf[HTMLBRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_button(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.button): NodeListOf[HTMLButtonElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_canvas(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas): NodeListOf[HTMLCanvasElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_caption(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption): NodeListOf[HTMLTableCaptionElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_circle(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.circle): NodeListOf[SVGCircleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_cite(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_clipPath(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.clipPath): NodeListOf[SVGClipPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_code(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.code): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_col(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.col): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_colgroup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_data(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.data): NodeListOf[HTMLDataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_datalist(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist): NodeListOf[HTMLDataListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dd(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_defs(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.defs): NodeListOf[SVGDefsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_del(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.del): NodeListOf[HTMLModElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_desc(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.desc): NodeListOf[SVGDescElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_details(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.details): NodeListOf[HTMLDetailsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dfn(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dialog(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog): NodeListOf[HTMLDialogElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dir(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir): NodeListOf[HTMLDirectoryElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_div(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.div): NodeListOf[HTMLDivElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dl(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl): NodeListOf[HTMLDListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dt(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_ellipse(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ellipse): NodeListOf[SVGEllipseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_em(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.em): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_embed(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed): NodeListOf[HTMLEmbedElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feBlend(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feBlend): NodeListOf[SVGFEBlendElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feColorMatrix(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feColorMatrix): NodeListOf[SVGFEColorMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComponentTransfer(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComponentTransfer): NodeListOf[SVGFEComponentTransferElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComposite(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComposite): NodeListOf[SVGFECompositeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feConvolveMatrix(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDiffuseLighting(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDisplacementMap(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDistantLight(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDistantLight): NodeListOf[SVGFEDistantLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFlood(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFlood): NodeListOf[SVGFEFloodElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncA(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncA): NodeListOf[SVGFEFuncAElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncB(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncB): NodeListOf[SVGFEFuncBElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncG(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncG): NodeListOf[SVGFEFuncGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncR(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncR): NodeListOf[SVGFEFuncRElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feGaussianBlur(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feImage(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feImage): NodeListOf[SVGFEImageElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMerge(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMerge): NodeListOf[SVGFEMergeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMergeNode(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMergeNode): NodeListOf[SVGFEMergeNodeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMorphology(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMorphology): NodeListOf[SVGFEMorphologyElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feOffset(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feOffset): NodeListOf[SVGFEOffsetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_fePointLight(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.fePointLight): NodeListOf[SVGFEPointLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpecularLighting(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpecularLighting): NodeListOf[SVGFESpecularLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpotLight(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpotLight): NodeListOf[SVGFESpotLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTile(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTile): NodeListOf[SVGFETileElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTurbulence(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTurbulence): NodeListOf[SVGFETurbulenceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_fieldset(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset): NodeListOf[HTMLFieldSetElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figcaption(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figure(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_filter(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.filter): NodeListOf[SVGFilterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_font(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.font): NodeListOf[HTMLFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_footer(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_foreignObject(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.foreignObject): NodeListOf[SVGForeignObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_form(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.form): NodeListOf[HTMLFormElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frame(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame): NodeListOf[HTMLFrameElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frameset(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset): NodeListOf[HTMLFrameSetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_g(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.g): NodeListOf[SVGGElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h1(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h2(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h3(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h4(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h5(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h6(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_head(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.head): NodeListOf[HTMLHeadElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_header(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.header): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hgroup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr): NodeListOf[HTMLHRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_html(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.html): NodeListOf[HTMLHtmlElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_i(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.i): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_iframe(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe): NodeListOf[HTMLIFrameElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_image(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.image): NodeListOf[SVGImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_img(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.img): NodeListOf[HTMLImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_input(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.input): NodeListOf[HTMLInputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ins(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins): NodeListOf[HTMLModElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_kbd(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_label(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.label): NodeListOf[HTMLLabelElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_legend(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend): NodeListOf[HTMLLegendElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_li(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.li): NodeListOf[HTMLLIElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_line(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.line): NodeListOf[SVGLineElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_linearGradient(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.linearGradient): NodeListOf[SVGLinearGradientElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_link(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.link): NodeListOf[HTMLLinkElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_map(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.map): NodeListOf[HTMLMapElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_mark(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_marker(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.marker): NodeListOf[SVGMarkerElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_marquee(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee): NodeListOf[HTMLMarqueeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_mask(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.mask): NodeListOf[SVGMaskElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_menu(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu): NodeListOf[HTMLMenuElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meta(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta): NodeListOf[HTMLMetaElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_metadata(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.metadata): NodeListOf[SVGMetadataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meter(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter): NodeListOf[HTMLMeterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_nav(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_noscript(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_object(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`): NodeListOf[HTMLObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ol(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol): NodeListOf[HTMLOListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_optgroup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup): NodeListOf[HTMLOptGroupElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_option(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.option): NodeListOf[HTMLOptionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_output(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.output): NodeListOf[HTMLOutputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_p(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.p): NodeListOf[HTMLParagraphElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_param(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.param): NodeListOf[HTMLParamElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_path(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.path): NodeListOf[SVGPathElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_pattern(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.pattern): NodeListOf[SVGPatternElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_picture(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture): NodeListOf[HTMLPictureElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polygon(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.polygon): NodeListOf[SVGPolygonElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polyline(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.polyline): NodeListOf[SVGPolylineElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_pre(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre): NodeListOf[HTMLPreElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_progress(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress): NodeListOf[HTMLProgressElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_q(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.q): NodeListOf[HTMLQuoteElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_radialGradient(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.radialGradient): NodeListOf[SVGRadialGradientElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_rect(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.rect): NodeListOf[SVGRectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_rt(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ruby(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_s(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.s): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_samp(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_script(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.script): NodeListOf[HTMLScriptElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_section(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.section): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_select(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.select): NodeListOf[HTMLSelectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_slot(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot): NodeListOf[HTMLSlotElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_small(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.small): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_source(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.source): NodeListOf[HTMLSourceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_span(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.span): NodeListOf[HTMLSpanElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_stop(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.stop): NodeListOf[SVGStopElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_strong(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_style(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.style): NodeListOf[HTMLStyleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sub(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_svg(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.svg): NodeListOf[SVGSVGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_switch(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.switch): NodeListOf[SVGSwitchElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_symbol(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.symbol): NodeListOf[SVGSymbolElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_table(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.table): NodeListOf[HTMLTableElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tbody(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_td(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.td): NodeListOf[HTMLTableDataCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_template(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.template): NodeListOf[HTMLTemplateElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_text(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.text): NodeListOf[SVGTextElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_textPath(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPath): NodeListOf[SVGTextPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_textarea(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea): NodeListOf[HTMLTextAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tfoot(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_th(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.th): NodeListOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_thead(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_time(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.time): NodeListOf[HTMLTimeElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_title(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.title): NodeListOf[HTMLTitleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr): NodeListOf[HTMLTableRowElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_track(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.track): NodeListOf[HTMLTrackElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_tspan(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tspan): NodeListOf[SVGTSpanElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_u(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.u): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ul(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul): NodeListOf[HTMLUListElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_use(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.use): NodeListOf[SVGUseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_var(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_video(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.video): NodeListOf[HTMLVideoElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_view(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.view): NodeListOf[SVGViewElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_wbr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_a(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_abbr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_address(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.address): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_applet(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_area(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_article(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.article): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_aside(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_audio(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_b(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.b): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_base(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_basefont(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_bdo(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_blockquote(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_body(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_br(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_button(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_canvas(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_caption(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_circle(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_cite(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_clipPath(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_code(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.code): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_col(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_colgroup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_data(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_datalist(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dd(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_defs(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_del(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_desc(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_details(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dfn(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dialog(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dir(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_div(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dl(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dt(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_ellipse(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_em(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.em): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_embed(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feBlend(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feColorMatrix(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComponentTransfer(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComposite(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feConvolveMatrix(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDiffuseLighting(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDisplacementMap(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDistantLight(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFlood(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncA(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncB(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncG(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncR(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feGaussianBlur(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feImage(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMerge(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMergeNode(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMorphology(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feOffset(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_fePointLight(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpecularLighting(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpotLight(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTile(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTurbulence(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_fieldset(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figcaption(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figure(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_filter(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_font(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_footer(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_foreignObject(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_form(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frame(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frameset(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_g(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.g): SVGGElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h1(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h2(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h3(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h4(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h5(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h6(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_head(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_header(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.header): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hgroup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_html(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_i(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.i): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_iframe(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_image(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_img(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_input(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ins(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_kbd(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_label(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_legend(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_li(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_line(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_linearGradient(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_link(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_map(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_mark(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_marker(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_marquee(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_mask(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_menu(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meta(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_metadata(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meter(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_nav(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_noscript(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_object(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ol(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_optgroup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_option(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_output(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_p(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_param(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_path(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_pattern(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_picture(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polygon(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polyline(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_pre(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_progress(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_q(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_radialGradient(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_rect(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_rt(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ruby(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_s(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.s): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_samp(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_script(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_section(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.section): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_select(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_slot(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_small(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.small): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_source(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_span(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_stop(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_strong(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_style(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sub(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sup(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_svg(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_switch(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_symbol(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_table(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tbody(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_td(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_template(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_text(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_textPath(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_textarea(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tfoot(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_th(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_thead(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_time(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_title(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_track(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_tspan(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_u(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.u): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ul(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_use(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_var(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_video(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_view(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_wbr(selectors: pdfjsDashDistLib.pdfjsDashDistLibStrings.wbr): HTMLElement | scala.Null = js.native
}

