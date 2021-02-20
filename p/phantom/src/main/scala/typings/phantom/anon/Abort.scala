package typings.phantom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abort extends StObject {
  
  def abort(): Unit = js.native
  
  def changeUrl(newUrl: String): Unit = js.native
  
  def setHeader(key: String, value: String): Unit = js.native
}
object Abort {
  
  @scala.inline
  def apply(abort: () => Unit, changeUrl: String => Unit, setHeader: (String, String) => Unit): Abort = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), changeUrl = js.Any.fromFunction1(changeUrl), setHeader = js.Any.fromFunction2(setHeader))
    __obj.asInstanceOf[Abort]
  }
  
  @scala.inline
  implicit class AbortMutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChangeUrl(value: String => Unit): Self = StObject.set(x, "changeUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
  }
}
