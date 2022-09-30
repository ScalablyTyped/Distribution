package typings.mobx.anon

import typings.mobx.mobxStrings.`Expecting some object`
import typings.mobx.mobxStrings.`Intercept handlers should return nothing or a change object`
import typings.mobx.mobxStrings.`Invalid annotation`
import typings.mobx.mobxStrings.`It is not possible to get index atoms from arrays`
import typings.mobx.mobxStrings.`invalid action stackDot did you forget to finish an actionQuestionmark`
import typings.mobx.mobxStrings.`missing option for computedColon get`
import typings.mobx.mobxStrings.`please specify a property`
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val `0`: String
  
  def `1`(annotationType: Any, key: PropertyKey): String
  
  val `10`: String
  
  val `11`: String
  
  val `12`: `Invalid annotation`
  
  val `13`: String
  
  val `14`: `Intercept handlers should return nothing or a change object`
  
  val `15`: String
  
  val `16`: String
  
  def `17`(index: Any, length: Any): String
  
  val `18`: String
  
  def `19`(other: Any): String
  
  def `20`(other: Any): String
  
  def `21`(dataStructure: Any): String
  
  val `22`: String
  
  val `23`: `It is not possible to get index atoms from arrays`
  
  def `24`(thing: Any): String
  
  def `25`(property: Any, name: Any): String
  
  val `26`: `please specify a property`
  
  def `27`(property: Any, name: Any): String
  
  def `28`(thing: Any): String
  
  val `29`: `Expecting some object`
  
  val `30`: `invalid action stackDot did you forget to finish an actionQuestionmark`
  
  val `31`: `missing option for computedColon get`
  
  def `32`(name: Any, derivation: Any): String
  
  def `33`(name: Any): String
  
  def `34`(name: Any): String
  
  val `35`: String
  
  val `36`: String
  
  def `37`(method: Any): String
  
  val `38`: String
  
  val `39`: String
  
  val `5`: String
  
  val `6`: String
  
  val `7`: String
  
  val `8`: String
  
  val `9`: String
}
object `0` {
  
  inline def apply(
    `1`: (Any, PropertyKey) => String,
    `17`: (Any, Any) => String,
    `19`: Any => String,
    `20`: Any => String,
    `21`: Any => String,
    `24`: Any => String,
    `25`: (Any, Any) => String,
    `27`: (Any, Any) => String,
    `28`: Any => String,
    `32`: (Any, Any) => String,
    `33`: Any => String,
    `34`: Any => String,
    `37`: Any => String
  ): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")("Invalid value for configuration 'enforceActions', expected 'never', 'always' or 'observed'")
    __obj.updateDynamic("1")(js.Any.fromFunction2(`1`))
    __obj.updateDynamic("10")("'has()' can only be used on observable objects, arrays and maps")
    __obj.updateDynamic("11")("'get()' can only be used on observable objects, arrays and maps")
    __obj.updateDynamic("12")("Invalid annotation")
    __obj.updateDynamic("13")("Dynamic observable objects cannot be frozen. If you're passing observables to 3rd party component/function that calls Object.freeze, pass copy instead: toJS(observable)")
    __obj.updateDynamic("14")("Intercept handlers should return nothing or a change object")
    __obj.updateDynamic("15")("Observable arrays cannot be frozen. If you're passing observables to 3rd party component/function that calls Object.freeze, pass copy instead: toJS(observable)")
    __obj.updateDynamic("16")("Modification exception: the internal structure of an observable array was changed.")
    __obj.updateDynamic("17")(js.Any.fromFunction2(`17`))
    __obj.updateDynamic("18")("mobx.map requires Map polyfill for the current browser. Check babel-polyfill or core-js/es6/map.js")
    __obj.updateDynamic("19")(js.Any.fromFunction1(`19`))
    __obj.updateDynamic("20")(js.Any.fromFunction1(`20`))
    __obj.updateDynamic("21")(js.Any.fromFunction1(`21`))
    __obj.updateDynamic("22")("mobx.set requires Set polyfill for the current browser. Check babel-polyfill or core-js/es6/set.js")
    __obj.updateDynamic("23")("It is not possible to get index atoms from arrays")
    __obj.updateDynamic("24")(js.Any.fromFunction1(`24`))
    __obj.updateDynamic("25")(js.Any.fromFunction2(`25`))
    __obj.updateDynamic("26")("please specify a property")
    __obj.updateDynamic("27")(js.Any.fromFunction2(`27`))
    __obj.updateDynamic("28")(js.Any.fromFunction1(`28`))
    __obj.updateDynamic("29")("Expecting some object")
    __obj.updateDynamic("30")("invalid action stack. did you forget to finish an action?")
    __obj.updateDynamic("31")("missing option for computed: get")
    __obj.updateDynamic("32")(js.Any.fromFunction2(`32`))
    __obj.updateDynamic("33")(js.Any.fromFunction1(`33`))
    __obj.updateDynamic("34")(js.Any.fromFunction1(`34`))
    __obj.updateDynamic("35")("There are multiple, different versions of MobX active. Make sure MobX is loaded only once or use `configure({ isolateGlobalState: true })`")
    __obj.updateDynamic("36")("isolateGlobalState should be called before MobX is running any reactions")
    __obj.updateDynamic("37")(js.Any.fromFunction1(`37`))
    __obj.updateDynamic("38")("'ownKeys()' can only be used on observable objects")
    __obj.updateDynamic("39")("'defineProperty()' can only be used on observable objects")
    __obj.updateDynamic("5")("'keys()' can only be used on observable objects, arrays, sets and maps")
    __obj.updateDynamic("6")("'values()' can only be used on observable objects, arrays, sets and maps")
    __obj.updateDynamic("7")("'entries()' can only be used on observable objects, arrays and maps")
    __obj.updateDynamic("8")("'set()' can only be used on observable objects, arrays and maps")
    __obj.updateDynamic("9")("'remove()' can only be used on observable objects, arrays and maps")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: (Any, PropertyKey) => String): Self = StObject.set(x, "1", js.Any.fromFunction2(value))
    
    inline def set10(value: String): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
    
    inline def set11(value: String): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
    
    inline def set12(value: `Invalid annotation`): Self = StObject.set(x, "12", value.asInstanceOf[js.Any])
    
    inline def set13(value: String): Self = StObject.set(x, "13", value.asInstanceOf[js.Any])
    
    inline def set14(value: `Intercept handlers should return nothing or a change object`): Self = StObject.set(x, "14", value.asInstanceOf[js.Any])
    
    inline def set15(value: String): Self = StObject.set(x, "15", value.asInstanceOf[js.Any])
    
    inline def set16(value: String): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
    
    inline def set17(value: (Any, Any) => String): Self = StObject.set(x, "17", js.Any.fromFunction2(value))
    
    inline def set18(value: String): Self = StObject.set(x, "18", value.asInstanceOf[js.Any])
    
    inline def set19(value: Any => String): Self = StObject.set(x, "19", js.Any.fromFunction1(value))
    
    inline def set20(value: Any => String): Self = StObject.set(x, "20", js.Any.fromFunction1(value))
    
    inline def set21(value: Any => String): Self = StObject.set(x, "21", js.Any.fromFunction1(value))
    
    inline def set22(value: String): Self = StObject.set(x, "22", value.asInstanceOf[js.Any])
    
    inline def set23(value: `It is not possible to get index atoms from arrays`): Self = StObject.set(x, "23", value.asInstanceOf[js.Any])
    
    inline def set24(value: Any => String): Self = StObject.set(x, "24", js.Any.fromFunction1(value))
    
    inline def set25(value: (Any, Any) => String): Self = StObject.set(x, "25", js.Any.fromFunction2(value))
    
    inline def set26(value: `please specify a property`): Self = StObject.set(x, "26", value.asInstanceOf[js.Any])
    
    inline def set27(value: (Any, Any) => String): Self = StObject.set(x, "27", js.Any.fromFunction2(value))
    
    inline def set28(value: Any => String): Self = StObject.set(x, "28", js.Any.fromFunction1(value))
    
    inline def set29(value: `Expecting some object`): Self = StObject.set(x, "29", value.asInstanceOf[js.Any])
    
    inline def set30(value: `invalid action stackDot did you forget to finish an actionQuestionmark`): Self = StObject.set(x, "30", value.asInstanceOf[js.Any])
    
    inline def set31(value: `missing option for computedColon get`): Self = StObject.set(x, "31", value.asInstanceOf[js.Any])
    
    inline def set32(value: (Any, Any) => String): Self = StObject.set(x, "32", js.Any.fromFunction2(value))
    
    inline def set33(value: Any => String): Self = StObject.set(x, "33", js.Any.fromFunction1(value))
    
    inline def set34(value: Any => String): Self = StObject.set(x, "34", js.Any.fromFunction1(value))
    
    inline def set35(value: String): Self = StObject.set(x, "35", value.asInstanceOf[js.Any])
    
    inline def set36(value: String): Self = StObject.set(x, "36", value.asInstanceOf[js.Any])
    
    inline def set37(value: Any => String): Self = StObject.set(x, "37", js.Any.fromFunction1(value))
    
    inline def set38(value: String): Self = StObject.set(x, "38", value.asInstanceOf[js.Any])
    
    inline def set39(value: String): Self = StObject.set(x, "39", value.asInstanceOf[js.Any])
    
    inline def set5(value: String): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
    
    inline def set6(value: String): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
    
    inline def set7(value: String): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
    
    inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
    
    inline def set9(value: String): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
  }
}
