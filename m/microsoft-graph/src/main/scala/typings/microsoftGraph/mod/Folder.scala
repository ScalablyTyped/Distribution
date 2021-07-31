package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  // Number of children contained immediately within this container.
  var childCount: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // A collection of properties defining the recommended view for the folder.
  var view: js.UndefOr[NullableOption[FolderView]] = js.undefined
}
object Folder {
  
  @scala.inline
  def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildCount(value: NullableOption[Double]): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildCountNull: Self = StObject.set(x, "childCount", null)
    
    @scala.inline
    def setChildCountUndefined: Self = StObject.set(x, "childCount", js.undefined)
    
    @scala.inline
    def setView(value: NullableOption[FolderView]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewNull: Self = StObject.set(x, "view", null)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
