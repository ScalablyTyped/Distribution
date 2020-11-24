package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Predicate extends js.Object {
  
  def evaluate(tagged_sentence: js.Array[js.Array[String]], position: Double): Boolean = js.native
  
  var function: js.UndefOr[
    js.Function3[
      /* tagged_sentence */ js.Array[js.Array[String]], 
      /* i */ Double, 
      /* parameter */ String, 
      Boolean
    ]
  ] = js.native
  
  var name: String = js.native
  
  var parameter1: String = js.native
  
  var parameter2: js.UndefOr[String] = js.native
}
object Predicate {
  
  @scala.inline
  def apply(evaluate: (js.Array[js.Array[String]], Double) => Boolean, name: String, parameter1: String): Predicate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), name = name.asInstanceOf[js.Any], parameter1 = parameter1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit class PredicateOps[Self <: Predicate] (val x: Self) extends AnyVal {
    
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
    def setEvaluate(value: (js.Array[js.Array[String]], Double) => Boolean): Self = this.set("evaluate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameter1(value: String): Self = this.set("parameter1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(
      value: (/* tagged_sentence */ js.Array[js.Array[String]], /* i */ Double, /* parameter */ String) => Boolean
    ): Self = this.set("function", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setParameter2(value: String): Self = this.set("parameter2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter2: Self = this.set("parameter2", js.undefined)
  }
}
