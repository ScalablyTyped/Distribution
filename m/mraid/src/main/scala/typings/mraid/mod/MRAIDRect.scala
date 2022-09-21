package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDRect
  extends StObject
     with MRAIDPosition
     with MRAIDSize
object MRAIDRect {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): MRAIDRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRAIDRect]
  }
}
