package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rename extends StObject {
  
  /** The new title of the drive object. */
  var newTitle: js.UndefOr[String] = js.undefined
  
  /** The previous title of the drive object. */
  var oldTitle: js.UndefOr[String] = js.undefined
}
object Rename {
  
  @scala.inline
  def apply(): Rename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rename]
  }
  
  @scala.inline
  implicit class RenameMutableBuilder[Self <: Rename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewTitle(value: String): Self = StObject.set(x, "newTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTitleUndefined: Self = StObject.set(x, "newTitle", js.undefined)
    
    @scala.inline
    def setOldTitle(value: String): Self = StObject.set(x, "oldTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldTitleUndefined: Self = StObject.set(x, "oldTitle", js.undefined)
  }
}
