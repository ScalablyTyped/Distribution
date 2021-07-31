package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultTraditionalFolderOperations extends StObject {
  
  def GetTraditionalFolderContents(Folder: Double): ITraditionalFolderContents
}
object IVaultTraditionalFolderOperations {
  
  @scala.inline
  def apply(GetTraditionalFolderContents: Double => ITraditionalFolderContents): IVaultTraditionalFolderOperations = {
    val __obj = js.Dynamic.literal(GetTraditionalFolderContents = js.Any.fromFunction1(GetTraditionalFolderContents))
    __obj.asInstanceOf[IVaultTraditionalFolderOperations]
  }
  
  @scala.inline
  implicit class IVaultTraditionalFolderOperationsMutableBuilder[Self <: IVaultTraditionalFolderOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTraditionalFolderContents(value: Double => ITraditionalFolderContents): Self = StObject.set(x, "GetTraditionalFolderContents", js.Any.fromFunction1(value))
  }
}
