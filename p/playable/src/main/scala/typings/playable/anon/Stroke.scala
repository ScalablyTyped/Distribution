package typings.playable.anon

import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroke extends StObject {
  
  def stroke(data: IThemeConfig): String
}
object Stroke {
  
  inline def apply(stroke: IThemeConfig => String): Stroke = {
    val __obj = js.Dynamic.literal(stroke = js.Any.fromFunction1(stroke))
    __obj.asInstanceOf[Stroke]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stroke] (val x: Self) extends AnyVal {
    
    inline def setStroke(value: IThemeConfig => String): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
  }
}
