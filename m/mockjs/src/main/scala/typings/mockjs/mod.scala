package typings.mockjs

import org.scalablytyped.runtime.StringDictionary
import typings.mockjs.mockjsStrings.lower
import typings.mockjs.mockjsStrings.number
import typings.mockjs.mockjsStrings.symbol
import typings.mockjs.mockjsStrings.upper
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mockjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mockjs", "Random")
  @js.native
  def Random: MockjsRandom = js.native
  @scala.inline
  def Random_=(x: MockjsRandom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Random")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "mock")
  @js.native
  def mock: MockjsMock = js.native
  @scala.inline
  def mock_=(x: MockjsMock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mock")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "setup")
  @js.native
  def setup: MockjsSetup = js.native
  @scala.inline
  def setup_=(x: MockjsSetup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "toJSONSchema")
  @js.native
  def toJSONSchema: MockjsToJSONSchema = js.native
  @scala.inline
  def toJSONSchema_=(x: MockjsToJSONSchema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSONSchema")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "valid")
  @js.native
  def valid: MockjsValid = js.native
  @scala.inline
  def valid_=(x: MockjsValid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "version")
  @js.native
  def version: Double = js.native
  @scala.inline
  def version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  type B = Boolean
  
  // Interface for global namespace 'Mockjs'
  @js.native
  trait Mockjs extends StObject {
    
    var Random: MockjsRandom = js.native
    
    def mock(rurl: S, rtype: S, template: js.Any): Mockjs = js.native
    def mock(rurl: S, template: js.Any): Mockjs = js.native
    def mock(rurl: RegExp, rtype: S, template: js.Any): Mockjs = js.native
    def mock(rurl: RegExp, template: js.Any): Mockjs = js.native
    def mock(template: js.Any): js.Any = js.native
    @JSName("mock")
    var mock_Original: MockjsMock = js.native
    
    def setup(settings: MockjsSetupSettings): Unit = js.native
    @JSName("setup")
    var setup_Original: MockjsSetup = js.native
    
    def toJSONSchema(template: js.Any): MockjsToJSONSchemaRs = js.native
    @JSName("toJSONSchema")
    var toJSONSchema_Original: MockjsToJSONSchema = js.native
    
    def valid(template: js.Any, data: js.Any): js.Array[MockjsValidRsItem] = js.native
    @JSName("valid")
    var valid_Original: MockjsValid = js.native
    
    var version: Double = js.native
  }
  
  // Mockjs.mock()
  // see https://github.com/nuysoft/Mock/wiki/Mock.mock()
  @js.native
  trait MockjsMock extends StObject {
    
    def apply(rurl: S, rtype: S, template: js.Any): Mockjs = js.native
    def apply(rurl: S, template: js.Any): Mockjs = js.native
    def apply(rurl: RegExp, rtype: S, template: js.Any): Mockjs = js.native
    def apply(rurl: RegExp, template: js.Any): Mockjs = js.native
    def apply(template: js.Any): js.Any = js.native
  }
  
  // Mockjs.Random
  // see https://github.com/nuysoft/Mock/wiki/Mock.Random
  @js.native
  trait MockjsRandom
    extends MockjsRandomExtendOption
       with MockjsRandomBasic
       with MockjsRandomDate
       with MockjsRandomImage
       with MockjsRandomColor
       with MockjsRandomAddress
       with MockjsRandomHelper
       with MockjsRandomMiscellaneous
       with MockjsRandomName
       with MockjsRandomText
       with MockjsRandomWeb {
    
    // Random.extend
    def extend(extendOption: MockjsRandomExtendOption): MockjsRandom = js.native
  }
  
  // Mockjs.Random - Address
  // see https://github.com/nuysoft/Mock/wiki/Address
  @js.native
  trait MockjsRandomAddress extends StObject {
    
    // Random.city
    def city(): S = js.native
    def city(prefix: B): S = js.native
    
    // Random.county
    def county(): S = js.native
    def county(prefix: B): S = js.native
    
    // Random.province
    def province(): S = js.native
    
    // Random.region
    def region(): S = js.native
    
    // Random.zip
    def zip(): S = js.native
    def zip(prefix: B): S = js.native
  }
  
  // Mockjs.Random - Basic
  // see https://github.com/nuysoft/Mock/wiki/Basic
  @js.native
  trait MockjsRandomBasic extends StObject {
    
    def boolean(): B = js.native
    // Random.boolean
    def boolean(min: N, max: N, current: B): B = js.native
    
    def character(): S = js.native
    def character(pool: S): S = js.native
    // Random.character
    @JSName("character")
    def character_lower(pool: lower): S = js.native
    @JSName("character")
    def character_number(pool: number): S = js.native
    @JSName("character")
    def character_symbol(pool: symbol): S = js.native
    @JSName("character")
    def character_upper(pool: upper): S = js.native
    
    // Random.float
    def float(): N = js.native
    def float(
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      dmin: js.UndefOr[scala.Nothing],
      dmax: N
    ): N = js.native
    def float(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dmin: N): N = js.native
    def float(min: js.UndefOr[scala.Nothing], max: js.UndefOr[scala.Nothing], dmin: N, dmax: N): N = js.native
    def float(min: js.UndefOr[scala.Nothing], max: N): N = js.native
    def float(min: js.UndefOr[scala.Nothing], max: N, dmin: js.UndefOr[scala.Nothing], dmax: N): N = js.native
    def float(min: js.UndefOr[scala.Nothing], max: N, dmin: N): N = js.native
    def float(min: js.UndefOr[scala.Nothing], max: N, dmin: N, dmax: N): N = js.native
    def float(min: N): N = js.native
    def float(min: N, max: js.UndefOr[scala.Nothing], dmin: js.UndefOr[scala.Nothing], dmax: N): N = js.native
    def float(min: N, max: js.UndefOr[scala.Nothing], dmin: N): N = js.native
    def float(min: N, max: js.UndefOr[scala.Nothing], dmin: N, dmax: N): N = js.native
    def float(min: N, max: N): N = js.native
    def float(min: N, max: N, dmin: js.UndefOr[scala.Nothing], dmax: N): N = js.native
    def float(min: N, max: N, dmin: N): N = js.native
    def float(min: N, max: N, dmin: N, dmax: N): N = js.native
    
    // Random.integer
    def integer(): N = js.native
    def integer(min: js.UndefOr[scala.Nothing], max: N): N = js.native
    def integer(min: N): N = js.native
    def integer(min: N, max: N): N = js.native
    
    // Random.natural
    def natural(): N = js.native
    def natural(min: js.UndefOr[scala.Nothing], max: N): N = js.native
    def natural(min: N): N = js.native
    def natural(min: N, max: N): N = js.native
    
    // Random.range
    def range(): N = js.native
    def range(start: js.UndefOr[scala.Nothing], stop: js.UndefOr[scala.Nothing], step: N): N = js.native
    def range(start: js.UndefOr[scala.Nothing], stop: N): N = js.native
    def range(start: js.UndefOr[scala.Nothing], stop: N, step: N): N = js.native
    def range(start: N): N = js.native
    def range(start: N, stop: js.UndefOr[scala.Nothing], step: N): N = js.native
    def range(start: N, stop: N): N = js.native
    def range(start: N, stop: N, step: N): N = js.native
    
    // Random.string
    def string(): S = js.native
    def string(pool: js.UndefOr[scala.Nothing], min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def string(pool: js.UndefOr[scala.Nothing], min: N): S = js.native
    def string(pool: js.UndefOr[scala.Nothing], min: N, max: N): S = js.native
    def string(pool: N): S = js.native
    def string(pool: N, min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def string(pool: N, min: N): S = js.native
    def string(pool: N, min: N, max: N): S = js.native
    def string(pool: S): S = js.native
    def string(pool: S, min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def string(pool: S, min: N): S = js.native
    def string(pool: S, min: N, max: N): S = js.native
  }
  
  // Mockjs.Random - Color
  // see https://github.com/nuysoft/Mock/wiki/Color
  @js.native
  trait MockjsRandomColor extends StObject {
    
    // Random.color
    def color(): S = js.native
    
    // Random.hex
    def hex(): S = js.native
    
    // Random.hsl
    def hsl(): S = js.native
    
    // Random.rgb
    def rgb(): S = js.native
    
    // Random.rgba
    def rgba(): S = js.native
  }
  object MockjsRandomColor {
    
    @scala.inline
    def apply(color: () => S, hex: () => S, hsl: () => S, rgb: () => S, rgba: () => S): MockjsRandomColor = {
      val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), hex = js.Any.fromFunction0(hex), hsl = js.Any.fromFunction0(hsl), rgb = js.Any.fromFunction0(rgb), rgba = js.Any.fromFunction0(rgba))
      __obj.asInstanceOf[MockjsRandomColor]
    }
    
    @scala.inline
    implicit class MockjsRandomColorMutableBuilder[Self <: MockjsRandomColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: () => S): Self = StObject.set(x, "color", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHex(value: () => S): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHsl(value: () => S): Self = StObject.set(x, "hsl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRgb(value: () => S): Self = StObject.set(x, "rgb", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRgba(value: () => S): Self = StObject.set(x, "rgba", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MockjsRandomDate extends StObject {
    
    // Random.date
    def date(): S = js.native
    def date(format: S): S = js.native
    
    // Random.datetime
    def datetime(): S = js.native
    def datetime(format: S): S = js.native
    
    def mow(): S = js.native
    def mow(format: S): S = js.native
    
    // Random.now
    def now(util: RandomDateUtilString): S = js.native
    def now(util: RandomDateUtilString, format: S): S = js.native
    
    // Random.time
    def time(): S = js.native
    def time(format: S): S = js.native
  }
  
  type MockjsRandomExtendOption = StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  // Mockjs.Random - Helper
  // see https://github.com/nuysoft/Mock/wiki/Helper
  @js.native
  trait MockjsRandomHelper extends StObject {
    
    // Random.capitalize
    def capitalize(word: S): S = js.native
    
    // Random.lower
    def lower(str: S): S = js.native
    
    // Random.pick
    def pick(arr: js.Array[_]): js.Any = js.native
    
    // Random.shuffle
    def shuffle(arr: js.Array[_]): js.Array[_] = js.native
    
    // Random.upper
    def upper(str: S): S = js.native
  }
  object MockjsRandomHelper {
    
    @scala.inline
    def apply(
      capitalize: S => S,
      lower: S => S,
      pick: js.Array[_] => js.Any,
      shuffle: js.Array[_] => js.Array[_],
      upper: S => S
    ): MockjsRandomHelper = {
      val __obj = js.Dynamic.literal(capitalize = js.Any.fromFunction1(capitalize), lower = js.Any.fromFunction1(lower), pick = js.Any.fromFunction1(pick), shuffle = js.Any.fromFunction1(shuffle), upper = js.Any.fromFunction1(upper))
      __obj.asInstanceOf[MockjsRandomHelper]
    }
    
    @scala.inline
    implicit class MockjsRandomHelperMutableBuilder[Self <: MockjsRandomHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapitalize(value: S => S): Self = StObject.set(x, "capitalize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLower(value: S => S): Self = StObject.set(x, "lower", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPick(value: js.Array[_] => js.Any): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShuffle(value: js.Array[_] => js.Array[_]): Self = StObject.set(x, "shuffle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpper(value: S => S): Self = StObject.set(x, "upper", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MockjsRandomImage extends StObject {
    
    // Random.dataImage
    def dataImage(): S = js.native
    def dataImage(size: js.UndefOr[scala.Nothing], text: S): S = js.native
    def dataImage(size: S): S = js.native
    def dataImage(size: S, text: S): S = js.native
    
    // Random.image
    def image(): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: S
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: S,
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: js.UndefOr[scala.Nothing], foreground: S): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: S,
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: S,
      format: RandomImageFormatString
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: S,
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: js.UndefOr[scala.Nothing], foreground: S, format: S): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: js.UndefOr[scala.Nothing],
      foreground: S,
      format: S,
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: S): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: S,
      foreground: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: S,
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString
    ): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: S,
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: S, foreground: js.UndefOr[scala.Nothing], format: S): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: S,
      foreground: js.UndefOr[scala.Nothing],
      format: S,
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: S, foreground: S): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: S,
      foreground: S,
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: S, foreground: S, format: RandomImageFormatString): S = js.native
    def image(
      size: js.UndefOr[scala.Nothing],
      background: S,
      foreground: S,
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: S, foreground: S, format: S): S = js.native
    def image(size: js.UndefOr[scala.Nothing], background: S, foreground: S, format: S, text: S): S = js.native
    def image(size: S): S = js.native
    def image(
      size: S,
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(
      size: S,
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString
    ): S = js.native
    def image(
      size: S,
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(size: S, background: js.UndefOr[scala.Nothing], foreground: js.UndefOr[scala.Nothing], format: S): S = js.native
    def image(
      size: S,
      background: js.UndefOr[scala.Nothing],
      foreground: js.UndefOr[scala.Nothing],
      format: S,
      text: S
    ): S = js.native
    def image(size: S, background: js.UndefOr[scala.Nothing], foreground: S): S = js.native
    def image(
      size: S,
      background: js.UndefOr[scala.Nothing],
      foreground: S,
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(size: S, background: js.UndefOr[scala.Nothing], foreground: S, format: RandomImageFormatString): S = js.native
    def image(
      size: S,
      background: js.UndefOr[scala.Nothing],
      foreground: S,
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(size: S, background: js.UndefOr[scala.Nothing], foreground: S, format: S): S = js.native
    def image(size: S, background: js.UndefOr[scala.Nothing], foreground: S, format: S, text: S): S = js.native
    def image(size: S, background: S): S = js.native
    def image(
      size: S,
      background: S,
      foreground: js.UndefOr[scala.Nothing],
      format: js.UndefOr[scala.Nothing],
      text: S
    ): S = js.native
    def image(size: S, background: S, foreground: js.UndefOr[scala.Nothing], format: RandomImageFormatString): S = js.native
    def image(
      size: S,
      background: S,
      foreground: js.UndefOr[scala.Nothing],
      format: RandomImageFormatString,
      text: S
    ): S = js.native
    def image(size: S, background: S, foreground: js.UndefOr[scala.Nothing], format: S): S = js.native
    def image(size: S, background: S, foreground: js.UndefOr[scala.Nothing], format: S, text: S): S = js.native
    def image(size: S, background: S, foreground: S): S = js.native
    def image(size: S, background: S, foreground: S, format: js.UndefOr[scala.Nothing], text: S): S = js.native
    def image(size: S, background: S, foreground: S, format: RandomImageFormatString): S = js.native
    def image(size: S, background: S, foreground: S, format: RandomImageFormatString, text: S): S = js.native
    def image(size: S, background: S, foreground: S, format: S): S = js.native
    def image(size: S, background: S, foreground: S, format: S, text: S): S = js.native
  }
  
  // Mockjs.Random - Miscellaneous
  // see https://github.com/nuysoft/Mock/wiki/Miscellaneous
  @js.native
  trait MockjsRandomMiscellaneous extends StObject {
    
    // Random.guid
    def guid(): S = js.native
    
    // Random.id
    def id(): S = js.native
    
    // Random.increment
    def increment(): N = js.native
    def increment(step: N): N = js.native
  }
  
  // Mockjs.Random - Name
  // see https://github.com/nuysoft/Mock/wiki/Name
  @js.native
  trait MockjsRandomName extends StObject {
    
    // Random.cfirst
    def cfirst(): S = js.native
    
    // Random.clast
    def clast(): S = js.native
    
    // Random.cname
    def cname(): S = js.native
    
    // Random.first
    def first(): S = js.native
    
    // Random.last
    def last(): S = js.native
    
    // Random.name
    def name(): S = js.native
    def name(middle: B): S = js.native
  }
  
  // Mockjs.Random - Text
  // see https://github.com/nuysoft/Mock/wiki/Text
  @js.native
  trait MockjsRandomText extends StObject {
    
    // Random.cparagraph
    def cparagraph(): S = js.native
    def cparagraph(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def cparagraph(min: N): S = js.native
    def cparagraph(min: N, max: N): S = js.native
    
    // Random.csentence
    def csentence(): S = js.native
    def csentence(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def csentence(min: N): S = js.native
    def csentence(min: N, max: N): S = js.native
    
    // Random.ctitle
    def ctitle(): S = js.native
    def ctitle(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def ctitle(min: N): S = js.native
    def ctitle(min: N, max: N): S = js.native
    
    // Random.cword
    def cword(): S = js.native
    def cword(pool: js.UndefOr[scala.Nothing], min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def cword(pool: js.UndefOr[scala.Nothing], min: N): S = js.native
    def cword(pool: js.UndefOr[scala.Nothing], min: N, max: N): S = js.native
    def cword(pool: N): S = js.native
    def cword(pool: N, min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def cword(pool: N, min: N): S = js.native
    def cword(pool: N, min: N, max: N): S = js.native
    def cword(pool: S): S = js.native
    def cword(pool: S, min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def cword(pool: S, min: N): S = js.native
    def cword(pool: S, min: N, max: N): S = js.native
    
    // Random.paragraph
    def paragraph(): S = js.native
    def paragraph(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def paragraph(min: N): S = js.native
    def paragraph(min: N, max: N): S = js.native
    
    // Random.sentence
    def sentence(): S = js.native
    def sentence(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def sentence(min: N): S = js.native
    def sentence(min: N, max: N): S = js.native
    
    // Random.title
    def title(): S = js.native
    def title(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def title(min: N): S = js.native
    def title(min: N, max: N): S = js.native
    
    // Random.word
    def word(): S = js.native
    def word(min: js.UndefOr[scala.Nothing], max: N): S = js.native
    def word(min: N): S = js.native
    def word(min: N, max: N): S = js.native
  }
  
  @js.native
  trait MockjsRandomWeb extends StObject {
    
    // Random.domain
    def domain(): S = js.native
    
    // Random.tld
    def dtl(): S = js.native
    
    // Random.email
    def email(): S = js.native
    def email(domain: S): S = js.native
    
    // Random.ip
    def ip(): S = js.native
    
    // Random.protocol
    def protocal(): RandomWebProtocal = js.native
    
    // Random.url
    def url(): S = js.native
    def url(protocol: js.UndefOr[scala.Nothing], host: S): S = js.native
    def url(protocol: S): S = js.native
    def url(protocol: S, host: S): S = js.native
  }
  
  // Mockjs.setup()
  // see https://github.com/nuysoft/Mock/wiki/Mock.setup()
  type MockjsSetup = js.Function1[/* settings */ MockjsSetupSettings, Unit]
  
  @js.native
  trait MockjsSetupSettings extends StObject {
    
    var timeout: js.UndefOr[Double | S] = js.native
  }
  object MockjsSetupSettings {
    
    @scala.inline
    def apply(): MockjsSetupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockjsSetupSettings]
    }
    
    @scala.inline
    implicit class MockjsSetupSettingsMutableBuilder[Self <: MockjsSetupSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double | S): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  // Mockjs.toJSONSchema()
  // see https://github.com/nuysoft/Mock/wiki/Mock.toJSONSchema()
  type MockjsToJSONSchema = js.Function1[/* template */ js.Any, MockjsToJSONSchemaRs]
  
  @js.native
  trait MockjsToJSONSchemaRs extends StObject {
    
    var items: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.native
    
    var name: js.UndefOr[S] = js.native
    
    var path: js.Array[S] = js.native
    
    var properties: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.native
    
    var rule: js.Object = js.native
    
    var template: js.Any = js.native
    
    var `type`: S = js.native
  }
  object MockjsToJSONSchemaRs {
    
    @scala.inline
    def apply(path: js.Array[S], rule: js.Object, template: js.Any, `type`: S): MockjsToJSONSchemaRs = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockjsToJSONSchemaRs]
    }
    
    @scala.inline
    implicit class MockjsToJSONSchemaRsMutableBuilder[Self <: MockjsToJSONSchemaRs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[MockjsToJSONSchemaRs]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: MockjsToJSONSchemaRs*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setName(value: S): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[S]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: S*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setProperties(value: js.Array[MockjsToJSONSchemaRs]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setPropertiesVarargs(value: MockjsToJSONSchemaRs*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      @scala.inline
      def setRule(value: js.Object): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: S): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // Mockjs.valid()
  // see https://github.com/nuysoft/Mock/wiki/Mock.valid()
  type MockjsValid = js.Function2[/* template */ js.Any, /* data */ js.Any, js.Array[MockjsValidRsItem]]
  
  @js.native
  trait MockjsValidRsItem extends StObject {
    
    var action: S = js.native
    
    var actual: S = js.native
    
    var expected: S = js.native
    
    var message: S = js.native
    
    var path: js.Array[S] = js.native
    
    var `type`: S = js.native
  }
  object MockjsValidRsItem {
    
    @scala.inline
    def apply(action: S, actual: S, expected: S, message: S, path: js.Array[S], `type`: S): MockjsValidRsItem = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockjsValidRsItem]
    }
    
    @scala.inline
    implicit class MockjsValidRsItemMutableBuilder[Self <: MockjsValidRsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: S): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActual(value: S): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: S): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: S): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[S]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: S*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setType(value: S): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type N = Double
  
  // Mockjs.Random - Date
  // see https://github.com/nuysoft/Mock/wiki/Date
  /* Rewritten from type alias, can be one of: 
    - typings.mockjs.mockjsStrings.year
    - typings.mockjs.mockjsStrings.month
    - typings.mockjs.mockjsStrings.week
    - typings.mockjs.mockjsStrings.day
    - typings.mockjs.mockjsStrings.hour
    - typings.mockjs.mockjsStrings.minute
    - typings.mockjs.mockjsStrings.second
  */
  trait RandomDateUtilString extends StObject
  object RandomDateUtilString {
    
    @scala.inline
    def day: typings.mockjs.mockjsStrings.day = "day".asInstanceOf[typings.mockjs.mockjsStrings.day]
    
    @scala.inline
    def hour: typings.mockjs.mockjsStrings.hour = "hour".asInstanceOf[typings.mockjs.mockjsStrings.hour]
    
    @scala.inline
    def minute: typings.mockjs.mockjsStrings.minute = "minute".asInstanceOf[typings.mockjs.mockjsStrings.minute]
    
    @scala.inline
    def month: typings.mockjs.mockjsStrings.month = "month".asInstanceOf[typings.mockjs.mockjsStrings.month]
    
    @scala.inline
    def second: typings.mockjs.mockjsStrings.second = "second".asInstanceOf[typings.mockjs.mockjsStrings.second]
    
    @scala.inline
    def week: typings.mockjs.mockjsStrings.week = "week".asInstanceOf[typings.mockjs.mockjsStrings.week]
    
    @scala.inline
    def year: typings.mockjs.mockjsStrings.year = "year".asInstanceOf[typings.mockjs.mockjsStrings.year]
  }
  
  // Mockjs.Random - Image
  // see https://github.com/nuysoft/Mock/wiki/Image
  /* Rewritten from type alias, can be one of: 
    - typings.mockjs.mockjsStrings.png
    - typings.mockjs.mockjsStrings.gif
    - typings.mockjs.mockjsStrings.jpg
  */
  trait RandomImageFormatString extends StObject
  object RandomImageFormatString {
    
    @scala.inline
    def gif: typings.mockjs.mockjsStrings.gif = "gif".asInstanceOf[typings.mockjs.mockjsStrings.gif]
    
    @scala.inline
    def jpg: typings.mockjs.mockjsStrings.jpg = "jpg".asInstanceOf[typings.mockjs.mockjsStrings.jpg]
    
    @scala.inline
    def png: typings.mockjs.mockjsStrings.png = "png".asInstanceOf[typings.mockjs.mockjsStrings.png]
  }
  
  // Mockjs.Random - Web
  // see https://github.com/nuysoft/Mock/wiki/Web
  /* Rewritten from type alias, can be one of: 
    - typings.mockjs.mockjsStrings.http
    - typings.mockjs.mockjsStrings.ftp
    - typings.mockjs.mockjsStrings.gopher
    - typings.mockjs.mockjsStrings.mailto
    - typings.mockjs.mockjsStrings.mid
    - typings.mockjs.mockjsStrings.cid
    - typings.mockjs.mockjsStrings.news
    - typings.mockjs.mockjsStrings.nntp
    - typings.mockjs.mockjsStrings.prospero
    - typings.mockjs.mockjsStrings.telnet
    - typings.mockjs.mockjsStrings.rlogin
    - typings.mockjs.mockjsStrings.tn3270
    - typings.mockjs.mockjsStrings.wais
  */
  trait RandomWebProtocal extends StObject
  object RandomWebProtocal {
    
    @scala.inline
    def cid: typings.mockjs.mockjsStrings.cid = "cid".asInstanceOf[typings.mockjs.mockjsStrings.cid]
    
    @scala.inline
    def ftp: typings.mockjs.mockjsStrings.ftp = "ftp".asInstanceOf[typings.mockjs.mockjsStrings.ftp]
    
    @scala.inline
    def gopher: typings.mockjs.mockjsStrings.gopher = "gopher".asInstanceOf[typings.mockjs.mockjsStrings.gopher]
    
    @scala.inline
    def http: typings.mockjs.mockjsStrings.http = "http".asInstanceOf[typings.mockjs.mockjsStrings.http]
    
    @scala.inline
    def mailto: typings.mockjs.mockjsStrings.mailto = "mailto".asInstanceOf[typings.mockjs.mockjsStrings.mailto]
    
    @scala.inline
    def mid: typings.mockjs.mockjsStrings.mid = "mid".asInstanceOf[typings.mockjs.mockjsStrings.mid]
    
    @scala.inline
    def news: typings.mockjs.mockjsStrings.news = "news".asInstanceOf[typings.mockjs.mockjsStrings.news]
    
    @scala.inline
    def nntp: typings.mockjs.mockjsStrings.nntp = "nntp".asInstanceOf[typings.mockjs.mockjsStrings.nntp]
    
    @scala.inline
    def prospero: typings.mockjs.mockjsStrings.prospero = "prospero".asInstanceOf[typings.mockjs.mockjsStrings.prospero]
    
    @scala.inline
    def rlogin: typings.mockjs.mockjsStrings.rlogin = "rlogin".asInstanceOf[typings.mockjs.mockjsStrings.rlogin]
    
    @scala.inline
    def telnet: typings.mockjs.mockjsStrings.telnet = "telnet".asInstanceOf[typings.mockjs.mockjsStrings.telnet]
    
    @scala.inline
    def tn3270: typings.mockjs.mockjsStrings.tn3270 = "tn3270".asInstanceOf[typings.mockjs.mockjsStrings.tn3270]
    
    @scala.inline
    def wais: typings.mockjs.mockjsStrings.wais = "wais".asInstanceOf[typings.mockjs.mockjsStrings.wais]
  }
  
  type S = String
}
