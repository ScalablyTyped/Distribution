package typings.mochaccino

import typings.mochaccino.mochaccinoBooleans.`true`
import typings.mochaccino.mochaccinoStrings.document
import typings.mochaccino.mochaccinoStrings.navigator
import typings.mochaccino.mochaccinoStrings.window
import typings.sinon.mod.SinonStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mochaccino", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mochaccino", "dom")
  @js.native
  val dom: Dom_ = js.native
  
  inline def expect(value: js.Any): Expect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("expect")(value.asInstanceOf[js.Any]).asInstanceOf[Expect_]
  
  inline def spy(config: js.Any*): js.Function1[/* repeated */ js.Any, SpyProxy] = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, SpyProxy]]
  
  trait Dom_ extends StObject {
    
    def clear(): Unit
    
    def create(): Unit
    
    def destroy(): Unit
    
    var exposedProperties: js.Tuple3[window, navigator, document]
  }
  object Dom_ {
    
    inline def apply(
      clear: () => Unit,
      create: () => Unit,
      destroy: () => Unit,
      exposedProperties: js.Tuple3[window, navigator, document]
    ): Dom_ = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction0(destroy), exposedProperties = exposedProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dom_]
    }
    
    extension [Self <: Dom_](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCreate(value: () => Unit): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setExposedProperties(value: js.Tuple3[window, navigator, document]): Self = StObject.set(x, "exposedProperties", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expect_ extends StObject {
    
    var not: Expect_
    
    def toBe(arg: js.Any): Unit
    
    def toBeDefined(): Unit
    
    def toBeFalsy(): Unit
    
    def toBeGreaterThan(other: Double): Unit
    
    def toBeLessThan(other: Double): Unit
    
    def toBeNull(): Unit
    
    def toBeTruthy(): Unit
    
    def toBeUndefined(): Unit
    
    def toContain(arg: js.Any): Unit
    
    def toEqual(arg: js.Any): Unit
    
    def toHaveBeenCalled(): Unit
    
    def toHaveBeenCalledTimes(callCount: Double): Unit
    
    def toHaveBeenCalledWith(arg: js.Any*): Unit
    
    def toMatch(matchExpression: js.Any): Unit
    
    def toThrow(): Unit
    
    def toThrowError(errType: js.Any): Unit
  }
  object Expect_ {
    
    inline def apply(
      not: Expect_,
      toBe: js.Any => Unit,
      toBeDefined: () => Unit,
      toBeFalsy: () => Unit,
      toBeGreaterThan: Double => Unit,
      toBeLessThan: Double => Unit,
      toBeNull: () => Unit,
      toBeTruthy: () => Unit,
      toBeUndefined: () => Unit,
      toContain: js.Any => Unit,
      toEqual: js.Any => Unit,
      toHaveBeenCalled: () => Unit,
      toHaveBeenCalledTimes: Double => Unit,
      toHaveBeenCalledWith: /* repeated */ js.Any => Unit,
      toMatch: js.Any => Unit,
      toThrow: () => Unit,
      toThrowError: js.Any => Unit
    ): Expect_ = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], toBe = js.Any.fromFunction1(toBe), toBeDefined = js.Any.fromFunction0(toBeDefined), toBeFalsy = js.Any.fromFunction0(toBeFalsy), toBeGreaterThan = js.Any.fromFunction1(toBeGreaterThan), toBeLessThan = js.Any.fromFunction1(toBeLessThan), toBeNull = js.Any.fromFunction0(toBeNull), toBeTruthy = js.Any.fromFunction0(toBeTruthy), toBeUndefined = js.Any.fromFunction0(toBeUndefined), toContain = js.Any.fromFunction1(toContain), toEqual = js.Any.fromFunction1(toEqual), toHaveBeenCalled = js.Any.fromFunction0(toHaveBeenCalled), toHaveBeenCalledTimes = js.Any.fromFunction1(toHaveBeenCalledTimes), toHaveBeenCalledWith = js.Any.fromFunction1(toHaveBeenCalledWith), toMatch = js.Any.fromFunction1(toMatch), toThrow = js.Any.fromFunction0(toThrow), toThrowError = js.Any.fromFunction1(toThrowError))
      __obj.asInstanceOf[Expect_]
    }
    
    extension [Self <: Expect_](x: Self) {
      
      inline def setNot(value: Expect_): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setToBe(value: js.Any => Unit): Self = StObject.set(x, "toBe", js.Any.fromFunction1(value))
      
      inline def setToBeDefined(value: () => Unit): Self = StObject.set(x, "toBeDefined", js.Any.fromFunction0(value))
      
      inline def setToBeFalsy(value: () => Unit): Self = StObject.set(x, "toBeFalsy", js.Any.fromFunction0(value))
      
      inline def setToBeGreaterThan(value: Double => Unit): Self = StObject.set(x, "toBeGreaterThan", js.Any.fromFunction1(value))
      
      inline def setToBeLessThan(value: Double => Unit): Self = StObject.set(x, "toBeLessThan", js.Any.fromFunction1(value))
      
      inline def setToBeNull(value: () => Unit): Self = StObject.set(x, "toBeNull", js.Any.fromFunction0(value))
      
      inline def setToBeTruthy(value: () => Unit): Self = StObject.set(x, "toBeTruthy", js.Any.fromFunction0(value))
      
      inline def setToBeUndefined(value: () => Unit): Self = StObject.set(x, "toBeUndefined", js.Any.fromFunction0(value))
      
      inline def setToContain(value: js.Any => Unit): Self = StObject.set(x, "toContain", js.Any.fromFunction1(value))
      
      inline def setToEqual(value: js.Any => Unit): Self = StObject.set(x, "toEqual", js.Any.fromFunction1(value))
      
      inline def setToHaveBeenCalled(value: () => Unit): Self = StObject.set(x, "toHaveBeenCalled", js.Any.fromFunction0(value))
      
      inline def setToHaveBeenCalledTimes(value: Double => Unit): Self = StObject.set(x, "toHaveBeenCalledTimes", js.Any.fromFunction1(value))
      
      inline def setToHaveBeenCalledWith(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "toHaveBeenCalledWith", js.Any.fromFunction1(value))
      
      inline def setToMatch(value: js.Any => Unit): Self = StObject.set(x, "toMatch", js.Any.fromFunction1(value))
      
      inline def setToThrow(value: () => Unit): Self = StObject.set(x, "toThrow", js.Any.fromFunction0(value))
      
      inline def setToThrowError(value: js.Any => Unit): Self = StObject.set(x, "toThrowError", js.Any.fromFunction1(value))
    }
  }
  
  trait SpyProxy extends StObject {
    
    var and: SpyProxy
    
    def callFake(fake: js.Function1[/* repeated */ js.Any, js.Any]): Unit
    
    def callThrough(): Unit
    
    def getSubject(): SinonStub[js.Array[js.Any], js.Any]
    
    def returnValue(obj: js.Any): Unit
    
    var spyProxy: `true`
  }
  object SpyProxy {
    
    inline def apply(
      and: SpyProxy,
      callFake: js.Function1[/* repeated */ js.Any, js.Any] => Unit,
      callThrough: () => Unit,
      getSubject: () => SinonStub[js.Array[js.Any], js.Any],
      returnValue: js.Any => Unit
    ): SpyProxy = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], callFake = js.Any.fromFunction1(callFake), callThrough = js.Any.fromFunction0(callThrough), getSubject = js.Any.fromFunction0(getSubject), returnValue = js.Any.fromFunction1(returnValue), spyProxy = true)
      __obj.asInstanceOf[SpyProxy]
    }
    
    extension [Self <: SpyProxy](x: Self) {
      
      inline def setAnd(value: SpyProxy): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setCallFake(value: js.Function1[/* repeated */ js.Any, js.Any] => Unit): Self = StObject.set(x, "callFake", js.Any.fromFunction1(value))
      
      inline def setCallThrough(value: () => Unit): Self = StObject.set(x, "callThrough", js.Any.fromFunction0(value))
      
      inline def setGetSubject(value: () => SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "getSubject", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: js.Any => Unit): Self = StObject.set(x, "returnValue", js.Any.fromFunction1(value))
      
      inline def setSpyProxy(value: `true`): Self = StObject.set(x, "spyProxy", value.asInstanceOf[js.Any])
    }
  }
}
