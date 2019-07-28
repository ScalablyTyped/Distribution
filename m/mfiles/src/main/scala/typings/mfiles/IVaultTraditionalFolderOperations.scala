package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultTraditionalFolderOperations extends js.Object {
  def GetTraditionalFolderContents(Folder: Double): ITraditionalFolderContents
}

object IVaultTraditionalFolderOperations {
  @scala.inline
  def apply(GetTraditionalFolderContents: Double => ITraditionalFolderContents): IVaultTraditionalFolderOperations = {
    val __obj = js.Dynamic.literal(GetTraditionalFolderContents = js.Any.fromFunction1(GetTraditionalFolderContents))
  
    __obj.asInstanceOf[IVaultTraditionalFolderOperations]
  }
}

