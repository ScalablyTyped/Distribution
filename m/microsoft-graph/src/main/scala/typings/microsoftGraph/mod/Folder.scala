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
  
  inline def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  
  extension [Self <: Folder](x: Self) {
    
    inline def setChildCount(value: NullableOption[Double]): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
    
    inline def setChildCountNull: Self = StObject.set(x, "childCount", null)
    
    inline def setChildCountUndefined: Self = StObject.set(x, "childCount", js.undefined)
    
    inline def setView(value: NullableOption[FolderView]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
