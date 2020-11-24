package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayBuffer
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("opentype.js", "Font")
@js.native
class Font protected () extends js.Object {
  def this(options: FontConstructorOptions) = this()
  
  var ascender: Double = js.native
  
  def charToGlyph(c: String): Glyph = js.native
  
  def charToGlyphIndex(s: String): Double = js.native
  
  var createdTimestamp: Double = js.native
  
  val defaultRenderOptions: RenderOptions = js.native
  
  var descender: Double = js.native
  
  def download(): Unit = js.native
  def download(fileName: String): Unit = js.native
  
  def draw(ctx: CanvasRenderingContext2D, text: String): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double
  ): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, text: String, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double
  ): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, text: String, x: Double): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double
  ): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, fontSize: Double): Unit = js.native
  def draw(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  
  def drawMetrics(ctx: CanvasRenderingContext2D, text: String): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double
  ): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, text: String, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double
  ): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, text: String, x: Double): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double
  ): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawMetrics(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, fontSize: Double): Unit = js.native
  def drawMetrics(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  
  def drawPoints(ctx: CanvasRenderingContext2D, text: String): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double
  ): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, text: String, x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double
  ): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, text: String, x: Double): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double
  ): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions
  ): Unit = js.native
  def drawPoints(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, fontSize: Double): Unit = js.native
  def drawPoints(
    ctx: CanvasRenderingContext2D,
    text: String,
    x: Double,
    y: Double,
    fontSize: Double,
    options: RenderOptions
  ): Unit = js.native
  
  var encoding: Encoding = js.native
  
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    fontSize: Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    fontSize: Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: Double,
    fontSize: js.UndefOr[scala.Nothing],
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: Double,
    fontSize: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  def forEachGlyph(
    text: String,
    x: Double,
    y: Double,
    fontSize: Double,
    options: RenderOptions,
    callback: js.Function5[
      /* glyph */ Glyph, 
      /* x */ Double, 
      /* y */ Double, 
      /* fontSize */ Double, 
      /* options */ js.UndefOr[RenderOptions], 
      Unit
    ]
  ): Double = js.native
  
  def getAdvanceWidth(text: String): Double = js.native
  def getAdvanceWidth(text: String, fontSize: js.UndefOr[scala.Nothing], options: RenderOptions): Double = js.native
  def getAdvanceWidth(text: String, fontSize: Double): Double = js.native
  def getAdvanceWidth(text: String, fontSize: Double, options: RenderOptions): Double = js.native
  
  def getEnglishName(name: String): String = js.native
  
  def getKerningValue(leftGlyph: Double, rightGlyph: Double): Double = js.native
  def getKerningValue(leftGlyph: Double, rightGlyph: Glyph): Double = js.native
  def getKerningValue(leftGlyph: Glyph, rightGlyph: Double): Double = js.native
  def getKerningValue(leftGlyph: Glyph, rightGlyph: Glyph): Double = js.native
  
  def getPath(text: String, x: Double, y: Double, fontSize: Double): Path = js.native
  def getPath(text: String, x: Double, y: Double, fontSize: Double, options: RenderOptions): Path = js.native
  
  def getPaths(text: String, x: Double, y: Double, fontSize: Double): js.Array[Path] = js.native
  def getPaths(text: String, x: Double, y: Double, fontSize: Double, options: RenderOptions): js.Array[Path] = js.native
  
  def glyphIndexToName(gid: Double): String = js.native
  
  var glyphNames: GlyphNames = js.native
  
  var glyphs: GlyphSet = js.native
  
  def hasChar(c: String): Boolean = js.native
  
  var kerningPairs: KerningPairs = js.native
  
  def nameToGlyph(name: String): Glyph = js.native
  
  def nameToGlyphIndex(name: String): Double = js.native
  
  var names: FontNames = js.native
  
  var numGlyphs: Double = js.native
  
  var numberOfHMetrics: Double = js.native
  
  var outlinesFormat: String = js.native
  
  def stringToGlyphs(s: String): js.Array[Glyph] = js.native
  
  def substitution(font: Font): js.Any = js.native
  @JSName("substitution")
  var substitution_Original: Substitution = js.native
  
  var supported: Boolean = js.native
  
  var tables: StringDictionary[Table] = js.native
  
  def toArrayBuffer(): ArrayBuffer = js.native
  
  def toBuffer(): ArrayBuffer = js.native
  
  def toTables(): Table = js.native
  
  var unitsPerEm: Double = js.native
  
  def validate(): Unit = js.native
}
