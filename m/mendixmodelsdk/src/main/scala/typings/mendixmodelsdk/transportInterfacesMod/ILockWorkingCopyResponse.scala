package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILockWorkingCopyResponse extends StObject {
  
  var merge: ILockData = js.native
  
  var previousMerge: ILockData | Null = js.native
}
object ILockWorkingCopyResponse {
  
  @scala.inline
  def apply(merge: ILockData): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
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
