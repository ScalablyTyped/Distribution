package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `bulletFormat.toJSON()`. */
trait BulletFormatData extends StObject {
  
  /**
    * Specifies if the bullets in the paragraph are visible. Returns 'null' if the 'TextRange' includes text fragments with different bullet visibility values.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BulletFormatData {
  
  inline def apply(): BulletFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulletFormatData] (val x: Self) extends AnyVal {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
