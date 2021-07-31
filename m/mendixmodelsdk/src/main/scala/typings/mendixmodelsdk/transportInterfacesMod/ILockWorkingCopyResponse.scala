package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockWorkingCopyResponse extends StObject {
  
  var merge: ILockData
  
  var previousMerge: ILockData | Null
}
object ILockWorkingCopyResponse {
  
  @scala.inline
  def apply(merge: ILockData): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any], previousMerge = null)
    __obj.asInstanceOf[ILockWorkingCopyResponse]
  }
  
  @scala.inline
  implicit class ILockWorkingCopyResponseMutableBuilder[Self <: ILockWorkingCopyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerge(value: ILockData): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMerge(value: ILockData): Self = StObject.set(x, "previousMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousMergeNull: Self = StObject.set(x, "previousMerge", null)
  }
}
