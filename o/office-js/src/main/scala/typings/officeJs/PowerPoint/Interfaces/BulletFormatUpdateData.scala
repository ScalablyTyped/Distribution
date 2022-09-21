package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the BulletFormat object, for use in `bulletFormat.set({ ... })`. */
trait BulletFormatUpdateData extends StObject {
  
  /**
    * Specifies if the bullets in the paragraph are visible. Returns 'null' if the 'TextRange' includes text fragments with different bullet visibility values.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BulletFormatUpdateData {
  
  inline def apply(): BulletFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletFormatUpdateData]
  }
  
  extension [Self <: BulletFormatUpdateData](x: Self) {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
