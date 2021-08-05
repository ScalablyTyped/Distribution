package typings.mockjs

import org.scalablytyped.runtime.StringDictionary
import typings.mockjs.mockjsStrings.lower
import typings.mockjs.mockjsStrings.number
import typings.mockjs.mockjsStrings.symbol
import typings.mockjs.mockjsStrings.upper
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mockjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mockjs", "Random")
  @js.native
  def Random: MockjsRandom = js.native
  inline def Random_=(x: MockjsRandom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Random")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "mock")
  @js.native
  def mock: MockjsMock = js.native
  inline def mock_=(x: MockjsMock): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mock")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "setup")
  @js.native
  def setup: MockjsSetup = js.native
  inline def setup_=(x: MockjsSetup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setup")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "toJSONSchema")
  @js.native
  def toJSONSchema: MockjsToJSONSchema = js.native
  inline def toJSONSchema_=(x: MockjsToJSONSchema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSONSchema")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "valid")
  @js.native
  def valid: MockjsValid = js.native
  inline def valid_=(x: MockjsValid): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  
  @JSImport("mockjs", "version")
  @js.native
  def version: Double = js.native
  inline def version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  type B = Boolean
  
  // Interface for global namespace 'Mockjs'
  trait Mockjs extends StObject {
    
    var Random: MockjsRandom
    
    def mock(rurl: S, rtype: S, template: js.Any): Mockjs
    def mock(rurl: S, template: js.Any): Mockjs
    def mock(rurl: RegExp, rtype: S, template: js.Any): Mockjs
    def mock(rurl: RegExp, template: js.Any): Mockjs
    def mock(template: js.Any): js.Any
    @JSName("mock")
    var mock_Original: MockjsMock
    
    def setup(settings: MockjsSetupSettings): Unit
    @JSName("setup")
    var setup_Original: MockjsSetup
    
    def toJSONSchema(template: js.Any): MockjsToJSONSchemaRs
    @JSName("toJSONSchema")
    var toJSONSchema_Original: MockjsToJSONSchema
    
    def valid(template: js.Any, data: js.Any): js.Array[MockjsValidRsItem]
    @JSName("valid")
    var valid_Original: MockjsValid
    
    var version: Double
  }
  object Mockjs {
    
    inline def apply(
      Random: MockjsRandom,
      mock: MockjsMock,
      setup: /* settings */ MockjsSetupSettings => Unit,
      toJSONSchema: /* template */ js.Any => MockjsToJSONSchemaRs,
      valid: (/* template */ js.Any, /* data */ js.Any) => js.Array[MockjsValidRsItem],
      version: Double
    ): Mockjs = {
      val __obj = js.Dynamic.literal(Random = Random.asInstanceOf[js.Any], mock = mock.asInstanceOf[js.Any], setup = js.Any.fromFunction1(setup), toJSONSchema = js.Any.fromFunction1(toJSONSchema), valid = js.Any.fromFunction2(valid), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mockjs]
    }
    
    extension [Self <: Mockjs](x: Self) {
      
      inline def setMock(value: MockjsMock): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setRandom(value: MockjsRandom): Self = StObject.set(x, "Random", value.asInstanceOf[js.Any])
      
      inline def setSetup(value: /* settings */ MockjsSetupSettings => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setToJSONSchema(value: /* template */ js.Any => MockjsToJSONSchemaRs): Self = StObject.set(x, "toJSONSchema", js.Any.fromFunction1(value))
      
      inline def setValid(value: (/* template */ js.Any, /* data */ js.Any) => js.Array[MockjsValidRsItem]): Self = StObject.set(x, "valid", js.Any.fromFunction2(value))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
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
    extends StObject
       with MockjsRandomBasic
       with MockjsRandomDate
       with MockjsRandomImage
       with MockjsRandomColor
       with MockjsRandomAddress
       with MockjsRandomHelper
       with MockjsRandomMiscellaneous
       with MockjsRandomName
       with MockjsRandomText
       with MockjsRandomWeb
       with MockjsRandomExtendOption {
    
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
    def float(min: Unit, max: Unit, dmin: Unit, dmax: N): N = js.native
    def float(min: Unit, max: Unit, dmin: N): N = js.native
    def float(min: Unit, max: Unit, dmin: N, dmax: N): N = js.native
    def float(min: Unit, max: N): N = js.native
    def float(min: Unit, max: N, dmin: Unit, dmax: N): N = js.native
    def float(min: Unit, max: N, dmin: N): N = js.native
    def float(min: Unit, max: N, dmin: N, dmax: N): N = js.native
    def float(min: N): N = js.native
    def float(min: N, max: Unit, dmin: Unit, dmax: N): N = js.native
    def float(min: N, max: Unit, dmin: N): N = js.native
    def float(min: N, max: Unit, dmin: N, dmax: N): N = js.native
    def float(min: N, max: N): N = js.native
    def float(min: N, max: N, dmin: Unit, dmax: N): N = js.native
    def float(min: N, max: N, dmin: N): N = js.native
    def float(min: N, max: N, dmin: N, dmax: N): N = js.native
    
    // Random.integer
    def integer(): N = js.native
    def integer(min: Unit, max: N): N = js.native
    def integer(min: N): N = js.native
    def integer(min: N, max: N): N = js.native
    
    // Random.natural
    def natural(): N = js.native
    def natural(min: Unit, max: N): N = js.native
    def natural(min: N): N = js.native
    def natural(min: N, max: N): N = js.native
    
    // Random.range
    def range(): N = js.native
    def range(start: Unit, stop: Unit, step: N): N = js.native
    def range(start: Unit, stop: N): N = js.native
    def range(start: Unit, stop: N, step: N): N = js.native
    def range(start: N): N = js.native
    def range(start: N, stop: Unit, step: N): N = js.native
    def range(start: N, stop: N): N = js.native
    def range(start: N, stop: N, step: N): N = js.native
    
    // Random.string
    def string(): S = js.native
    def string(pool: Unit, min: Unit, max: N): S = js.native
    def string(pool: Unit, min: N): S = js.native
    def string(pool: Unit, min: N, max: N): S = js.native
    def string(pool: N): S = js.native
    def string(pool: N, min: Unit, max: N): S = js.native
    def string(pool: N, min: N): S = js.native
    def string(pool: N, min: N, max: N): S = js.native
    def string(pool: S): S = js.native
    def string(pool: S, min: Unit, max: N): S = js.native
    def string(pool: S, min: N): S = js.native
    def string(pool: S, min: N, max: N): S = js.native
  }
  
  // Mockjs.Random - Color
  // see https://github.com/nuysoft/Mock/wiki/Color
  trait MockjsRandomColor extends StObject {
    
    // Random.color
    def color(): S
    
    // Random.hex
    def hex(): S
    
    // Random.hsl
    def hsl(): S
    
    // Random.rgb
    def rgb(): S
    
    // Random.rgba
    def rgba(): S
  }
  object MockjsRandomColor {
    
    inline def apply(color: () => S, hex: () => S, hsl: () => S, rgb: () => S, rgba: () => S): MockjsRandomColor = {
      val __obj = js.Dynamic.literal(color = js.Any.fromFunction0(color), hex = js.Any.fromFunction0(hex), hsl = js.Any.fromFunction0(hsl), rgb = js.Any.fromFunction0(rgb), rgba = js.Any.fromFunction0(rgba))
      __obj.asInstanceOf[MockjsRandomColor]
    }
    
    extension [Self <: MockjsRandomColor](x: Self) {
      
      inline def setColor(value: () => S): Self = StObject.set(x, "color", js.Any.fromFunction0(value))
      
      inline def setHex(value: () => S): Self = StObject.set(x, "hex", js.Any.fromFunction0(value))
      
      inline def setHsl(value: () => S): Self = StObject.set(x, "hsl", js.Any.fromFunction0(value))
      
      inline def setRgb(value: () => S): Self = StObject.set(x, "rgb", js.Any.fromFunction0(value))
      
      inline def setRgba(value: () => S): Self = StObject.set(x, "rgba", js.Any.fromFunction0(value))
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
  trait MockjsRandomHelper extends StObject {
    
    // Random.capitalize
    def capitalize(word: S): S
    
    // Random.lower
    def lower(str: S): S
    
    // Random.pick
    def pick(arr: js.Array[js.Any]): js.Any
    
    // Random.shuffle
    def shuffle(arr: js.Array[js.Any]): js.Array[js.Any]
    
    // Random.upper
    def upper(str: S): S
  }
  object MockjsRandomHelper {
    
    inline def apply(
      capitalize: S => S,
      lower: S => S,
      pick: js.Array[js.Any] => js.Any,
      shuffle: js.Array[js.Any] => js.Array[js.Any],
      upper: S => S
    ): MockjsRandomHelper = {
      val __obj = js.Dynamic.literal(capitalize = js.Any.fromFunction1(capitalize), lower = js.Any.fromFunction1(lower), pick = js.Any.fromFunction1(pick), shuffle = js.Any.fromFunction1(shuffle), upper = js.Any.fromFunction1(upper))
      __obj.asInstanceOf[MockjsRandomHelper]
    }
    
    extension [Self <: MockjsRandomHelper](x: Self) {
      
      inline def setCapitalize(value: S => S): Self = StObject.set(x, "capitalize", js.Any.fromFunction1(value))
      
      inline def setLower(value: S => S): Self = StObject.set(x, "lower", js.Any.fromFunction1(value))
      
      inline def setPick(value: js.Array[js.Any] => js.Any): Self = StObject.set(x, "pick", js.Any.fromFunction1(value))
      
      inline def setShuffle(value: js.Array[js.Any] => js.Array[js.Any]): Self = StObject.set(x, "shuffle", js.Any.fromFunction1(value))
      
      inline def setUpper(value: S => S): Self = StObject.set(x, "upper", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MockjsRandomImage extends StObject {
    
    // Random.dataImage
    def dataImage(): S = js.native
    def dataImage(size: Unit, text: S): S = js.native
    def dataImage(size: S): S = js.native
    def dataImage(size: S, text: S): S = js.native
    
    // Random.image
    def image(): S = js.native
    def image(size: Unit, background: Unit, foreground: Unit, format: Unit, text: S): S = js.native
    def image(size: Unit, background: Unit, foreground: Unit, format: RandomImageFormatString): S = js.native
    def image(size: Unit, background: Unit, foreground: Unit, format: RandomImageFormatString, text: S): S = js.native
    def image(size: Unit, background: Unit, foreground: Unit, format: S): S = js.native
    def image(size: Unit, background: Unit, foreground: Unit, format: S, text: S): S = js.native
    def image(size: Unit, background: Unit, foreground: S): S = js.native
    def image(size: Unit, background: Unit, foreground: S, format: Unit, text: S): S = js.native
    def image(size: Unit, background: Unit, foreground: S, format: RandomImageFormatString): S = js.native
    def image(size: Unit, background: Unit, foreground: S, format: RandomImageFormatString, text: S): S = js.native
    def image(size: Unit, background: Unit, foreground: S, format: S): S = js.native
    def image(size: Unit, background: Unit, foreground: S, format: S, text: S): S = js.native
    def image(size: Unit, background: S): S = js.native
    def image(size: Unit, background: S, foreground: Unit, format: Unit, text: S): S = js.native
    def image(size: Unit, background: S, foreground: Unit, format: RandomImageFormatString): S = js.native
    def image(size: Unit, background: S, foreground: Unit, format: RandomImageFormatString, text: S): S = js.native
    def image(size: Unit, background: S, foreground: Unit, format: S): S = js.native
    def image(size: Unit, background: S, foreground: Unit, format: S, text: S): S = js.native
    def image(size: Unit, background: S, foreground: S): S = js.native
    def image(size: Unit, background: S, foreground: S, format: Unit, text: S): S = js.native
    def image(size: Unit, background: S, foreground: S, format: RandomImageFormatString): S = js.native
    def image(size: Unit, background: S, foreground: S, format: RandomImageFormatString, text: S): S = js.native
    def image(size: Unit, background: S, foreground: S, format: S): S = js.native
    def image(size: Unit, background: S, foreground: S, format: S, text: S): S = js.native
    def image(size: S): S = js.native
    def image(size: S, background: Unit, foreground: Unit, format: Unit, text: S): S = js.native
    def image(size: S, background: Unit, foreground: Unit, format: RandomImageFormatString): S = js.native
    def image(size: S, background: Unit, foreground: Unit, format: RandomImageFormatString, text: S): S = js.native
    def image(size: S, background: Unit, foreground: Unit, format: S): S = js.native
    def image(size: S, background: Unit, foreground: Unit, format: S, text: S): S = js.native
    def image(size: S, background: Unit, foreground: S): S = js.native
    def image(size: S, background: Unit, foreground: S, format: Unit, text: S): S = js.native
    def image(size: S, background: Unit, foreground: S, format: RandomImageFormatString): S = js.native
    def image(size: S, background: Unit, foreground: S, format: RandomImageFormatString, text: S): S = js.native
    def image(size: S, background: Unit, foreground: S, format: S): S = js.native
    def image(size: S, background: Unit, foreground: S, format: S, text: S): S = js.native
    def image(size: S, background: S): S = js.native
    def image(size: S, background: S, foreground: Unit, format: Unit, text: S): S = js.native
    def image(size: S, background: S, foreground: Unit, format: RandomImageFormatString): S = js.native
    def image(size: S, background: S, foreground: Unit, format: RandomImageFormatString, text: S): S = js.native
    def image(size: S, background: S, foreground: Unit, format: S): S = js.native
    def image(size: S, background: S, foreground: Unit, format: S, text: S): S = js.native
    def image(size: S, background: S, foreground: S): S = js.native
    def image(size: S, background: S, foreground: S, format: Unit, text: S): S = js.native
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
    def cparagraph(min: Unit, max: N): S = js.native
    def cparagraph(min: N): S = js.native
    def cparagraph(min: N, max: N): S = js.native
    
    // Random.csentence
    def csentence(): S = js.native
    def csentence(min: Unit, max: N): S = js.native
    def csentence(min: N): S = js.native
    def csentence(min: N, max: N): S = js.native
    
    // Random.ctitle
    def ctitle(): S = js.native
    def ctitle(min: Unit, max: N): S = js.native
    def ctitle(min: N): S = js.native
    def ctitle(min: N, max: N): S = js.native
    
    // Random.cword
    def cword(): S = js.native
    def cword(pool: Unit, min: Unit, max: N): S = js.native
    def cword(pool: Unit, min: N): S = js.native
    def cword(pool: Unit, min: N, max: N): S = js.native
    def cword(pool: N): S = js.native
    def cword(pool: N, min: Unit, max: N): S = js.native
    def cword(pool: N, min: N): S = js.native
    def cword(pool: N, min: N, max: N): S = js.native
    def cword(pool: S): S = js.native
    def cword(pool: S, min: Unit, max: N): S = js.native
    def cword(pool: S, min: N): S = js.native
    def cword(pool: S, min: N, max: N): S = js.native
    
    // Random.paragraph
    def paragraph(): S = js.native
    def paragraph(min: Unit, max: N): S = js.native
    def paragraph(min: N): S = js.native
    def paragraph(min: N, max: N): S = js.native
    
    // Random.sentence
    def sentence(): S = js.native
    def sentence(min: Unit, max: N): S = js.native
    def sentence(min: N): S = js.native
    def sentence(min: N, max: N): S = js.native
    
    // Random.title
    def title(): S = js.native
    def title(min: Unit, max: N): S = js.native
    def title(min: N): S = js.native
    def title(min: N, max: N): S = js.native
    
    // Random.word
    def word(): S = js.native
    def word(min: Unit, max: N): S = js.native
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
    def url(protocol: Unit, host: S): S = js.native
    def url(protocol: S): S = js.native
    def url(protocol: S, host: S): S = js.native
  }
  
  // Mockjs.setup()
  // see https://github.com/nuysoft/Mock/wiki/Mock.setup()
  type MockjsSetup = js.Function1[/* settings */ MockjsSetupSettings, Unit]
  
  trait MockjsSetupSettings extends StObject {
    
    var timeout: js.UndefOr[Double | S] = js.undefined
  }
  object MockjsSetupSettings {
    
    inline def apply(): MockjsSetupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockjsSetupSettings]
    }
    
    extension [Self <: MockjsSetupSettings](x: Self) {
      
      inline def setTimeout(value: Double | S): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  // Mockjs.toJSONSchema()
  // see https://github.com/nuysoft/Mock/wiki/Mock.toJSONSchema()
  type MockjsToJSONSchema = js.Function1[/* template */ js.Any, MockjsToJSONSchemaRs]
  
  trait MockjsToJSONSchemaRs extends StObject {
    
    var items: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.undefined
    
    var name: js.UndefOr[S] = js.undefined
    
    var path: js.Array[S]
    
    var properties: js.UndefOr[js.Array[MockjsToJSONSchemaRs]] = js.undefined
    
    var rule: js.Object
    
    var template: js.Any
    
    var `type`: S
  }
  object MockjsToJSONSchemaRs {
    
    inline def apply(path: js.Array[S], rule: js.Object, template: js.Any, `type`: S): MockjsToJSONSchemaRs = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockjsToJSONSchemaRs]
    }
    
    extension [Self <: MockjsToJSONSchemaRs](x: Self) {
      
      inline def setItems(value: js.Array[MockjsToJSONSchemaRs]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: MockjsToJSONSchemaRs*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setName(value: S): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: js.Array[S]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: S*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setProperties(value: js.Array[MockjsToJSONSchemaRs]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setPropertiesVarargs(value: MockjsToJSONSchemaRs*): Self = StObject.set(x, "properties", js.Array(value :_*))
      
      inline def setRule(value: js.Object): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: js.Any): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setType(value: S): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // Mockjs.valid()
  // see https://github.com/nuysoft/Mock/wiki/Mock.valid()
  type MockjsValid = js.Function2[/* template */ js.Any, /* data */ js.Any, js.Array[MockjsValidRsItem]]
  
  trait MockjsValidRsItem extends StObject {
    
    var action: S
    
    var actual: S
    
    var expected: S
    
    var message: S
    
    var path: js.Array[S]
    
    var `type`: S
  }
  object MockjsValidRsItem {
    
    inline def apply(action: S, actual: S, expected: S, message: S, path: js.Array[S], `type`: S): MockjsValidRsItem = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockjsValidRsItem]
    }
    
    extension [Self <: MockjsValidRsItem](x: Self) {
      
      inline def setAction(value: S): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActual(value: S): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: S): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: S): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[S]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: S*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setType(value: S): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def day: typings.mockjs.mockjsStrings.day = "day".asInstanceOf[typings.mockjs.mockjsStrings.day]
    
    inline def hour: typings.mockjs.mockjsStrings.hour = "hour".asInstanceOf[typings.mockjs.mockjsStrings.hour]
    
    inline def minute: typings.mockjs.mockjsStrings.minute = "minute".asInstanceOf[typings.mockjs.mockjsStrings.minute]
    
    inline def month: typings.mockjs.mockjsStrings.month = "month".asInstanceOf[typings.mockjs.mockjsStrings.month]
    
    inline def second: typings.mockjs.mockjsStrings.second = "second".asInstanceOf[typings.mockjs.mockjsStrings.second]
    
    inline def week: typings.mockjs.mockjsStrings.week = "week".asInstanceOf[typings.mockjs.mockjsStrings.week]
    
    inline def year: typings.mockjs.mockjsStrings.year = "year".asInstanceOf[typings.mockjs.mockjsStrings.year]
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
    
    inline def gif: typings.mockjs.mockjsStrings.gif = "gif".asInstanceOf[typings.mockjs.mockjsStrings.gif]
    
    inline def jpg: typings.mockjs.mockjsStrings.jpg = "jpg".asInstanceOf[typings.mockjs.mockjsStrings.jpg]
    
    inline def png: typings.mockjs.mockjsStrings.png = "png".asInstanceOf[typings.mockjs.mockjsStrings.png]
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
    
    inline def cid: typings.mockjs.mockjsStrings.cid = "cid".asInstanceOf[typings.mockjs.mockjsStrings.cid]
    
    inline def ftp: typings.mockjs.mockjsStrings.ftp = "ftp".asInstanceOf[typings.mockjs.mockjsStrings.ftp]
    
    inline def gopher: typings.mockjs.mockjsStrings.gopher = "gopher".asInstanceOf[typings.mockjs.mockjsStrings.gopher]
    
    inline def http: typings.mockjs.mockjsStrings.http = "http".asInstanceOf[typings.mockjs.mockjsStrings.http]
    
    inline def mailto: typings.mockjs.mockjsStrings.mailto = "mailto".asInstanceOf[typings.mockjs.mockjsStrings.mailto]
    
    inline def mid: typings.mockjs.mockjsStrings.mid = "mid".asInstanceOf[typings.mockjs.mockjsStrings.mid]
    
    inline def news: typings.mockjs.mockjsStrings.news = "news".asInstanceOf[typings.mockjs.mockjsStrings.news]
    
    inline def nntp: typings.mockjs.mockjsStrings.nntp = "nntp".asInstanceOf[typings.mockjs.mockjsStrings.nntp]
    
    inline def prospero: typings.mockjs.mockjsStrings.prospero = "prospero".asInstanceOf[typings.mockjs.mockjsStrings.prospero]
    
    inline def rlogin: typings.mockjs.mockjsStrings.rlogin = "rlogin".asInstanceOf[typings.mockjs.mockjsStrings.rlogin]
    
    inline def telnet: typings.mockjs.mockjsStrings.telnet = "telnet".asInstanceOf[typings.mockjs.mockjsStrings.telnet]
    
    inline def tn3270: typings.mockjs.mockjsStrings.tn3270 = "tn3270".asInstanceOf[typings.mockjs.mockjsStrings.tn3270]
    
    inline def wais: typings.mockjs.mockjsStrings.wais = "wais".asInstanceOf[typings.mockjs.mockjsStrings.wais]
  }
  
  type S = String
}
