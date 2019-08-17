package typings.p5

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object p5Mod {
  import typings.p5.p5Numbers.`0x0000`
  import typings.p5.p5Numbers.`0x0001`
  import typings.p5.p5Numbers.`0x0002`
  import typings.p5.p5Numbers.`0x0003`
  import typings.p5.p5Numbers.`0x0004`
  import typings.p5.p5Numbers.`0x0005`
  import typings.p5.p5Numbers.`0x0006`
  import typings.p5.p5Strings.`color-burn`
  import typings.p5.p5Strings.`color-dodge`
  import typings.p5.p5Strings.`hard-light`
  import typings.p5.p5Strings.`soft-light`
  import typings.p5.p5Strings.`source-over`
  import typings.p5.p5Strings.alphabetic
  import typings.p5.p5Strings.arrow
  import typings.p5.p5Strings.audio
  import typings.p5.p5Strings.auto
  import typings.p5.p5Strings.axes
  import typings.p5.p5Strings.bevel
  import typings.p5.p5Strings.bezier
  import typings.p5.p5Strings.blur
  import typings.p5.p5Strings.bold
  import typings.p5.p5Strings.bolditalic
  import typings.p5.p5Strings.bottom
  import typings.p5.p5Strings.butt
  import typings.p5.p5Strings.center
  import typings.p5.p5Strings.chord
  import typings.p5.p5Strings.clamp
  import typings.p5.p5Strings.close
  import typings.p5.p5Strings.copy
  import typings.p5.p5Strings.corner
  import typings.p5.p5Strings.corners
  import typings.p5.p5Strings.cross
  import typings.p5.p5Strings.curve
  import typings.p5.p5Strings.darkest
  import typings.p5.p5Strings.degrees
  import typings.p5.p5Strings.difference
  import typings.p5.p5Strings.dilate
  import typings.p5.p5Strings.erode
  import typings.p5.p5Strings.exclusion
  import typings.p5.p5Strings.fill
  import typings.p5.p5Strings.gray
  import typings.p5.p5Strings.grid
  import typings.p5.p5Strings.hand
  import typings.p5.p5Strings.hsb
  import typings.p5.p5Strings.hsl
  import typings.p5.p5Strings.image
  import typings.p5.p5Strings.immediate
  import typings.p5.p5Strings.invert
  import typings.p5.p5Strings.italic
  import typings.p5.p5Strings.landscape
  import typings.p5.p5Strings.left
  import typings.p5.p5Strings.lighten
  import typings.p5.p5Strings.lighter
  import typings.p5.p5Strings.linear
  import typings.p5.p5Strings.mirror
  import typings.p5.p5Strings.miter
  import typings.p5.p5Strings.move
  import typings.p5.p5Strings.multiply
  import typings.p5.p5Strings.nearest
  import typings.p5.p5Strings.normal
  import typings.p5.p5Strings.opaque
  import typings.p5.p5Strings.open
  import typings.p5.p5Strings.overlay
  import typings.p5.p5Strings.p2d
  import typings.p5.p5Strings.pie
  import typings.p5.p5Strings.portrait
  import typings.p5.p5Strings.posterize
  import typings.p5.p5Strings.quad_strip
  import typings.p5.p5Strings.quadratic
  import typings.p5.p5Strings.quads
  import typings.p5.p5Strings.radians
  import typings.p5.p5Strings.radius
  import typings.p5.p5Strings.repeat
  import typings.p5.p5Strings.rgb
  import typings.p5.p5Strings.right
  import typings.p5.p5Strings.round
  import typings.p5.p5Strings.screen
  import typings.p5.p5Strings.square
  import typings.p5.p5Strings.stroke
  import typings.p5.p5Strings.subtract
  import typings.p5.p5Strings.text
  import typings.p5.p5Strings.texture
  import typings.p5.p5Strings.threshold
  import typings.p5.p5Strings.top
  import typings.p5.p5Strings.video
  import typings.p5.p5Strings.wait
  import typings.p5.p5Strings.webgl

  type ADD = lighter
  type ANGLE_MODE = RADIANS | DEGREES
  type ARC_MODE = CHORD | PIE | OPEN
  type ARROW = arrow
  type AUDIO = audio
  type AUTO = auto
  type AXES = axes
  type BASELINE = alphabetic
  type BEGIN_KIND = POINTS | LINES | TRIANGLES | TRIANGLE_FAN | TRIANGLE_STRIP | QUADS | QUAD_STRIP
  type BEVEL = bevel
  type BEZIER = bezier
  type BLEND = `source-over`
  type BLEND_MODE = BLEND | DARKEST | LIGHTEST | DIFFERENCE | MULTIPLY | EXCLUSION | SCREEN | REPLACE | OVERLAY | HARD_LIGHT | SOFT_LIGHT | DODGE | BURN | ADD | NORMAL
  type BLUR = blur
  type BOLD = bold
  type BOLDITALIC = bolditalic
  type BOTTOM = bottom
  type BURN = `color-burn`
  type BandPass = Filter
  type CENTER = center
  type CHORD = chord
  type CLAMP = clamp
  type CLOSE = close
  type COLOR_MODE = RGB | HSB | HSL
  type CORNER = corner
  type CORNERS = corners
  type CROSS = cross
  type CURSOR_TYPE = ARROW | CROSS | HAND | MOVE | TEXT
  type CURVE = curve
  type DARKEST = darkest
  type DEBUG_MODE = GRID | AXES
  type DEGREES = degrees
  type DIFFERENCE = difference
  type DILATE = dilate
  type DODGE = `color-dodge`
  type ELLIPSE_MODE = CENTER | RADIUS | CORNER | CORNERS
  type END_MODE = CLOSE
  type ERODE = erode
  type EXCLUSION = exclusion
  type FILL = fill
  type FILTER_TYPE = THRESHOLD | GRAY | OPAQUE | INVERT | POSTERIZE | BLUR | ERODE | DILATE
  type GRAPHICS_RENDERER = P2D | WEBGL
  type GRAY = gray
  type GRID = grid
  // Work-around for p5.Graphics inheriting from both p5 and p5.Element
  type Graphics = __Graphics__ with typings.p5.p5Mod.p5
  type HAND = hand
  type HARD_LIGHT = `hard-light`
  type HORIZ_ALIGN = LEFT | CENTER | RIGHT
  type HSB = hsb
  type HSL = hsl
  type HighPass = Filter
  type IMAGE = image
  type IMAGE_MODE = CORNER | CORNERS | CENTER
  type IMMEDIATE = immediate
  type INVERT = invert
  type ITALIC = italic
  type LANDSCAPE = landscape
  type LEFT = left
  type LIGHTEST = lighten
  type LINEAR = linear
  type LINES = `0x0001`
  type LINE_LOOP = `0x0002`
  type LINE_STRIP = `0x0003`
  type LowPass = Filter
  type MIRROR = mirror
  type MITER = miter
  type MOVE = move
  type MULTIPLY = multiply
  type NEAREST = nearest
  type NORMAL = normal
  type OPAQUE = opaque
  type OPEN = open
  type OVERLAY = overlay
  type P2D = p2d
  type PIE = pie
  type POINTS = `0x0000`
  type PORTRAIT = portrait
  type POSTERIZE = posterize
  type PROJECT = square
  type QUADRATIC = quadratic
  type QUADS = quads
  type QUAD_STRIP = quad_strip
  type RADIANS = radians
  type RADIUS = radius
  type RECT_MODE = CORNER | CORNERS | CENTER | RADIUS
  type RENDERER = P2D | WEBGL
  type REPEAT = repeat
  type REPLACE = copy
  type RGB = rgb
  type RIGHT = right
  type ROUND = round
  type Renderer = Element
  type SCREEN = screen
  type SIZE_H = AUTO
  type SIZE_W = AUTO
  type SOFT_LIGHT = `soft-light`
  type SQUARE = butt
  type STROKE = stroke
  type STROKE_CAP = SQUARE | PROJECT | ROUND
  type STROKE_JOIN = MITER | BEVEL | ROUND
  type SUBTRACT = subtract
  type SawOsc = Oscillator
  type SinOsc = Oscillator
  type SqrOsc = Oscillator
  type StringDict = TypedDict
  type TEXT = text
  type TEXTURE = texture
  type TEXTURE_MODE = IMAGE | NORMAL
  type THE_STYLE = NORMAL | ITALIC | BOLD | BOLDITALIC
  type THRESHOLD = threshold
  type TOP = top
  type TRIANGLES = `0x0004`
  type TRIANGLE_FAN = `0x0006`
  type TRIANGLE_STRIP = `0x0005`
  type TYPE = VIDEO | AUDIO
  type TriOsc = Oscillator
  type UNKNOWN_P5_CONSTANT = js.Any
  type VERT_ALIGN = TOP | BOTTOM | CENTER | BASELINE
  type VIDEO = video
  type WAIT = wait
  type WEBGL = webgl
  type WRAP_X = CLAMP | REPEAT | MIRROR
  type WRAP_Y = CLAMP | REPEAT | MIRROR
}
