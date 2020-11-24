package typings.parsimmon.mod

import typings.parsimmon.parsimmonBooleans.`true`
import typings.parsimmon.parsimmonNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessReply[T] extends Reply[T] {
  
  var expected: js.Array[String] = js.native
  
  var furthest: `-1` = js.native
  
  var index: Double = js.native
  
  var status: `true` = js.native
  
  var value: T = js.native
}
object SuccessReply {
  
  @scala.inline
  def apply[T](expected: js.Array[String], furthest: `-1`, index: Double, status: `true`, value: T): SuccessReply[T] = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessReply[T]]
  }
  
  @scala.inline
  implicit class SuccessReplyOps[Self <: SuccessReply[_], T] (val x: Self with SuccessReply[T]) extends AnyVal {
    
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
    def setExpectedVarargs(value: String*): Self = this.set("expected", js.Array(value :_*))
    
    @scala.inline
    def setExpected(value: js.Array[String]): Self = this.set("expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFurthest(value: `-1`): Self = this.set("furthest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `true`): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
