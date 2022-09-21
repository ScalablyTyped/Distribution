package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `presentation.toJSON()`. */
trait PresentationData extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
}
object PresentationData {
  
  inline def apply(): PresentationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresentationData]
  }
  
  extension [Self <: PresentationData](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
