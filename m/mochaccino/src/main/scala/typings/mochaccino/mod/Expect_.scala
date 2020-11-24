package typings.mochaccino.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expect_ extends js.Object {
  
  var not: Expect_ = js.native
  
  def toBe(arg: js.Any): Unit = js.native
  
  def toBeDefined(): Unit = js.native
  
  def toBeFalsy(): Unit = js.native
  
  def toBeGreaterThan(other: Double): Unit = js.native
  
  def toBeLessThan(other: Double): Unit = js.native
  
  def toBeNull(): Unit = js.native
  
  def toBeTruthy(): Unit = js.native
  
  def toBeUndefined(): Unit = js.native
  
  def toContain(arg: js.Any): Unit = js.native
  
  def toEqual(arg: js.Any): Unit = js.native
  
  def toHaveBeenCalled(): Unit = js.native
  
  def toHaveBeenCalledTimes(callCount: Double): Unit = js.native
  
  def toHaveBeenCalledWith(arg: js.Any*): Unit = js.native
  
  def toMatch(matchExpression: js.Any): Unit = js.native
  
  def toThrow(): Unit = js.native
  
  def toThrowError(errType: js.Any): Unit = js.native
}
object Expect_ {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class Expect_Ops[Self <: Expect_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNot(value: Expect_): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToBe(value: js.Any => Unit): Self = this.set("toBe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBeDefined(value: () => Unit): Self = this.set("toBeDefined", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeFalsy(value: () => Unit): Self = this.set("toBeFalsy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeGreaterThan(value: Double => Unit): Self = this.set("toBeGreaterThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBeLessThan(value: Double => Unit): Self = this.set("toBeLessThan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBeNull(value: () => Unit): Self = this.set("toBeNull", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeTruthy(value: () => Unit): Self = this.set("toBeTruthy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBeUndefined(value: () => Unit): Self = this.set("toBeUndefined", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToContain(value: js.Any => Unit): Self = this.set("toContain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToEqual(value: js.Any => Unit): Self = this.set("toEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToHaveBeenCalled(value: () => Unit): Self = this.set("toHaveBeenCalled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToHaveBeenCalledTimes(value: Double => Unit): Self = this.set("toHaveBeenCalledTimes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToHaveBeenCalledWith(value: /* repeated */ js.Any => Unit): Self = this.set("toHaveBeenCalledWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToMatch(value: js.Any => Unit): Self = this.set("toMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToThrow(value: () => Unit): Self = this.set("toThrow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToThrowError(value: js.Any => Unit): Self = this.set("toThrowError", js.Any.fromFunction1(value))
  }
}
