package typings
package overlayscrollbarsLib.overlayscrollbarsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayScrollbarsStatic extends js.Object {
  def apply(): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: JQuery): js.UndefOr[OverlayScrollbars] = js.native
  def apply(elements: js.Array[stdLib.Element]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[stdLib.Element], filter: java.lang.String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: js.Array[stdLib.Element],
    filter: js.Function2[/* element */ stdLib.Element, /* instance */ OverlayScrollbars, scala.Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[stdLib.Element], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: js.Array[stdLib.Element], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, filter: java.lang.String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: JQuery,
    filter: js.Function2[/* element */ stdLib.Element, /* instance */ OverlayScrollbars, scala.Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: JQuery, options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: stdLib.NodeListOf[stdLib.Element]): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: stdLib.NodeListOf[stdLib.Element], filter: java.lang.String): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(
    elements: stdLib.NodeListOf[stdLib.Element],
    filter: js.Function2[/* element */ stdLib.Element, /* instance */ OverlayScrollbars, scala.Boolean]
  ): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: stdLib.NodeListOf[stdLib.Element], options: Options): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(elements: stdLib.NodeListOf[stdLib.Element], options: Options, extensions: Extensions): js.UndefOr[OverlayScrollbars | js.Array[OverlayScrollbars]] = js.native
  def apply(element: stdLib.Element): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: stdLib.Element, options: Options): OverlayScrollbars = js.native
  def apply(element: stdLib.Element, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def apply(element: stdLib.HTMLElement): js.UndefOr[OverlayScrollbars] = js.native
  def apply(element: stdLib.HTMLElement, options: Options): OverlayScrollbars = js.native
  def apply(element: stdLib.HTMLElement, options: Options, extensions: Extensions): OverlayScrollbars = js.native
  def defaultOptions(): Options = js.native
  def defaultOptions(newDefaultOptions: Options): scala.Unit = js.native
  def extension(): overlayscrollbarsLib.Anon_Index = js.native
  def extension(extensionName: java.lang.String): ExtensionInfo = js.native
  def extension(
    extensionName: java.lang.String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ js.Any, 
      Extension
    ]
  ): scala.Unit = js.native
  def extension(
    extensionName: java.lang.String,
    extensionFactory: js.ThisFunction3[
      /* this */ OverlayScrollbars, 
      /* defaultOptions */ js.Object, 
      /* compatibility */ Compatibility, 
      /* framework */ js.Any, 
      Extension
    ],
    defaultOptions: js.Object
  ): scala.Unit = js.native
  @JSName("extension")
  def extension_Unit(extensionName: java.lang.String): scala.Unit = js.native
  def globals(): Globals = js.native
}

