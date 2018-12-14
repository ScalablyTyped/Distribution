package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "Font")
@js.native
class Font protected () extends js.Object {
  def this(options: FontConstructorOptions) = this()
  var ascender: scala.Double = js.native
  var createdTimestamp: scala.Double = js.native
  val defaultRenderOptions: RenderOptions = js.native
  var descender: scala.Double = js.native
  var encoding: Encoding = js.native
  var glyphNames: GlyphNames = js.native
  var glyphs: GlyphSet = js.native
  var kerningPairs: KerningPairs = js.native
  var names: FontNames = js.native
  var numGlyphs: scala.Double = js.native
  var numberOfHMetrics: scala.Double = js.native
  var outlinesFormat: java.lang.String = js.native
  @JSName("substitution")
  var substitution_Original: Substitution = js.native
  var supported: scala.Boolean = js.native
  var tables: org.scalablytyped.runtime.StringDictionary[Table] = js.native
  var unitsPerEm: scala.Double = js.native
  def charToGlyph(c: java.lang.String): Glyph = js.native
  def charToGlyphIndex(s: java.lang.String): scala.Double = js.native
  def download(): scala.Unit = js.native
  def download(fileName: java.lang.String): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String, x: scala.Double): scala.Unit = js.native
  def draw(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def draw(
    ctx: stdLib.CanvasRenderingContext2D,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double
  ): scala.Unit = js.native
  def draw(
    ctx: stdLib.CanvasRenderingContext2D,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String, x: scala.Double): scala.Unit = js.native
  def drawMetrics(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def drawMetrics(
    ctx: stdLib.CanvasRenderingContext2D,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double
  ): scala.Unit = js.native
  def drawMetrics(
    ctx: stdLib.CanvasRenderingContext2D,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String, x: scala.Double): scala.Unit = js.native
  def drawPoints(ctx: stdLib.CanvasRenderingContext2D, text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def drawPoints(
    ctx: stdLib.CanvasRenderingContext2D,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double
  ): scala.Unit = js.native
  def drawPoints(
    ctx: stdLib.CanvasRenderingContext2D,
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): scala.Unit = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: scala.Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: scala.Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: scala.Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: scala.Double,
    fontSize: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: js.UndefOr[scala.Nothing],
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: scala.Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def forEachGlyph(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* fontSize */ scala.Double, 
      /* options */ js.UndefOr[RenderOptions], 
      scala.Unit
    ]
  ): scala.Double = js.native
  def getAdvanceWidth(text: java.lang.String): scala.Double = js.native
  def getAdvanceWidth(text: java.lang.String, fontSize: scala.Double): scala.Double = js.native
  def getAdvanceWidth(text: java.lang.String, fontSize: scala.Double, options: RenderOptions): scala.Double = js.native
  def getEnglishName(name: java.lang.String): java.lang.String = js.native
  def getKerningValue(leftGlyph: Glyph, rightGlyph: Glyph): scala.Double = js.native
  def getKerningValue(leftGlyph: Glyph, rightGlyph: scala.Double): scala.Double = js.native
  def getKerningValue(leftGlyph: scala.Double, rightGlyph: Glyph): scala.Double = js.native
  def getKerningValue(leftGlyph: scala.Double, rightGlyph: scala.Double): scala.Double = js.native
  def getPath(text: java.lang.String, x: scala.Double, y: scala.Double, fontSize: scala.Double): Path = js.native
  def getPath(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): Path = js.native
  def getPaths(text: java.lang.String, x: scala.Double, y: scala.Double, fontSize: scala.Double): js.Array[Path] = js.native
  def getPaths(
    text: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    fontSize: scala.Double,
    options: RenderOptions
  ): js.Array[Path] = js.native
  def glyphIndexToName(gid: scala.Double): java.lang.String = js.native
  def hasChar(c: java.lang.String): scala.Boolean = js.native
  def nameToGlyph(name: java.lang.String): Glyph = js.native
  def nameToGlyphIndex(name: java.lang.String): scala.Double = js.native
  def stringToGlyphs(s: java.lang.String): js.Array[Glyph] = js.native
  def substitution(font: Font): js.Any = js.native
  def toArrayBuffer(): stdLib.ArrayBuffer = js.native
  def toBuffer(): stdLib.ArrayBuffer = js.native
  def toTables(): Table = js.native
  def validate(): scala.Unit = js.native
}

