package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignaturePromptInfoSelectable extends StObject {
  
  def Clone(): ISignaturePromptInfoSelectable
  
  var PromptInfos: ISignaturePromptInfos
}
object ISignaturePromptInfoSelectable {
  
  inline def apply(Clone: () => ISignaturePromptInfoSelectable, PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PromptInfos = PromptInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISignaturePromptInfoSelectable] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => ISignaturePromptInfoSelectable): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setPromptInfos(value: ISignaturePromptInfos): Self = StObject.set(x, "PromptInfos", value.asInstanceOf[js.Any])
  }
}
