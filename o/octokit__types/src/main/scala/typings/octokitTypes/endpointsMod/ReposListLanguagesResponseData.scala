package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListLanguagesResponseData extends StObject {
  
  var C: Double
  
  var Python: Double
}
object ReposListLanguagesResponseData {
  
  @scala.inline
  def apply(C: Double, Python: Double): ReposListLanguagesResponseData = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], Python = Python.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListLanguagesResponseData]
  }
  
  @scala.inline
  implicit class ReposListLanguagesResponseDataMutableBuilder[Self <: ReposListLanguagesResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Double): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPython(value: Double): Self = StObject.set(x, "Python", value.asInstanceOf[js.Any])
  }
}
