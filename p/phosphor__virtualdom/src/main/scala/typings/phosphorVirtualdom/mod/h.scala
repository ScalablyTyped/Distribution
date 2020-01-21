package typings.phosphorVirtualdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/virtualdom", "h")
@js.native
object h extends js.Object {
  /**
    * A bound factory function for a specific `h()` tag.
    */
  @js.native
  trait IFactory extends js.Object {
    def apply(attrs: ElementAttrs, children: Child*): VirtualElement = js.native
    def apply(children: Child*): VirtualElement = js.native
  }
  
  val a: IFactory = js.native
  val abbr: IFactory = js.native
  val address: IFactory = js.native
  val area: IFactory = js.native
  val article: IFactory = js.native
  val aside: IFactory = js.native
  val audio: IFactory = js.native
  val b: IFactory = js.native
  val bdi: IFactory = js.native
  val bdo: IFactory = js.native
  val blockquote: IFactory = js.native
  val br: IFactory = js.native
  val button: IFactory = js.native
  val canvas: IFactory = js.native
  val caption: IFactory = js.native
  val cite: IFactory = js.native
  val code: IFactory = js.native
  val col: IFactory = js.native
  val colgroup: IFactory = js.native
  val data: IFactory = js.native
  val datalist: IFactory = js.native
  val dd: IFactory = js.native
  val del: IFactory = js.native
  val dfn: IFactory = js.native
  val div: IFactory = js.native
  val dl: IFactory = js.native
  val dt: IFactory = js.native
  val em: IFactory = js.native
  val embed: IFactory = js.native
  val fieldset: IFactory = js.native
  val figcaption: IFactory = js.native
  val figure: IFactory = js.native
  val footer: IFactory = js.native
  val form: IFactory = js.native
  val h1: IFactory = js.native
  val h2: IFactory = js.native
  val h3: IFactory = js.native
  val h4: IFactory = js.native
  val h5: IFactory = js.native
  val h6: IFactory = js.native
  val header: IFactory = js.native
  val hr: IFactory = js.native
  val i: IFactory = js.native
  val iframe: IFactory = js.native
  val img: IFactory = js.native
  val input: IFactory = js.native
  val ins: IFactory = js.native
  val kbd: IFactory = js.native
  val label: IFactory = js.native
  val legend: IFactory = js.native
  val li: IFactory = js.native
  val main: IFactory = js.native
  val map: IFactory = js.native
  val mark: IFactory = js.native
  val meter: IFactory = js.native
  val nav: IFactory = js.native
  val noscript: IFactory = js.native
  val `object`: IFactory = js.native
  val ol: IFactory = js.native
  val optgroup: IFactory = js.native
  val option: IFactory = js.native
  val output: IFactory = js.native
  val p: IFactory = js.native
  val param: IFactory = js.native
  val pre: IFactory = js.native
  val progress: IFactory = js.native
  val q: IFactory = js.native
  val rp: IFactory = js.native
  val rt: IFactory = js.native
  val ruby: IFactory = js.native
  val s: IFactory = js.native
  val samp: IFactory = js.native
  val section: IFactory = js.native
  val select: IFactory = js.native
  val small: IFactory = js.native
  val source: IFactory = js.native
  val span: IFactory = js.native
  val strong: IFactory = js.native
  val sub: IFactory = js.native
  val summary: IFactory = js.native
  val sup: IFactory = js.native
  val table: IFactory = js.native
  val tbody: IFactory = js.native
  val td: IFactory = js.native
  val textarea: IFactory = js.native
  val tfoot: IFactory = js.native
  val th: IFactory = js.native
  val thead: IFactory = js.native
  val time: IFactory = js.native
  val title: IFactory = js.native
  val tr: IFactory = js.native
  val track: IFactory = js.native
  val u: IFactory = js.native
  val ul: IFactory = js.native
  @JSName("var_")
  val `var`: IFactory = js.native
  val video: IFactory = js.native
  val wbr: IFactory = js.native
  def apply(tag: String, attrs: ElementAttrs, children: Child*): VirtualElement = js.native
  def apply(tag: String, children: Child*): VirtualElement = js.native
  /**
    * A type alias for the supported child argument types.
    */
  type Child = String | VirtualNode | Null | (js.Array[String | VirtualNode | Null])
}

