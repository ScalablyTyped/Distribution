package typings.opentelemetryCore.idGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdGenerator extends js.Object {
  
  /** Returns a span ID composed of 16 lowercase hex characters. */
  def generateSpanId(): String = js.native
  
  /** Returns a trace ID composed of 32 lowercase hex characters. */
  def generateTraceId(): String = js.native
}
object IdGenerator {
  
  @scala.inline
  def apply(generateSpanId: () => String, generateTraceId: () => String): IdGenerator = {
    val __obj = js.Dynamic.literal(generateSpanId = js.Any.fromFunction0(generateSpanId), generateTraceId = js.Any.fromFunction0(generateTraceId))
    __obj.asInstanceOf[IdGenerator]
  }
  
  @scala.inline
  implicit class IdGeneratorOps[Self <: IdGenerator] (val x: Self) extends AnyVal {
    
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
    def setGenerateSpanId(value: () => String): Self = this.set("generateSpanId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateTraceId(value: () => String): Self = this.set("generateTraceId", js.Any.fromFunction0(value))
  }
}
