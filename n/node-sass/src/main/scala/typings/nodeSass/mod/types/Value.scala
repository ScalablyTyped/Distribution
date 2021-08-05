package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeSass.mod.types.Null
  - typings.nodeSass.mod.types.Number
  - typings.nodeSass.mod.types.String
  - typings.nodeSass.mod.types.Color
  - typings.nodeSass.mod.types.Boolean
  - typings.nodeSass.mod.types.List
  - typings.nodeSass.mod.types.Map
*/
trait Value
  extends StObject
     with ReturnValue
object Value {
  
  inline def Boolean(getValue: () => scala.Boolean): typings.nodeSass.mod.types.Boolean = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[typings.nodeSass.mod.types.Boolean]
  }
  
  inline def Color(
    getA: () => Double,
    getB: () => Double,
    getG: () => Double,
    getR: () => Double,
    setA: Double => Unit,
    setB: Double => Unit,
    setG: Double => Unit,
    setR: Double => Unit
  ): typings.nodeSass.mod.types.Color = {
    val __obj = js.Dynamic.literal(getA = js.Any.fromFunction0(getA), getB = js.Any.fromFunction0(getB), getG = js.Any.fromFunction0(getG), getR = js.Any.fromFunction0(getR), setA = js.Any.fromFunction1(setA), setB = js.Any.fromFunction1(setB), setG = js.Any.fromFunction1(setG), setR = js.Any.fromFunction1(setR))
    __obj.asInstanceOf[typings.nodeSass.mod.types.Color]
  }
  
  inline def List(
    getLength: () => Double,
    getSeparator: () => scala.Boolean,
    getValue: Double => Value,
    setSeparator: scala.Boolean => Unit,
    setValue: (Double, Value) => Unit
  ): typings.nodeSass.mod.types.List = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getSeparator = js.Any.fromFunction0(getSeparator), getValue = js.Any.fromFunction1(getValue), setSeparator = js.Any.fromFunction1(setSeparator), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[typings.nodeSass.mod.types.List]
  }
  
  inline def Map(
    getKey: Double => Value,
    getLength: () => Double,
    getValue: Double => Value,
    setKey: (Double, Value) => Unit,
    setValue: (Double, Value) => Unit
  ): typings.nodeSass.mod.types.Map = {
    val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey), getLength = js.Any.fromFunction0(getLength), getValue = js.Any.fromFunction1(getValue), setKey = js.Any.fromFunction2(setKey), setValue = js.Any.fromFunction2(setValue))
    __obj.asInstanceOf[typings.nodeSass.mod.types.Map]
  }
  
  inline def Null(___NULL___ : js.Symbol): typings.nodeSass.mod.types.Null = {
    val __obj = js.Dynamic.literal(___NULL___ = ___NULL___.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.nodeSass.mod.types.Null]
  }
  
  inline def Number(
    getUnit: () => java.lang.String,
    getValue: () => Double,
    setUnit: java.lang.String => Unit,
    setValue: Double => Unit
  ): typings.nodeSass.mod.types.Number = {
    val __obj = js.Dynamic.literal(getUnit = js.Any.fromFunction0(getUnit), getValue = js.Any.fromFunction0(getValue), setUnit = js.Any.fromFunction1(setUnit), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[typings.nodeSass.mod.types.Number]
  }
  
  inline def String(getValue: () => java.lang.String, setValue: java.lang.String => Unit): typings.nodeSass.mod.types.String = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[typings.nodeSass.mod.types.String]
  }
}
