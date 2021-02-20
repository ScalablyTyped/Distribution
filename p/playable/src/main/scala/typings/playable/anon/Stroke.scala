package typings.playable.anon

import typings.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stroke extends StObject {
  
  def stroke(data: IThemeConfig): String = js.native
}
object Stroke {
  
  @scala.inline
  def apply(stroke: IThemeConfig => String): Stroke = {
    val __obj = js.Dynamic.literal(stroke = js.Any.fromFunction1(stroke))
    __obj.asInstanceOf[Stroke]
  }
  
  @scala.inline
  implicit class StrokeMutableBuilder[Self <: Stroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStroke(value: IThemeConfig => String): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
  }
}
